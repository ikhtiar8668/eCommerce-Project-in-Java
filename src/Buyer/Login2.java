package Buyer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Seller.Seller_options;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login2 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 window = new Login2();
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
	public Login2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 646, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(51, 146, 72, 21);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(51, 206, 72, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(133, 139, 233, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 199, 233, 35);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					Statement stmnt= con.createStatement();
					String sql="Select * from buyers where Email='"+textField.getText()+"'and Password= '"+passwordField.getText().toString()+"'"; 
					ResultSet rs= stmnt.executeQuery(sql);
					if(rs.next()) {
						Buyer_Option window = new Buyer_Option();
						frame.setVisible(false);
						window.main(null);}
						
					else {
						
						JOptionPane.showMessageDialog(null,"Failed");}
					con.close();
					
					
				
			}catch(Exception f) {System.out.println(e);}
			}
		});
		btnLogin.setBounds(133, 270, 89, 23);
		frame.getContentPane().add(btnLogin);
	}

}
