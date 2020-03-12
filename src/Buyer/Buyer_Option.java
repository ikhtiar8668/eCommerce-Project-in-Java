package Buyer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buyer_Option {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buyer_Option window = new Buyer_Option();
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
	public Buyer_Option() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 438, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnProfile = new JButton("Shop");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				All_products_buyers window = new All_products_buyers();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnProfile.setBounds(37, 100, 124, 35);
		frame.getContentPane().add(btnProfile);
		
		JButton btnLogout = new JButton("My Orders");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				My_Orders window = new My_Orders();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnLogout.setBounds(37, 146, 124, 35);
		frame.getContentPane().add(btnLogout);
		
		JButton btnLogout_1 = new JButton("Logout");
		btnLogout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Starting_window window = new Starting_window();
				frame.setVisible(false);
				window.main(null);
			}
		});
		btnLogout_1.setBounds(37, 193, 124, 35);
		frame.getContentPane().add(btnLogout_1);
	}
}
