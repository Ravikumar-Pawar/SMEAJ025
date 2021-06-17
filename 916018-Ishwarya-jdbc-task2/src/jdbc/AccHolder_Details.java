package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.ScrollPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Scrollbar;
import java.awt.Point;

public class AccHolder_Details extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccHolder_Details frame = new AccHolder_Details();
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
	public AccHolder_Details() {
		try {
			String url = "jdbc:mysql://localhost:3306/ishu";
			String uname = "root";
			String password ="ishu!";
            String query="select * from register";
            
           String[][] data=new String[200][5];
         
            Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, uname, password);
			Statement statement = connection.createStatement();
			ResultSet rs=statement.executeQuery(query);
			int j=0;
			
			
			while(rs.next())
			
			{ 
				data[j][0]=rs.getString("UNAME");
			   data[j][1]=rs.getString("email");
			   data[j][2]=rs.getString("phone");
			   data[j][3]=rs.getString("address");
			   data[j][4]=rs.getString("amount");
			  
			 j++;
			  
			}
			
			
			statement.close();
			connection.close();
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		   String[] column= {"NAME","EMAIL","PHONE","ADDRESS","AVLBALANCE"};
		   String[][] data1=new String[j][5];
		    for(int i=0;i<j;i++)
		    {
		    	data1[i][0]=data[i][0];
		    	data1[i][1]=data[i][1];
		    	data1[i][2]=data[i][2];
		    	data1[i][3]=data[i][3];
		    	data1[i][4]=data[i][4];
		    }
		    
		    JTable table = new JTable(data1,column);
		    table.setRowSelectionAllowed(false);
	        table.setBorder(new LineBorder(new Color(0, 0, 0)));
		    table.setBackground(new Color(255, 255, 153));
		    JTableHeader head=table.getTableHeader();
			head.setBackground(new Color(204, 204, 102));
		    table.setEnabled(false);
		    int x=(32*j)/2;
			table.setBounds(27,104,500,x);
			
			contentPane.add(table);
		
		
		
		
		JLabel lblNewLabel = new JLabel("ACCHOLDER DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(170, 11, 224, 14);
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setForeground(new Color(204, 204, 102));
		panel.setBackground(new Color(255, 255, 153));
		panel.setFont(new Font("Dialog", Font.PLAIN, 9));
		panel.setBounds(26, 87, 501, 25);
		contentPane.add(panel);
		
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(head,BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage a=new AdminPage();
				a.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(222, 370, 89, 23);
		contentPane.add(btnNewButton);
		
		
		} catch (Exception ex) {
			System.out.println(ex);
		}
		}
}
