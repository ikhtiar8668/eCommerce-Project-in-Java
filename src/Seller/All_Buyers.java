package Seller;

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
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class All_Buyers {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All_Buyers window = new All_Buyers();
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
	public All_Buyers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 629, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					con.createStatement();
					
					
					PreparedStatement pst= con.prepareStatement("select Name,Age,Phone_no,Email from buyers");
					ResultSet rs=pst.executeQuery("select Name,Age,Phone_no,Email from buyers");
					
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
		scrollPane.setBounds(29, 128, 547, 193);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblAllBuyers = new JLabel("All Buyers");
		lblAllBuyers.setBounds(29, 35, 310, 30);
		frame.getContentPane().add(lblAllBuyers);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seller_options window = new Seller_options();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.setIcon(new ImageIcon(All_Buyers.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button.setBounds(29, 348, 32, 23);
		frame.getContentPane().add(button);
	}
}
