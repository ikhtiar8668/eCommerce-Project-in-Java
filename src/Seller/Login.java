package Seller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login {

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
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Email");
		lblLogin.setBounds(52, 152, 60, 35);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(52, 210, 60, 35);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(122, 150, 212, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 210, 212, 38);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					Statement stmnt= con.createStatement();
					String sql="Select * from login_admin where Email='"+textField.getText()+"'and Password= '"+passwordField.getText().toString()+"'"; 
					ResultSet rs= stmnt.executeQuery(sql);
					if(rs.next()) {
						Seller_options window = new Seller_options();
						frame.setVisible(false);
						window.main(null);}
						
					else {
						
						JOptionPane.showMessageDialog(null,"Failed");}
					con.close();
					
					
				
			}catch(Exception e) {System.out.println(e);}
			}
		});
		btnLogin.setBounds(122, 275, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
