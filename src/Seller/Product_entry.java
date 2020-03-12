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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Product_entry {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product_entry window = new Product_entry();
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
	public Product_entry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 739, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(172, 92, 232, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 142, 232, 39);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 192, 232, 39);
		frame.getContentPane().add(textField_2);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(83, 104, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("Product Name");
		lblName.setBounds(83, 154, 79, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(83, 204, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(83, 254, 46, 14);
		frame.getContentPane().add(lblType);
		
		JButton btnNewButton = new JButton("Entry");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					PreparedStatement stmnt= (PreparedStatement) connection.prepareStatement("INSERT INTO products(Product_ID,Product_Name,Price,Type)VALUES(?,?,?,?)");
					stmnt.setString(1,textField.getText());
					stmnt.setString(2,textField_1.getText());
					stmnt.setString(3,textField_2.getText());
					stmnt.setString(4,comboBox.getSelectedItem().toString());
					
					
					
					
					int rs= stmnt.executeUpdate();
						
					
						if(rs>0) {
							JOptionPane.showMessageDialog(null,"Successfully Entry");
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
		btnNewButton.setBounds(172, 309, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"grosary", "device", "stationary", "accassories"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(172, 246, 184, 30);
		frame.getContentPane().add(comboBox);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seller_options window = new Seller_options();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button.setIcon(new ImageIcon(Product_entry.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(10, 440, 32, 23);
		frame.getContentPane().add(button);
	}
}
