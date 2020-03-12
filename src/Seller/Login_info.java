package Seller;

import java.awt.EventQueue;

import javax.swing.JFrame;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Login_info {

	private JFrame frame;
	private JTable table;
	private JButton button;
	private JLabel lblLoginInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_info window = new Login_info();
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
	public Login_info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 415, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
					con.createStatement();
					
					
					PreparedStatement pst= con.prepareStatement("select Email from login_admin");
					ResultSet rs=pst.executeQuery("select Email from login_admin");
					
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
		scrollPane.setBounds(32, 92, 199, 134);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seller_options window = new Seller_options();
				frame.setVisible(false);
				window.main(null);
			}
		});
		button.setIcon(new ImageIcon(Login_info.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(32, 447, 32, 23);
		frame.getContentPane().add(button);
		
		lblLoginInfo = new JLabel("Login Info");
		lblLoginInfo.setBounds(10, 22, 158, 32);
		frame.getContentPane().add(lblLoginInfo);
	}

}
