package Buyer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.beans.PropertyChangeEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class My_Orders {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JButton btnOrders;
	private JButton button;
	private JLabel lblMyOrders;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_Orders window = new My_Orders();
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
	public My_Orders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 120, 437, 228);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(32, 64, 287, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnOrders = new JButton("Orders");
		btnOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					con.createStatement();
					
					
					PreparedStatement pst= con.prepareStatement("select Product_Name,Price,Type,Quantity,Total_Price from orders where Email='"+textField.getText()+"'");
					ResultSet rs=pst.executeQuery("select Product_Name,Price,Type,Quantity,Total_Price from orders where Email='"+textField.getText()+"'");
					
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
		btnOrders.setBounds(380, 71, 89, 23);
		frame.getContentPane().add(btnOrders);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buyer_Option window = new Buyer_Option();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button.setIcon(new ImageIcon(My_Orders.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(10, 367, 32, 23);
		frame.getContentPane().add(button);
		
		lblMyOrders = new JLabel("My Orders");
		lblMyOrders.setBounds(10, 22, 122, 23);
		frame.getContentPane().add(lblMyOrders);
	}
}
