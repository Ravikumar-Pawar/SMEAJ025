package com.mysql.jdbc.com;


// java database connectivity 
/*1. import -->java.sql
 *2.load and register driver-->Class.forName("com.mysql.cj.jdbc.Driver");
 *3.Create Connection -->connection to the database using sql library --DriverManager.getConnection(url, uname, password);
 *4.Create Statement -->Statement
 *5.Execute SQL Query -->string --statement.executeQuery(query);
 *6.process the result-->Resultset --rs.next();
 *7.Close the connection 
 */

import java.sql.*;
public class WelcomJdbc {

	public static void main(String[] args) throws Exception
	{
		
		
		String url="jdbc:mysql://localhost:3306/jdbc_training";
		String uname="root";
		String password="password";
		String query="select * from logindetails";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		
		while(rs.next())
		{
			String username = rs.getString("username");
			String pass = rs.getString("password");
			
			System.out.println("username: "+username+"\n"+"Password: "+pass+"\n\n");
			
		}
		
		
		
		st.close();
		con.close();
		
		
		
		

	}

}
