package com.project.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//First page

public class ChoosePage extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogin;
	private JButton btnUser;
	private JButton btnAdmin;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoosePage frame = new ChoosePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChoosePage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblLogin());
		contentPane.add(getBtnUser());
		contentPane.add(getBtnAdmin());
		contentPane.add(getLabel());
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("LOGIN");
			lblLogin.setFont(new Font("Dialog", Font.BOLD, 20));
			lblLogin.setBounds(182, 37, 70, 24);
		}
		return lblLogin;
	}
	private JButton getBtnUser() {
		if (btnUser == null) {
			btnUser = new JButton("USER");
			btnUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					  new Ulogin().setVisible(true);
					  dispose();
				}
			});
			btnUser.setBackground(new Color(240, 255, 255));
			btnUser.setForeground(new Color(148, 0, 211));
			btnUser.setFont(new Font("Dialog", Font.BOLD, 18));
			btnUser.setBounds(110, 89, 234, 50);
		}
		return btnUser;
	}
	private JButton getBtnAdmin() {
		if (btnAdmin == null) {
			btnAdmin = new JButton("ADMIN");
			btnAdmin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		           new AdminLogin().setVisible(true);
					dispose();
				}
			});
			btnAdmin.setBackground(new Color(0, 255, 255));
			btnAdmin.setForeground(new Color(153, 50, 204));
			btnAdmin.setFont(new Font("Dialog", Font.BOLD, 20));
			btnAdmin.setBounds(110, 152, 234, 50);
		}
		return btnAdmin;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(12, 0, 428, 270);
			label.setIcon(new ImageIcon(new ImageIcon("/home/seetal/Downloads/index.jpeg").getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
			
		}
		return label;
	}
}
