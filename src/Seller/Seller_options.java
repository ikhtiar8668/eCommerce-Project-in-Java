package Seller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Buyer.All_products_buyers;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Seller_options {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seller_options window = new Seller_options();
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
	public Seller_options() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 305, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAllBuyers = new JButton("All Buyers");
		btnAllBuyers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				All_Buyers window = new All_Buyers();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnAllBuyers.setBounds(46, 119, 183, 23);
		frame.getContentPane().add(btnAllBuyers);
		
		JButton btnCreateTable = new JButton("Create Table");
		btnCreateTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Table_create window = new Table_create();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnCreateTable.setBounds(46, 153, 183, 23);
		frame.getContentPane().add(btnCreateTable);
		
		JButton btnAllProducts = new JButton("All Products");
		btnAllProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				All_products window = new All_products();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnAllProducts.setBounds(46, 187, 183, 23);
		frame.getContentPane().add(btnAllProducts);
		
		JButton btnLoginInfo = new JButton("Login Info");
		btnLoginInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_info window = new Login_info();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnLoginInfo.setBounds(46, 221, 183, 23);
		frame.getContentPane().add(btnLoginInfo);
		
		JButton btnProductEntry = new JButton("Product Entry");
		btnProductEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Product_entry window = new Product_entry();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnProductEntry.setBounds(46, 255, 183, 23);
		frame.getContentPane().add(btnProductEntry);
		
		JButton btnProductEdit = new JButton("Logout");
		btnProductEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login window = new Login();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnProductEdit.setBounds(46, 392, 183, 23);
		frame.getContentPane().add(btnProductEdit);
		
		JButton btnOrders = new JButton("Orders");
		btnOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Orders window = new Orders();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnOrders.setBounds(46, 289, 183, 23);
		frame.getContentPane().add(btnOrders);
		
		JLabel lblOption = new JLabel("Option");
		lblOption.setBounds(29, 29, 125, 33);
		frame.getContentPane().add(lblOption);
		
		JButton btnAddAdminLogin = new JButton("Add Admin Login Info");
		btnAddAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add_login_info window = new Add_login_info();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnAddAdminLogin.setBounds(46, 324, 183, 23);
		frame.getContentPane().add(btnAddAdminLogin);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Change_password window = new Change_password();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnChangePassword.setBounds(46, 358, 183, 23);
		frame.getContentPane().add(btnChangePassword);
	}
}
