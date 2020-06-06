package com.fixitup.MainApp;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Main_Menu {

	private JFrame frame;
	private Panel_home panel_home;
	private Panel_Backitup panel_backitup;
	private Panel_ConsumerReq panel_consumerreq;
	private Panel_Downloadfiles panel_downloadfiles;
	private Panel_FinalDelivery panel_finaldelivery;
	private Panel_Newproject panel_newproject;
	private Panel_NewStaff panel_newstaff;
	private Panel_RoughCut panel_roughcut;
	private Panel_SendMessage panel_sendmessage;
	private Panel_UploadFiles panel_uploadfiles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Menu window = new Main_Menu();
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
	public Main_Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame(); 
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 874, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = new ImageIcon(this.getClass().getResource("/img1.png")).getImage();
		Image img1 = img.getScaledInstance(936, 716, java.awt.Image.SCALE_SMOOTH);
		frame.getContentPane().setLayout(null);
		
		panel_home = new Panel_home() ;
		panel_backitup = new Panel_Backitup();
		panel_consumerreq = new Panel_ConsumerReq();
		panel_downloadfiles = new Panel_Downloadfiles();
		panel_finaldelivery = new Panel_FinalDelivery();
		
		panel_newproject = new Panel_Newproject();
		panel_newstaff = new Panel_NewStaff();
		panel_roughcut = new Panel_RoughCut();
		panel_sendmessage = new Panel_SendMessage();
		panel_uploadfiles = new Panel_UploadFiles();
		
		JPanel panel_maincontent = new JPanel();
		panel_maincontent.setBounds(186, 11, 662, 546);
		frame.getContentPane().add(panel_maincontent);
		
		
		panel_maincontent.add(panel_home);
		panel_maincontent.add(panel_backitup);
		panel_maincontent.add(panel_consumerreq);
		panel_maincontent.add(panel_downloadfiles);
		panel_maincontent.add(panel_finaldelivery);
		
		panel_maincontent.add(panel_newproject);
		panel_maincontent.add(panel_newstaff);
		panel_maincontent.add(panel_roughcut);
		panel_maincontent.add(panel_sendmessage);
		panel_maincontent.add(panel_uploadfiles);
		
		menuClicked(panel_home);

		JPanel redframe = new JPanel();
		redframe.setBackground(new Color(153, 0, 51));
		redframe.setBounds(0, 0, 176, 568);
		frame.getContentPane().add(redframe);
		redframe.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(156, 58, -130, -52);
		redframe.add(panel);
		panel.setLayout(null);
		
		JPanel home = new JPanel();
		home.addMouseListener(new PanelButtonMouseAdapter(home) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_home);
			}
		});
		home.setBackground(new Color(255, 51, 51));
		home.setBounds(10, 11, 156, 28);
		redframe.add(home);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		home.add(lblNewLabel);
		
		JPanel newproject = new JPanel();
		newproject.addMouseListener(new PanelButtonMouseAdapter(newproject){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_newproject);}
			});
		newproject.setBackground(new Color(255, 51, 51));
		newproject.setBounds(10, 50, 156, 28);
		redframe.add(newproject);
		
		JLabel lblNewLabel_1 = new JLabel("New Project");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		newproject.add(lblNewLabel_1);
		
		JPanel backitup = new JPanel();
		backitup.addMouseListener(new PanelButtonMouseAdapter(backitup){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_backitup);}
			});
		backitup.setBackground(new Color(255, 51, 51));
		backitup.setBounds(10, 89, 156, 28);
		redframe.add(backitup);
		
		JLabel lblNewLabel_2 = new JLabel("Back it up");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		backitup.add(lblNewLabel_2);
		
		JPanel uploadfiles = new JPanel();
		uploadfiles.addMouseListener(new PanelButtonMouseAdapter(uploadfiles){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_uploadfiles);}
		});
		uploadfiles.setBackground(new Color(255, 51, 51));
		uploadfiles.setBounds(10, 128, 156, 28);
		redframe.add(uploadfiles);
		
		JLabel lblNewLabel_3 = new JLabel("Upload Files\r\n");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		uploadfiles.add(lblNewLabel_3);
		
		JPanel downloadfiles = new JPanel();
		downloadfiles.addMouseListener(new PanelButtonMouseAdapter(downloadfiles){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_downloadfiles);}
		});
		downloadfiles.setBackground(new Color(255, 51, 51));
		downloadfiles.setBounds(10, 167, 156, 28);
		redframe.add(downloadfiles);
		
		JLabel lblNewLabel_4 = new JLabel("Download files");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		downloadfiles.add(lblNewLabel_4);
		
		JPanel roughcut = new JPanel();
		roughcut.addMouseListener(new PanelButtonMouseAdapter(roughcut){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_roughcut);}
		});
		roughcut.setBackground(new Color(255, 51, 51));
		roughcut.setBounds(10, 206, 156, 28);
		redframe.add(roughcut);
		
		JLabel lblNewLabel_5 = new JLabel("Rough Cut");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		roughcut.add(lblNewLabel_5);
		
		JPanel sendmessage = new JPanel();
		sendmessage.addMouseListener(new PanelButtonMouseAdapter(sendmessage){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_sendmessage);}
		});
		sendmessage.setBackground(new Color(255, 51, 51));
		sendmessage.setBounds(10, 245, 156, 28);
		redframe.add(sendmessage);
		
		JLabel lblNewLabel_6 = new JLabel("Send Message");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		sendmessage.add(lblNewLabel_6);
		
		JPanel newstaff = new JPanel();
		newstaff.addMouseListener(new PanelButtonMouseAdapter(newstaff){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_newstaff);}
		});
		newstaff.setBackground(new Color(255, 51, 51));
		newstaff.setBounds(10, 284, 156, 28);
		redframe.add(newstaff);
		
		JLabel lblNewLabel_7 = new JLabel("New Staff");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		newstaff.add(lblNewLabel_7);
		
		JPanel consumer_req = new JPanel();
		consumer_req.addMouseListener(new PanelButtonMouseAdapter(consumer_req){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_consumerreq);}
		});
		consumer_req.setBackground(new Color(255, 51, 51));
		consumer_req.setBounds(10, 323, 156, 28);
		redframe.add(consumer_req);
		
		JLabel lblNewLabel_8 = new JLabel("Consumer Req.");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		consumer_req.add(lblNewLabel_8);
		
		JPanel finaldelivery = new JPanel();
		finaldelivery.addMouseListener(new PanelButtonMouseAdapter(finaldelivery){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panel_finaldelivery);}
		});
		finaldelivery.setBackground(new Color(255, 51, 51));
		finaldelivery.setBounds(10, 362, 156, 28);
		redframe.add(finaldelivery);
		
		JLabel lblNewLabel_9 = new JLabel("Final Delivery");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		finaldelivery.add(lblNewLabel_9);
		
		JPanel logout = new JPanel();
		logout.addMouseListener(new PanelButtonMouseAdapter(logout){
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Sign_Up window = new Sign_Up();
				window.frame.setVisible(true); ;}
		});
		logout.setForeground(new Color(0, 0, 0));
		logout.setBackground(new Color(255, 51, 51));
		logout.setBounds(10, 514, 156, 28);
		redframe.add(logout);
		
		JLabel lblNewLabel_10 = new JLabel("Log out");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		logout.add(lblNewLabel_10);
		
		JLabel main_image = new JLabel("image1");
		main_image.setBounds(10, 0, 848, 568);
		frame.getContentPane().add(main_image);
		
		main_image.setIcon(new ImageIcon(img1));
		frame.getContentPane().add(main_image);
		
		
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
	}

	
	public void menuClicked(JPanel panel_mouse) {
		panel_home.setVisible(false);
		panel_backitup.setVisible(false);
		panel_consumerreq.setVisible(false);
		panel_downloadfiles.setVisible(false);
		panel_finaldelivery.setVisible(false); 
		panel_newproject.setVisible(false);
		panel_newstaff.setVisible(false); 
		panel_roughcut.setVisible(false);
		panel_sendmessage.setVisible(false);
		panel_uploadfiles.setVisible(false);
		
		panel_mouse.setVisible(true);
	}

	

	class PanelButtonMouseAdapter extends MouseAdapter {
		JPanel panel_mouse;
	
		public PanelButtonMouseAdapter(JPanel panel_mouse){
			this.panel_mouse = panel_mouse;
		
			panel_mouse.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					panel_mouse.setBackground(new Color(255, 20, 20));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					panel_mouse.setBackground(new Color(255, 51, 51));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					panel_mouse.setBackground(new Color(255, 80, 80));
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					panel_mouse.setBackground(new Color(255, 20, 20));
				}
			});
	}}
}

