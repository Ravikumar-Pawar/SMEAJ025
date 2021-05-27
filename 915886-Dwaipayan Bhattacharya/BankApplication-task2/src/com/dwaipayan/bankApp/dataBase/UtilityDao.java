package com.dwaipayan.bankApp.dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dwaipayan.bankApp.userDetails.UserAccountDetails;
import com.dwaipayan.bankApp.userDetails.UserDetails;

public class UtilityDao {

	private  DBHandler dbHandler;
	private Connection connection;
	
	
	
	
	
	
	public void getConnection() throws ClassNotFoundException, SQLException
	{
		dbHandler = new DBHandler();
		connection = dbHandler.getDbConnection();
		
	}
	
	
	
	public UserDetails getUserDetails(UserAccountDetails usa) throws ClassNotFoundException, SQLException {
		UserDetails usd = new UserDetails();
		getConnection();
		String query = "SELECT * FROM users where username="+"'"+usa.getUserName()+"'";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next())
		{
			usd.setFirstName(resultSet.getString("firstname"));
			usd.setLastName(resultSet.getString("lastname"));
			usd.setDateOfBirth(resultSet.getString("dob"));
			usd.setEmailId(resultSet.getString("emailId"));
			usd.setPhoneNo(resultSet.getString("phoneno"));
			usd.setUserName(resultSet.getString("username"));
			usd.setPassword(resultSet.getString("password"));
		}
		
		
		
		return usd;
		
	}
	
	public String checkBalance(UserAccountDetails usa) throws ClassNotFoundException, SQLException
	{
		getConnection();
		
		String query ="SELECT availablebalance FROM account_details where username = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, usa.getUserName());
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{
			return resultSet.getString("availablebalance");
		}
		
		return null;
		
	}
	
	
	public String calculateTotalBalance(UserAccountDetails usa,String depositamt) throws NumberFormatException, ClassNotFoundException, SQLException
	{
		double presentBalance = Double.parseDouble(checkBalance(usa));
		double depositAmt = Double.parseDouble(depositamt);
		double totalAmount = presentBalance + depositAmt;
		return Double.toString(totalAmount);
		
		
	}
	
	
	public String calculateWithdrawBalance(UserAccountDetails usa,String withdrawAmt) throws NumberFormatException, ClassNotFoundException, SQLException
	{
		double presentBalance = Double.parseDouble(checkBalance(usa));
		double withdraw = Double.parseDouble(withdrawAmt);
		double totalAmount = presentBalance - withdraw;
		return Double.toString(totalAmount);
		
		
	}
	
	

	
	public boolean performDeposit(UserAccountDetails usa,String amt) throws ClassNotFoundException, SQLException
	{
		
		getConnection();
		String query = "UPDATE account_details SET availablebalance = ? "+"where username = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, calculateTotalBalance(usa,amt));
		preparedStatement.setString(2, usa.getUserName());
		int status = preparedStatement.executeUpdate();
		
		if(status >= 0 )
		{
			preparedStatement.close();
			return true;
		}
		else 
		{
			return false;
		}
		
	
	}
	
	
	
	public boolean performWithdrawal(UserAccountDetails usa,String amt) throws ClassNotFoundException, SQLException
	{
		if(Double.parseDouble(amt)<=Double.parseDouble(checkBalance(usa)))
		{
		getConnection();
		String query = "UPDATE account_details SET availablebalance = ? "+"where username = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, calculateWithdrawBalance(usa,amt));
		preparedStatement.setString(2, usa.getUserName());
		int status = preparedStatement.executeUpdate();
		
		if(status >= 0 )
		{
			preparedStatement.close();
			return true;
		}
		else 
		{
			return false;
		}
		}
		else
		{
			return false;
		}
		
	
	}
	
	

}
