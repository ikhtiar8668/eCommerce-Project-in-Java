package Seller;

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

public class All_products {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All_products window = new All_products();
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
	public All_products() {
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
		scrollPane.setBounds(149, 77, 615, 278);
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
		textField.setBounds(893, 99, 112, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(893, 130, 112, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(893, 164, 112, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(893, 198, 112, 22);
		frame.getContentPane().add(textField_3);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(825, 103, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(825, 133, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(825, 168, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(825, 201, 46, 14);
		frame.getContentPane().add(lblType);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					Statement st= connection.createStatement();
					String query= "UPDATE `products` SET `Product_Name`='"+textField_1.getText()+"',`Price`='"+textField_2.getText()+"',`Type`='"+textField_3.getText()+"' WHERE `Product_ID`="+textField.getText()+"";
					if((st.executeUpdate(query))==1) {
						
						JOptionPane.showMessageDialog(null,"Successful");
						
						
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
		btnUpdate.setBounds(893, 250, 89, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					Statement st= connection.createStatement();
					String query= "DELETE FROM `products` WHERE `Product_ID`="+textField.getText()+"";
					if((st.executeUpdate(query))==1) {
						
						JOptionPane.showMessageDialog(null,"Successful");
						
						
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
		btnDelete.setBounds(893, 284, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seller_options window = new Seller_options();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button_4.setIcon(new ImageIcon(All_products.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button_4.setForeground(Color.DARK_GRAY);
		button_4.setBackground(Color.DARK_GRAY);
		button_4.setBounds(10, 436, 32, 23);
		frame.getContentPane().add(button_4);
	}
}
