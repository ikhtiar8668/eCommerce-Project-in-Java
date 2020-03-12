package Seller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Change_password {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Change_password window = new Change_password();
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
	public Change_password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(69, 63, 182, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Change Password");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					Statement st= connection.createStatement();
					String query= "UPDATE `login_admin` SET `Password`='"+passwordField_1.getText()+"'WHERE `Email`='"+textField.getText()+"'and`Password`='"+passwordField.getText().toString()+"'";
					if((st.executeUpdate(query))==1) {
						
						JOptionPane.showMessageDialog(null,"Successful Changed");
						
						
					}
						
					}
				 catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(69, 178, 134, 23);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(69, 100, 182, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblEnail = new JLabel("Email");
		lblEnail.setBounds(10, 66, 46, 14);
		frame.getContentPane().add(lblEnail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 103, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(69, 134, 182, 20);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setBounds(10, 137, 46, 14);
		frame.getContentPane().add(lblNewPassword);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Seller_options window = new Seller_options();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button.setIcon(new ImageIcon(Change_password.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(10, 227, 32, 23);
		frame.getContentPane().add(button);
	}
}
