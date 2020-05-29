package com.fixitup.MainApp;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import com.database.Database_Connector;

public class Sign_Up {

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
					Sign_Up window = new Sign_Up();
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
	public Sign_Up() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(new Color(204, 0, 51));
		frame.setBounds(100, 100, 737, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.AddActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String stdname = textField.getText();
				String password = textField_1.getText();
				
				//hjgfs
				Database_Connector.connector();
				
				if (stdname.equals("name") && password.equals("pass")) {
					System.out.printIn("Welcome"); 
				} 
				else {
					System.out.printIn("Your username or password are invalid.");
				}
		});
		btn.Login.setBounds(358, 344, 89, 23);
		frame.getContentPane().add(btnLogin);
			
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(178, 34, 34));
		lblEmail.setBounds(284, 210, 50, 29);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Pass:");
		lblPassword.setForeground(new Color(139, 0, 0));
		lblPassword.setBounds(284, 244, 50, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(358, 244, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBounds(358, 214, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel image = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/img1.png")).getImage();
		Image img1 = img.getScaledInstance(936, 716, java.awt.Image.SCALE_SMOOTH);
		
		image.setIcon(new ImageIcon(img1)); 
		image.setBounds(-74, -61, 795, 677);
		frame.getContentPane().add(image);
	}
}
