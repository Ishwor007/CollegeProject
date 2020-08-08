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

import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

import com.project.model.Registration;
import com.project.service.FormService;
import com.project.service.FormServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class UpdateForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JTextField username;
	private JLabel lblPassword;
	private JPasswordField password;
	private JLabel lblFirstName;
	private JTextField fname;
	private JLabel lblMiddleName;
	private JTextField mname;
	private JLabel lblLastName;
	private JTextField lname;
	private JLabel lblAddress;
	private JTextField address;
	private JLabel lblPhone;
	private JTextField phone;
	private JLabel lblEmail;
	private JTextField email;
	private JLabel lblGender;
	private JRadioButton male;
	private JRadioButton female;
	private JRadioButton other;
	private JLabel lblDob;
	private JDateChooser dob;
	private JLabel lblCollege;
	private JTextField college;
	private JButton btnSubmit;
	private JLabel lblLabel;
	private JLabel label;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
   private int eid=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateForm frame = new UpdateForm();
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
	public UpdateForm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 573, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getPassword());
		contentPane.add(getLblFirstName());
		contentPane.add(getFname());
		contentPane.add(getLblMiddleName());
		contentPane.add(getMname());
		contentPane.add(getLblLastName());
		contentPane.add(getLname());
		contentPane.add(getLblAddress());
		contentPane.add(getAddress());
		contentPane.add(getLblPhone());
		contentPane.add(getPhone());
		contentPane.add(getLblEmail());
		contentPane.add(getEmail());
		contentPane.add(getLblGender());
		contentPane.add(getMale());
		contentPane.add(getFemale());
		contentPane.add(getOther());
		contentPane.add(getLblDob());
		contentPane.add(getDob());
		contentPane.add(getLblCollege());
		contentPane.add(getCollege());
		contentPane.add(getBtnSubmit());
		contentPane.add(getLblLabel());
		contentPane.add(getLabel_1());
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setForeground(new Color(240, 255, 240));
			lblUsername.setFont(new Font("Dialog", Font.BOLD, 15));
			lblUsername.setBounds(22, 48, 91, 21);
		}
		return lblUsername;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setBounds(117, 48, 139, 19);
			username.setColumns(10);
		}
		return username;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setForeground(new Color(245, 245, 220));
			lblPassword.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPassword.setBounds(274, 48, 91, 21);
		}
		return lblPassword;
	}
	private JPasswordField getPassword() {
		if (password == null) {
			password = new JPasswordField();
			password.setBounds(376, 48, 133, 19);
		}
		return password;
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setForeground(new Color(255, 250, 250));
			lblFirstName.setFont(new Font("Dialog", Font.BOLD, 15));
			lblFirstName.setBounds(22, 81, 91, 15);
		}
		return lblFirstName;
	}
	private JTextField getFname() {
		if (fname == null) {
			fname = new JTextField();
			fname.setBounds(12, 108, 133, 19);
			fname.setColumns(10);
		}
		return fname;
	}
	private JLabel getLblMiddleName() {
		if (lblMiddleName == null) {
			lblMiddleName = new JLabel("Middle Name");
			lblMiddleName.setForeground(new Color(255, 250, 240));
			lblMiddleName.setFont(new Font("Dialog", Font.BOLD, 15));
			lblMiddleName.setBounds(213, 79, 110, 15);
		}
		return lblMiddleName;
	}
	private JTextField getMname() {
		if (mname == null) {
			mname = new JTextField();
			mname.setBounds(198, 108, 149, 19);
			mname.setColumns(10);
		}
		return mname;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setForeground(new Color(245, 255, 250));
			lblLastName.setFont(new Font("Dialog", Font.BOLD, 15));
			lblLastName.setBounds(413, 81, 110, 15);
		}
		return lblLastName;
	}
	private JTextField getLname() {
		if (lname == null) {
			lname = new JTextField();
			lname.setBounds(376, 108, 149, 19);
			lname.setColumns(10);
		}
		return lname;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setForeground(new Color(240, 255, 240));
			lblAddress.setFont(new Font("Dialog", Font.BOLD, 15));
			lblAddress.setBounds(22, 143, 85, 15);
		}
		return lblAddress;
	}
	private JTextField getAddress() {
		if (address == null) {
			address = new JTextField();
			address.setBounds(110, 141, 146, 19);
			address.setColumns(10);
		}
		return address;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setForeground(new Color(245, 245, 245));
			lblPhone.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPhone.setBounds(292, 143, 70, 15);
		}
		return lblPhone;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(376, 139, 165, 19);
			phone.setColumns(10);
		}
		return phone;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setForeground(new Color(245, 255, 250));
			lblEmail.setFont(new Font("Dialog", Font.BOLD, 15));
			lblEmail.setBounds(22, 170, 70, 21);
		}
		return lblEmail;
	}
	private JTextField getEmail() {
		if (email == null) {
			email = new JTextField();
			email.setBounds(91, 172, 362, 19);
			email.setColumns(10);
		}
		return email;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setForeground(new Color(245, 245, 245));
			lblGender.setFont(new Font("Dialog", Font.BOLD, 15));
			lblGender.setBounds(12, 203, 70, 24);
		}
		return lblGender;
	}
	private JRadioButton getMale() {
		if (male == null) {
			male = new JRadioButton("Male");
			buttonGroup_1.add(male);
			male.setBounds(91, 204, 70, 23);
		}
		return male;
	}
	private JRadioButton getFemale() {
		if (female == null) {
			female = new JRadioButton("Female");
			buttonGroup_1.add(female);
			female.setBounds(174, 204, 85, 23);
		}
		return female;
	}
	private JRadioButton getOther() {
		if (other == null) {
			other = new JRadioButton("Other");
			buttonGroup_1.add(other);
			other.setBounds(274, 204, 75, 23);
		}
		return other;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("D.O.B");
			lblDob.setForeground(new Color(245, 245, 245));
			lblDob.setFont(new Font("Dialog", Font.BOLD, 15));
			lblDob.setBounds(364, 203, 70, 24);
		}
		return lblDob;
	}
	private JDateChooser getDob() {
		if (dob == null) {
			dob = new JDateChooser();
			dob.setBounds(437, 203, 124, 19);
		}
		return dob;
	}
	private JLabel getLblCollege() {
		if (lblCollege == null) {
			lblCollege = new JLabel("College");
			lblCollege.setForeground(new Color(245, 255, 250));
			lblCollege.setFont(new Font("Dialog", Font.BOLD, 15));
			lblCollege.setBounds(12, 239, 70, 22);
		}
		return lblCollege;
	}
	private JTextField getCollege() {
		if (college == null) {
			college = new JTextField();
			college.setBounds(91, 241, 305, 20);
			college.setColumns(10);
		}
		return college;
	}
	private JButton getBtnSubmit() {
		if (btnSubmit == null) {
			btnSubmit = new JButton("Update");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					  Registration r=new Registration();
					  r.setId(eid);
					   r.setFname(fname.getText());
					   r.setMname(mname.getText());
					   r.setLname(lname.getText());
					   r.setUsername(username.getText());
					   r.setPassword(password.getText());
					   r.setDob(new Date(dob.getDate().getTime()));
					   r.setCollege(college.getText());
					   r.setEmail(email.getText());
					   r.setAddress(address.getText());
					   r.setPhone(phone.getText());
					   if(male.isSelected()) {
						   r.setGender("male");
					   }else if(female.isSelected()) {
						   r.setGender("female");
					   }else {
						   r.setGender("other");
					   }
					   FormService fs = new FormServiceImpl();
					  if(fs.Update(r)) {
						  JOptionPane.showMessageDialog(null, "Added success");
						  dispose();
					  }
				}
			});
			btnSubmit.setBackground(new Color(240, 248, 255));
			btnSubmit.setFont(new Font("Dialog", Font.BOLD, 15));
			btnSubmit.setBounds(213, 273, 117, 25);
		}
		return btnSubmit;
	}
	private JLabel getLblLabel() {
		if (lblLabel == null) {
			lblLabel = new JLabel("Back");
			lblLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
				}
			});
			lblLabel.setForeground(Color.WHITE);
			lblLabel.setFont(new Font("Dialog", Font.BOLD, 18));
			lblLabel.setBounds(12, 0, 70, 27);
		}
		return lblLabel;
	}
	private JLabel getLabel_1() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(0, 0, 573, 331);
			label.setIcon(new ImageIcon(new ImageIcon("/home/seetal/Downloads/photo-1508528075895-be7a6cabd37a.webp2").getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
		}
		return label;
	}
	  public void setData(int id) {
		  eid=id;
		  FormService fs=new FormServiceImpl();
		  Registration r=fs.getA(eid);
		  username.setText(r.getUsername());
		   fname.setText(r.getFname());
		   mname.setText(r.getMname());
		   lname.setText(r.getLname());
		   phone.setText(r.getPhone());
		   email.setText(r.getEmail());
		   dob.setDate(r.getDob());
		   college.setText(r.getCollege());
		   address.setText(r.getAddress());
		   if(r.getGender().equalsIgnoreCase("male")) {
			   male.setSelected(true);
		   }else if(r.getGender().equalsIgnoreCase("female")) {
			   female.setSelected(true);
		   }
		   else {
			   other.setSelected(true);
		   }
	  }
	  
}
