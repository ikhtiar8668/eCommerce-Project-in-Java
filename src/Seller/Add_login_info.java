package Seller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
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

public class Add_login_info {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_login_info window = new Add_login_info();
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
	public Add_login_info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(137, 115, 266, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 166, 266, 32);
		frame.getContentPane().add(textField_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(39, 124, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(39, 175, 66, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblAddLoginInfo = new JLabel("Add Login Info");
		lblAddLoginInfo.setBounds(39, 33, 131, 14);
		frame.getContentPane().add(lblAddLoginInfo);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					PreparedStatement stmnt= (PreparedStatement) connection.prepareStatement("INSERT INTO login_admin(Email,Password)VALUES(?,?)");
					stmnt.setString(1,textField.getText());
					stmnt.setString(2,textField_1.getText());
					
					
					
					
					int rs= stmnt.executeUpdate();
						
					
						if(rs>0) {
							JOptionPane.showMessageDialog(null,"Successfully Addes");
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
		btnAdd.setBounds(137, 216, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Seller_options window = new Seller_options();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button.setIcon(new ImageIcon(Add_login_info.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(10, 353, 32, 23);
		frame.getContentPane().add(button);
	}
}
