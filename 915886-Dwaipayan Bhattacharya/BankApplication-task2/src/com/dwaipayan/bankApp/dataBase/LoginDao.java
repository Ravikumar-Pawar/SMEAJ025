package com.dwaipayan.bankApp.dataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class LoginDao {
	
	private DBHandler dbHandler;
	private Connection connection;
	private PreparedStatement prepareStatement;
	
	
	public boolean performLogin(String username, String password) throws ClassNotFoundException, SQLException
	{
		dbHandler = new DBHandler();
		connection = dbHandler.getDbConnection();
		String query = "SELECT * FROM users where username="+"'"+username+"'"+ "AND " + "password" + "="+"'"+password+"'";
		prepareStatement = connection.prepareStatement(query);
		ResultSet resultSet = prepareStatement.executeQuery();
		if(resultSet.next())
		{   
			
			return true;
			
		}
		
		return false;
		
	}
	

}
