package com.project.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//admin login page

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JTextField username;
	private JLabel lblPassword;
	private JPasswordField password;
	private JLabel lblAdminLogin;
	private JButton btnLogin;
	private JLabel lblBack;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getPassword());
		contentPane.add(getLblAdminLogin());
		contentPane.add(getBtnLogin());
		contentPane.add(getLblBack());
		contentPane.add(getLabel_1());
	}

	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setFont(new Font("Dialog", Font.BOLD, 20));
			lblUsername.setBounds(42, 84, 123, 31);
		}
		return lblUsername;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField("seetal");
			username.setBounds(177, 88, 206, 27);
			username.setColumns(10);
		}
		return username;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Dialog", Font.BOLD, 20));
			lblPassword.setBounds(42, 127, 123, 33);
		}
		return lblPassword;
	}
	private JPasswordField getPassword() {
		if (password == null) {
			password = new JPasswordField("seetal");
			password.setBounds(177, 130, 206, 31);
		}
		return password;
	}
	private JLabel getLblAdminLogin() {
		if (lblAdminLogin == null) {
			lblAdminLogin = new JLabel("Admin Login");
			lblAdminLogin.setFont(new Font("Dialog", Font.BOLD, 18));
			lblAdminLogin.setBounds(137, 29, 139, 25);
		}
		return lblAdminLogin;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(username.getText().equals("seetal")&&password.getText().equals("seetal")) {
						new Table().setVisible(true);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Admin authentication failed");
					}
				}
			});
			btnLogin.setBounds(159, 183, 117, 25);
		}
		return btnLogin;
	}
	private JLabel getLblBack() {
		if (lblBack == null) {
			lblBack = new JLabel("Back");
			lblBack.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new ChoosePage().setVisible(true);
					dispose();
				}
			});
			lblBack.setFont(new Font("Dialog", Font.BOLD, 15));
			lblBack.setBounds(382, 0, 56, 27);
		}
		return lblBack;
	}
	private JLabel getLabel_1() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(12, 0, 426, 258);
			label.setIcon(new ImageIcon(new ImageIcon("/home/seetal/Downloads/p-photo-739407.jpeg").getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
			
		}
		return label;
	}
}
