package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Withdraw extends JFrame {
	static String url = "jdbc:mysql://localhost:3306/divya";
	static String uname = "root";
	static String pass ="Divya02!";
	private JPanel contentPane;
    int amount,with;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Withdraw() {
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Enter the amount to withdraw");
		label.setForeground(new Color(188, 143, 143));
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setAlignment(Label.CENTER);
		label.setBounds(56, 25, 305, 22);
		contentPane.add(label);
		
		TextField textField = new TextField();
		textField.setBounds(56, 65, 244, 22);
		contentPane.add(textField);
    
		//Label label_1 = new Label("");
		 //Label label_1_1 = new Label("");
		//Label label_2 = new Label("");
		
		 
		Button button = new Button("WithDraw");
		button.setForeground(new Color(255, 105, 180));
		button.setBackground(new Color(255, 245, 238));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 with=Integer.parseInt(textField.getText());
			String result=(String)JOptionPane.showInputDialog(null,null, "Enter your password ",JOptionPane.PLAIN_MESSAGE,null,null,null);
			try{
					Class.forName("com.mysql.cj.jdbc.Driver");
				     Connection connection = DriverManager.getConnection(url, uname, pass);
				    String accname=Login.getAccName();
				    Statement statement = connection.createStatement();
				    String query="select pass,amount from register where UNAME='"+accname+"'";
				    ResultSet rs=statement.executeQuery(query);
				    rs.next();
				    amount=rs.getInt("amount");
				   String pass=rs.getString("pass");
				   if(result.equals(pass))
				   {
				    if(with<amount)
				        {  amount=amount-with;
				          Label label_1 = new Label("Rs."+with+" withdrawn successfully!");
				          label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
				  		  label_1.setForeground(new Color(233, 150, 122));
				  	      label_1.setBounds(55, 178, 346, 22);
				  	       contentPane.add(label_1);
				         
				           Label label_1_1 = new Label("Available Balance "+amount);
				           label_1_1.setForeground(new Color(233, 150, 122));
						   label_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
				           label_1_1.setBounds(56, 206, 327, 22);
				            contentPane.add(label_1_1);
					      
					       PreparedStatement p=connection.prepareStatement("update register set amount='"+amount+"' where UNAME='"+accname+"'");
				           p.executeUpdate();
				           String query1="insert into transaction (acc_name,with_draw,avbl_amount,trans_date) values('"+accname+"','"+with+"','"+amount+"','"+java.time.LocalDate.now()+"')";
					       statement.executeUpdate(query1);
				           
					    }
				  else
				     { Label label_2 = new Label("Enter Valid amount!! Balance Available: " +amount); 
				     label_2.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
			         label_2.setForeground(new Color(233, 150, 122));
					 label_2.setBounds(56, 150, 356, 22);
					 contentPane.add(label_2);
					 
					 				}
				   }
				   else {
					   JOptionPane.showMessageDialog(null, "Enter Valid password");
				   }
			  }
			catch (Exception ex) 
			{
					System.out.println(ex);
			}
				
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBounds(332, 65, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("LOGOUT");
		button_1.setForeground(new Color(255, 20, 147));
		button_1.setBackground(new Color(255, 245, 238));
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBounds(230, 105, 70, 22);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				Login j=new Login();
				j.setVisible(true);
			}
		});
		
		Button button_2 = new Button("BACK");
		button_2.setForeground(new Color(255, 105, 180));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transaction t=new Transaction();
				t.setVisible(true);
			}
		}); 
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setBackground(new Color(255, 245, 238));
		button_2.setBounds(56, 105, 70, 22);
		contentPane.add(button_2);
				
		
		
	}

}
