package com.dwaipayan.bankApp.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler extends DBConfig {
        
	Connection dbConnection;
	
	public Connection getDbConnection() throws ClassNotFoundException, SQLException
	{
		String connectionString = "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPass);
		
		return dbConnection;
	}
	
}
