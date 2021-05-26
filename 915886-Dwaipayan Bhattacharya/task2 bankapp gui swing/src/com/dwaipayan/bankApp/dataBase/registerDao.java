package com.dwaipayan.bankApp.dataBase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.dwaipayan.bankApp.userDetails.UserDetails;

public class registerDao {
	
	private DBHandler dbHandler;
	private Connection connection;
	private PreparedStatement prepareStatement;
	
	
	public String performRegister(UserDetails userdetails ) throws ClassNotFoundException, SQLException
	{
		dbHandler = new DBHandler();
		connection = dbHandler.getDbConnection();
		try {
		String insert = "INSERT INTO users(firstname,lastname,phoneno,dob,username,password,emailId)"+"VALUES(?,?,?,?,?,?,?)";
		prepareStatement = connection.prepareStatement(insert);
		prepareStatement.setString(1, userdetails.getFirstName());
		
		
		prepareStatement.setString(2, userdetails.getLastName());
		
		
		prepareStatement.setString(3, userdetails.getPhoneNo());
	
		
	// Convert JAVA date to SQL date
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = sdf.parse(userdetails.getDateOfBirth());
		Date sqlDate = new Date(date.getTime());
		
		
		
		
		
		prepareStatement.setDate(4,sqlDate);
		
		
		prepareStatement.setString(5, userdetails.getUserName());
		
		prepareStatement.setString(6, userdetails.getPassword());

		prepareStatement.setString(7, userdetails.getEmailId());
	
		prepareStatement.executeUpdate();
		return "New User Registered Successfully!";
		}
		catch(Exception e)
		{
			
		    System.out.println(e.getMessage());
		    return "Exception Occured";
		}
		
		
		
		
	}
	
	
	
	

}
