package com.dwaipayan.bankApp.dataBase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.dwaipayan.bankApp.userDetails.UserDetails;

public class registerDao {
	
	private DBHandler dbHandler;
	private Connection connection;
	private PreparedStatement prepareStatement;
	private PreparedStatement prepareStatement1;
	
	
	
	public boolean checkUserName(String userName) throws ClassNotFoundException, SQLException {
		dbHandler = new DBHandler();
		connection = dbHandler.getDbConnection();
		String query = "SELECT * FROM users WHERE username = ?";
		prepareStatement = connection.prepareStatement(query);
		prepareStatement.setString(1, userName);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next())
		{
			if(resultSet.getString("username").equals(userName)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	public boolean checkEmailId(String email) throws ClassNotFoundException, SQLException {
		dbHandler = new DBHandler();
		connection = dbHandler.getDbConnection();
		String query = "SELECT * FROM users WHERE emailId = ?";
		prepareStatement = connection.prepareStatement(query);
		prepareStatement.setString(1, email);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next())
		{
			if(resultSet.getString("emailId").equals(email)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	public boolean checkPhone(String phone) throws ClassNotFoundException, SQLException {
		dbHandler = new DBHandler();
		connection = dbHandler.getDbConnection();
		String query = "SELECT * FROM users WHERE phoneno = ?";
		prepareStatement = connection.prepareStatement(query);
		prepareStatement.setString(1, phone);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next())
		{
			if(resultSet.getString("phoneno").equals(phone)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public String performRegister(UserDetails userdetails ) throws ClassNotFoundException, SQLException
	{
		dbHandler = new DBHandler();
		connection = dbHandler.getDbConnection();
		try {
		String insert = "INSERT INTO users(firstname,lastname,phoneno,dob,username,password,emailId)"+"VALUES(?,?,?,?,?,?,?)";
		String insert1 = "INSERT INTO account_details(accountnumber,availablebalance, username)"+"VALUES(?,?,?)";
		prepareStatement = connection.prepareStatement(insert);
		prepareStatement1 = connection.prepareStatement(insert1);
		
		prepareStatement1.setString(1, userdetails.getAccountNumber());
		prepareStatement1.setString(2, "0");
		prepareStatement.setString(1, userdetails.getFirstName());
		
		
		prepareStatement.setString(2, userdetails.getLastName());
		
		
		prepareStatement.setString(3, userdetails.getPhoneNo());
	
		
	// Convert JAVA date to SQL date
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = sdf.parse(userdetails.getDateOfBirth());
		Date sqlDate = new Date(date.getTime());
		
		
		
		
		
		prepareStatement.setDate(4,sqlDate);
		
		
		prepareStatement.setString(5, userdetails.getUserName());
		prepareStatement1.setString(3, userdetails.getUserName());
		
		prepareStatement.setString(6, userdetails.getPassword());

		prepareStatement.setString(7, userdetails.getEmailId());
	
		prepareStatement.executeUpdate();
		prepareStatement1.executeUpdate();
		return "New User Registered Successfully!";
		}
		catch(Exception e)
		{
			
		    System.out.println(e.getMessage());
		    return "Exception Occured";
		}
		
		
		
		
	}
	
	
	
	

}
