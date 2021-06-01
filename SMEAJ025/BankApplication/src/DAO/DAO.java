package DAO;
import Dashboard.Dashboard;

import javax.swing.*;
import java.sql.*;

public class DAO extends JFrame {
    public void login(String userName,String password){
        try {
            boolean userFound=false;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "password");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from bank where username='" + userName + "'");

                    while (resultSet.next()) {
                        userFound = true;
                        if (resultSet.getString("password").equals(password)) {
                            System.out.println("Starting dashboard");
                            Dashboard dashboard = new Dashboard("Dashboard",resultSet.getString("name"),resultSet.getFloat("balance"));
                            dashboard.setVisible(true);
                            dashboard.setSize(400,400);
                        } else {
                            System.out.println("Wrong password");
                        }

                    }

                if(userFound==false) {

                    System.out.println("No user found");
                }


        }
      catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void createAccount(String userName,String name,String password){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "password");
            PreparedStatement preparedStatement = conn.prepareStatement("insert into bank values(?,?,?,?)");
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,password);
            preparedStatement.setFloat(4,0);
            preparedStatement.executeUpdate();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
