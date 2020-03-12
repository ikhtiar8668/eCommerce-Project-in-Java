package Seller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Table_create {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_create window = new Table_create();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Table_create() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 435, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGrosary = new JButton("Products");
		btnGrosary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection1= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					PreparedStatement stmnt1= (PreparedStatement) connection1.prepareStatement("CREATE TABLE products(Product_ID int primary key,Product_Name varchar(50),Price int,Type varchar(25))");
					
					
					
					int rs1= stmnt1.executeUpdate();
						
					
						if(rs1>0) {
							//JOptionPane.showMessageDialog(null,"Successful");
							//label_1.setText("Successfully signed up. Login for go next step");
							
						}
						else {
							JOptionPane.showMessageDialog(null,"Successful");
						}
						
						
						
						
					
					
					
								
					
					
					
					
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		btnGrosary.setBounds(61, 111, 99, 23);
		frame.getContentPane().add(btnGrosary);
		
		JButton btnStationary = new JButton("Buyer");
		btnStationary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection1= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					PreparedStatement stmnt1= (PreparedStatement) connection1.prepareStatement("CREATE TABLE buyers(Name varchar(50),Age int,Phone_no varchar(15),Email varchar(50) primary key,Password varchar(20))");
					
					
					
					int rs1= stmnt1.executeUpdate();
						
					
						if(rs1>0) {
							//JOptionPane.showMessageDialog(null,"Successful");
							//label_1.setText("Successfully signed up. Login for go next step");
							
						}
						else {
							JOptionPane.showMessageDialog(null,"Successful");
						}
						
						
						
						
					
					
					
								
					
					
					
					
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		btnStationary.setBounds(61, 142, 99, 23);
		frame.getContentPane().add(btnStationary);
		
		JButton btnDevice = new JButton("Login Info");
		btnDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection1= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					PreparedStatement stmnt1= (PreparedStatement) connection1.prepareStatement("CREATE TABLE login_admin(Email varchar(50),Password varchar(20))");
					
					
					
					int rs1= stmnt1.executeUpdate();
						
					
						if(rs1>0) {
							//JOptionPane.showMessageDialog(null,"Successful");
							//label_1.setText("Successfully signed up. Login for go next step");
							
						}
						else {
							JOptionPane.showMessageDialog(null,"Successful");
						}
						
						
						
						
					
					
					
								
					
					
					
					
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		btnDevice.setBounds(61, 176, 99, 23);
		frame.getContentPane().add(btnDevice);
		
		JButton btnOrderList = new JButton("Order List");
		btnOrderList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection1= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					PreparedStatement stmnt1= (PreparedStatement) connection1.prepareStatement("CREATE TABLE orders(Product_ID int,Product_Name Varchar(50),Price int,Type varchar(25),Quantity int,Email varchar(50),Total_Price int,foreign key(Product_ID) references products(Product_ID),foreign key(Email) references buyers(Email))");
					
					
					
					int rs1= stmnt1.executeUpdate();
						
					
						if(rs1>0) {
							//JOptionPane.showMessageDialog(null,"Successful");
							//label_1.setText("Successfully signed up. Login for go next step");
							
						}
						else {
							JOptionPane.showMessageDialog(null,"Successful");
						}
						
						
										
					
					
					
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		btnOrderList.setBounds(61, 210, 99, 23);
		frame.getContentPane().add(btnOrderList);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seller_options window = new Seller_options();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button.setIcon(new ImageIcon(Table_create.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(10, 290, 32, 23);
		frame.getContentPane().add(button);
		
		JLabel lblCreateTable = new JLabel("Create Table");
		lblCreateTable.setBounds(29, 31, 111, 23);
		frame.getContentPane().add(lblCreateTable);
	}

}
