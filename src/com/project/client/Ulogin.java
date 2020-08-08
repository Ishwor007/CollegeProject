package com.project.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.project.model.Registration;
import com.project.service.FormService;
import com.project.service.FormServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ulogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblUserLogin;
	private JTextField username;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JPasswordField password;
	private JButton btnLogin;
	private JButton btnForgetPassword;
	private JLabel lblNewUser;
	private JButton btnRegister;
	private JLabel lblBack;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ulogin frame = new Ulogin();
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
	public Ulogin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 543, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUserLogin());
		contentPane.add(getUsername());
		contentPane.add(getLblUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getPassword());
		contentPane.add(getBtnLogin());
		contentPane.add(getBtnForgetPassword());
		contentPane.add(getLblNewUser());
		contentPane.add(getBtnRegister());
		contentPane.add(getLblBack());
		contentPane.add(getLabel_1());
	}

	private JLabel getLblUserLogin() {
		if (lblUserLogin == null) {
			lblUserLogin = new JLabel("USER LOGIN");
			lblUserLogin.setFont(new Font("Dialog", Font.BOLD, 20));
			lblUserLogin.setBounds(208, 12, 136, 29);
		}
		return lblUserLogin;
	}

	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setBounds(214, 68, 191, 29);
			username.setColumns(10);
		}
		return username;
	}

	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setFont(new Font("Dialog", Font.BOLD, 15));
			lblUsername.setBounds(99, 71, 100, 22);
		}
		return lblUsername;
	}

	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPassword.setBounds(99, 114, 80, 22);
		}
		return lblPassword;
	}

	private JPasswordField getPassword() {
		if (password == null) {
			password = new JPasswordField();
			password.setBounds(212, 109, 193, 29);
		}
		return password;
	}

	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Registration r = new Registration();
					r.setUsername(username.getText());
					r.setPassword(password.getText());
					FormService fs = new FormServiceImpl();
					Registration user = fs.login(r);
					if (user != null) {
						ActivityPage ap = new ActivityPage();
						ap.userInfo(user);
						ap.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "login failed");
					}
				}
			});
			btnLogin.setBounds(95, 168, 170, 25);
		}
		return btnLogin;
	}

	private JButton getBtnForgetPassword() {
		if (btnForgetPassword == null) {
			btnForgetPassword = new JButton("Forget Password");
			btnForgetPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Changepsw().setVisible(true);
					dispose();
				}
			});
			btnForgetPassword.setBounds(292, 168, 170, 25);
		}
		return btnForgetPassword;
	}

	private JLabel getLblNewUser() {
		if (lblNewUser == null) {
			lblNewUser = new JLabel("New User:");
			lblNewUser.setForeground(Color.WHITE);
			lblNewUser.setFont(new Font("DejaVu Serif", Font.BOLD | Font.ITALIC, 20));
			lblNewUser.setBounds(151, 210, 114, 29);
		}
		return lblNewUser;
	}

	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new RForm().setVisible(true);
					dispose();
				}
			});
			btnRegister.setBounds(273, 214, 94, 25);
		}
		return btnRegister;
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
			lblBack.setForeground(Color.GREEN);
			lblBack.setFont(new Font("Dialog", Font.BOLD, 20));
			lblBack.setBounds(12, 255, 70, 29);
		}
		return lblBack;
	}

	private JLabel getLabel_1() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(12, 0, 519, 284);
			label.setIcon(new ImageIcon(new ImageIcon("/home/seetal/Downloads/photo-1500322969630-a26ab6eb64cc.webp")
					.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));

		}
		return label;
	}
}
