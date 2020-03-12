package Buyer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Create_Account {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblCreateAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_Account window = new Create_Account();
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
	public Create_Account() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(45, 141, 98, 24);
		frame.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(45, 195, 98, 24);
		frame.getContentPane().add(lblAge);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setBounds(45, 249, 98, 24);
		frame.getContentPane().add(lblPhoneNo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(45, 297, 98, 24);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(45, 351, 98, 24);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 143, 208, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 197, 208, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(136, 251, 208, 29);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(136, 299, 208, 29);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(136, 346, 208, 29);
		frame.getContentPane().add(textField_5);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					PreparedStatement stmnt= (PreparedStatement) connection.prepareStatement("INSERT INTO buyers(Name,Age,Phone_no,Email,Password)VALUES(?,?,?,?,?)");
					stmnt.setString(1,textField_1.getText());
					stmnt.setString(2,textField_2.getText());
					stmnt.setString(3,textField_3.getText());
					stmnt.setString(4,textField_4.getText());
					stmnt.setString(5,textField_5.getText());
					
					
					
					int rs= stmnt.executeUpdate();
						
					
						if(rs>0) {
							JOptionPane.showMessageDialog(null,"Successfully signed up");
							//label_1.setText("Successfully signed up. Login for go next step");
						}
						else {
							JOptionPane.showMessageDialog(null,"Failed");
						}
						
						
						stmnt.close();
						connection.close();
						
					
					
					
								
					
					
					
					
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		btnCreate.setBounds(136, 405, 89, 23);
		frame.getContentPane().add(btnCreate);
		
		lblCreateAccount = new JLabel("Create Account");
		lblCreateAccount.setBounds(45, 46, 213, 29);
		frame.getContentPane().add(lblCreateAccount);
	}

}
