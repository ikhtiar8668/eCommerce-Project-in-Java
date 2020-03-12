package Buyer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.beans.PropertyChangeEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class All_products_buyers {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All_products_buyers window = new All_products_buyers();
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
	public All_products_buyers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1031, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Grosary");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					con.createStatement();
					
					
					PreparedStatement pst= con.prepareStatement("select * from products where Type='grosary' ");
					ResultSet rs=pst.executeQuery("select * from products where Type='grosary' ");
					
					ResultSetMetaData rsdata= rs.getMetaData();
					
					int columns= rsdata.getColumnCount();
					DefaultTableModel dtm= new DefaultTableModel();
					Vector columns_name= new Vector();
					Vector data_rows= new Vector();
					
					for(int i=1; i<=columns;i++) {
						columns_name.addElement(rsdata.getColumnName(i));
						
					}
					dtm.setColumnIdentifiers(columns_name);
					while(rs.next()) {
						data_rows= new Vector();
						for(int j=1;j<=columns;j++) {
							data_rows.addElement(rs.getString(j));
							
						}
						dtm.addRow(data_rows);
					}
					table.setModel(dtm);
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
				
			}
		});
		button.setBounds(10, 98, 129, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Stationary");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					con.createStatement();
					
					
					PreparedStatement pst= con.prepareStatement("select * from products where Type='stationary' ");
					ResultSet rs=pst.executeQuery("select * from products where Type='stationary' ");
					
					ResultSetMetaData rsdata= rs.getMetaData();
					
					int columns= rsdata.getColumnCount();
					DefaultTableModel dtm= new DefaultTableModel();
					Vector columns_name= new Vector();
					Vector data_rows= new Vector();
					
					for(int i=1; i<=columns;i++) {
						columns_name.addElement(rsdata.getColumnName(i));
						
					}
					dtm.setColumnIdentifiers(columns_name);
					while(rs.next()) {
						data_rows= new Vector();
						for(int j=1;j<=columns;j++) {
							data_rows.addElement(rs.getString(j));
							
						}
						dtm.addRow(data_rows);
					}
					table.setModel(dtm);
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		button_1.setBounds(10, 129, 129, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Device");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					con.createStatement();
					
					
					PreparedStatement pst= con.prepareStatement("select * from products where Type='device' ");
					ResultSet rs=pst.executeQuery("select * from products where Type='device' ");
					
					ResultSetMetaData rsdata= rs.getMetaData();
					
					int columns= rsdata.getColumnCount();
					DefaultTableModel dtm= new DefaultTableModel();
					Vector columns_name= new Vector();
					Vector data_rows= new Vector();
					
					for(int i=1; i<=columns;i++) {
						columns_name.addElement(rsdata.getColumnName(i));
						
					}
					dtm.setColumnIdentifiers(columns_name);
					while(rs.next()) {
						data_rows= new Vector();
						for(int j=1;j<=columns;j++) {
							data_rows.addElement(rs.getString(j));
							
						}
						dtm.addRow(data_rows);
					}
					table.setModel(dtm);
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		button_2.setBounds(10, 163, 129, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Accassories");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					con.createStatement();
					
					
					PreparedStatement pst= con.prepareStatement("select * from products where Type='accassories' ");
					ResultSet rs=pst.executeQuery("select * from products where Type='accassories' ");
					
					ResultSetMetaData rsdata= rs.getMetaData();
					
					int columns= rsdata.getColumnCount();
					DefaultTableModel dtm= new DefaultTableModel();
					Vector columns_name= new Vector();
					Vector data_rows= new Vector();
					
					for(int i=1; i<=columns;i++) {
						columns_name.addElement(rsdata.getColumnName(i));
						
					}
					dtm.setColumnIdentifiers(columns_name);
					while(rs.next()) {
						data_rows= new Vector();
						for(int j=1;j<=columns;j++) {
							data_rows.addElement(rs.getString(j));
							
						}
						dtm.addRow(data_rows);
					}
					table.setModel(dtm);
				} catch (SQLException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				} catch (ClassNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		button_3.setBounds(10, 197, 129, 23);
		frame.getContentPane().add(button_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(149, 77, 520, 278);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i= table.getSelectedRow();
				TableModel model = table.getModel();
				textField.setText(model.getValueAt(i,0).toString());
				textField_1.setText(model.getValueAt(i,1).toString());
				textField_2.setText(model.getValueAt(i,2).toString());
				textField_3.setText(model.getValueAt(i,3).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(749, 99, 256, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(749, 130, 256, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(749, 164, 256, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(749, 198, 256, 22);
		frame.getContentPane().add(textField_3);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(693, 102, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(693, 133, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(693, 167, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(693, 201, 46, 14);
		frame.getContentPane().add(lblType);
		
		JButton btnUpdate = new JButton("Order");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one= Integer.parseInt(textField_2.getText());
				int two= Integer.parseInt(textField_4.getText());
				String Ans=String.valueOf(one*two);
				textField_6.setText(Ans);
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					PreparedStatement stmnt= (PreparedStatement) connection.prepareStatement("INSERT INTO orders(Product_ID,Product_Name,Price,Type,Quantity,Email,Total_Price)VALUES(?,?,?,?,?,?,?)");
					stmnt.setString(1,textField.getText());
					stmnt.setString(2,textField_1.getText());
					stmnt.setString(3,textField_2.getText());
					stmnt.setString(4,textField_3.getText());
					stmnt.setString(5,textField_4.getText());
					stmnt.setString(6,textField_5.getText());
					stmnt.setString(7,textField_6.getText());
					
					
					
					int rs= stmnt.executeUpdate();
						
					
						if(rs>0) {
							JOptionPane.showMessageDialog(null,"Successfully Ordered");
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
		btnUpdate.setBounds(749, 365, 89, 23);
		frame.getContentPane().add(btnUpdate);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(749, 231, 61, 22);
		frame.getContentPane().add(textField_4);
		
		JLabel lblEmail = new JLabel("Quantity");
		lblEmail.setBounds(693, 235, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(749, 264, 256, 22);
		frame.getContentPane().add(textField_5);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setBounds(693, 268, 46, 14);
		frame.getContentPane().add(lblEmail_1);
		
		JLabel lblTotalPrice = new JLabel("Total Price");
		lblTotalPrice.setBounds(834, 235, 89, 14);
		frame.getContentPane().add(lblTotalPrice);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(905, 231, 100, 22);
		frame.getContentPane().add(textField_6);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buyer_Option window = new Buyer_Option();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button_4.setIcon(new ImageIcon(All_products_buyers.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button_4.setForeground(Color.DARK_GRAY);
		button_4.setBackground(Color.DARK_GRAY);
		button_4.setBounds(10, 436, 32, 23);
		frame.getContentPane().add(button_4);
	}
}
