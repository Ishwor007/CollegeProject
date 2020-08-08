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
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Changepsw extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JTextField username;
	private JLabel lblPhone;
	private JTextField phnorem;
	private JButton btnConfirm;
	private JLabel lblBack;
	private JLabel lblPassword;
	private JPasswordField npassword;
	private JLabel lblConfirmPassword;
	private JPasswordField cpassword;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Changepsw frame = new Changepsw();
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
	public Changepsw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getUsername());
		contentPane.add(getLblPhone());
		contentPane.add(getPhnorem());
		contentPane.add(getBtnConfirm());
		contentPane.add(getLblBack());
		contentPane.add(getLabel_1());
		contentPane.add(getNpassword());
		contentPane.add(getLabel_2());
		contentPane.add(getCpassword());
		contentPane.add(getLabel_3());
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setForeground(Color.WHITE);
			lblUsername.setFont(new Font("Dialog", Font.BOLD, 14));
			lblUsername.setBounds(75, 40, 94, 24);
		}
		return lblUsername;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setBounds(187, 41, 223, 24);
			username.setColumns(10);
		}
		return username;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone/Email");
			lblPhone.setForeground(Color.WHITE);
			lblPhone.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPhone.setBounds(66, 72, 110, 24);
		}
		return lblPhone;
	}
	private JTextField getPhnorem() {
		if (phnorem == null) {
			phnorem = new JTextField();
			phnorem.setBounds(187, 73, 223, 24);
			phnorem.setColumns(10);
		}
		return phnorem;
	}
	private JButton getBtnConfirm() {
		if (btnConfirm == null) {
			btnConfirm = new JButton("Confirm");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Registration r=new Registration();
					r.setUsername(username.getText());
					r.setEmail(phnorem.getText());
					r.setPhone(phnorem.getText());
					r.setPassword(npassword.getText());
					r.setConfirmpassword(cpassword.getText());
					FormService f=new FormServiceImpl();
					if(!f.ConfirmUsernameAndPhone(r)) {
							JOptionPane.showMessageDialog(null, "Invalid username/phone");
					}
					else if(f.UpdatePassword(r)) {
				      if(r.getPassword().equals(r.getConfirmpassword())) {
						JOptionPane.showMessageDialog(null, "password changed");
						dispose();
						new Ulogin().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "password didn't matched");
						}
					
					} 
					  }
				
			});
			btnConfirm.setBounds(170, 188, 117, 25);
		}
		return btnConfirm;
	}
	private JLabel getLblBack() {
		if (lblBack == null) {
			lblBack = new JLabel("Back");
			lblBack.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Ulogin().setVisible(true);
					dispose();
				}
			});
			lblBack.setFont(new Font("Dialog", Font.BOLD, 15));
			lblBack.setBounds(12, 0, 70, 24);
		}
		return lblBack;
	}
	private JLabel getLabel_1() {
		if (lblPassword == null) {
			lblPassword = new JLabel("new password");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPassword.setBounds(50, 108, 122, 28);
		}
		return lblPassword;
	}
	private JPasswordField getNpassword() {
		if (npassword == null) {
			npassword = new JPasswordField();
			npassword.setBounds(187, 109, 223, 24);
		}
		return npassword;
	}
	private JLabel getLabel_2() {
		if (lblConfirmPassword == null) {
			lblConfirmPassword = new JLabel("confirm password");
			lblConfirmPassword.setForeground(Color.WHITE);
			lblConfirmPassword.setFont(new Font("Dialog", Font.BOLD, 15));
			lblConfirmPassword.setBounds(24, 148, 152, 28);
		}
		return lblConfirmPassword;
	}
	private JPasswordField getCpassword() {
		if (cpassword == null) {
			cpassword = new JPasswordField();
			cpassword.setBounds(187, 145, 223, 23);
		}
		return cpassword;
	}
	private JLabel getLabel_3() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(12, -22, 426, 280);
			label.setIcon(new ImageIcon(new ImageIcon("/home/seetal/Downloads/index3.webp").getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
			
		}
		return label;
	}
}
