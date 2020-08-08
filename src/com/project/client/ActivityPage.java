package com.project.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.MenuKeyListener;

import com.project.model.Registration;
import com.project.service.FormService;
import com.project.service.FormServiceImpl;

import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActivityPage extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewsfeed;
	private JMenu mnFriendRequest;
	private JMenu mnMessege;
	private JMenu mnSearch;
	private JMenu mnMenu;
	private JMenuItem mntmChat;
	private JMenuItem mntmNewsfeed;
	private JMenuItem mntmFriendRequest;
	private JMenuItem mntmMessege;
	private JMenuItem mntmSearch;
	private JMenuItem mntmLogOut;
	private JMenu mnNotificaton;
	private JMenu mnNewMenu;
	private JMenuItem mntmPersonalInformation;
	private JMenuItem mntmLogOut_1;
	
	private Registration  userSession;
	private JMenu mnSecurityLogin;
	private JMenuItem mntmChangePassword;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActivityPage frame = new ActivityPage();
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
	public ActivityPage() {
		setTitle("Main Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 524, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewsfeed());
			menuBar.add(getMnFriendRequest());
			menuBar.add(getMnMessege());
			menuBar.add(getMnSearch());
			menuBar.add(getMnNotificaton());
			menuBar.add(getMnMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewsfeed() {
		if (mnNewsfeed == null) {
			mnNewsfeed = new JMenu("NewsFeed");
		}
		return mnNewsfeed;
	}
	private JMenu getMnFriendRequest() {
		if (mnFriendRequest == null) {
			mnFriendRequest = new JMenu("Friend Request");
		}
		return mnFriendRequest;
	}
	private JMenu getMnMessege() {
		if (mnMessege == null) {
			mnMessege = new JMenu("Messege");
		}
		return mnMessege;
	}
	private JMenu getMnSearch() {
		if (mnSearch == null) {
			mnSearch = new JMenu("Search");
		}
		return mnSearch;
	}
	private JMenu getMnMenu() {
		if (mnMenu == null) {
			mnMenu = new JMenu("Menu");
			mnMenu.add(getMntmChat());
			mnMenu.add(getMntmNewsfeed());
			mnMenu.add(getMntmFriendRequest());
			mnMenu.add(getMntmMessege());
			mnMenu.add(getMntmSearch());
			mnMenu.add(getMnNewMenu());
			mnMenu.add(getMntmLogOut());
		}
		return mnMenu;
	}
	private JMenuItem getMntmChat() {
		if (mntmChat == null) {
			mntmChat = new JMenuItem("Chat");
		}
		return mntmChat;
	}
	private JMenuItem getMntmNewsfeed() {
		if (mntmNewsfeed == null) {
			mntmNewsfeed = new JMenuItem("NewsFeed");
		}
		return mntmNewsfeed;
	}
	private JMenuItem getMntmFriendRequest() {
		if (mntmFriendRequest == null) {
			mntmFriendRequest = new JMenuItem("Friend Request");
		}
		return mntmFriendRequest;
	}
	private JMenuItem getMntmMessege() {
		if (mntmMessege == null) {
			mntmMessege = new JMenuItem("Messege");
		}
		return mntmMessege;
	}
	private JMenuItem getMntmSearch() {
		if (mntmSearch == null) {
			mntmSearch = new JMenuItem("Search");
		}
		return mntmSearch;
	}
	private JMenuItem getMntmLogOut() {
		if (mntmLogOut == null) {
			mntmLogOut = new JMenuItem("Log out");
			mntmLogOut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Ulogin().setVisible(true);
					dispose();
				}
			});
			}
		return mntmLogOut;
	}
	private JMenu getMnNotificaton() {
		if (mnNotificaton == null) {
			mnNotificaton = new JMenu("Notificaton");
		}
		return mnNotificaton;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Setting");
			mnNewMenu.add(getMntmPersonalInformation());
			mnNewMenu.add(getMnSecurityLogin());
			mnNewMenu.add(getMntmLogOut_1());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmPersonalInformation() {
		if (mntmPersonalInformation == null) {
			mntmPersonalInformation = new JMenuItem("Personal information");
			mntmPersonalInformation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 UpdateForm up=new UpdateForm();
					 int id=userSession.getId();
				    up.setData(id);
				     up.setVisible(true);  
				    
				}
			});
		}
		return mntmPersonalInformation;
	}
	private JMenuItem getMntmLogOut_1() {
		if (mntmLogOut_1 == null) {
			mntmLogOut_1 = new JMenuItem("Log out");
			mntmLogOut_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Ulogin().setVisible(true);
					dispose();
				}
			});
			
		}
		return mntmLogOut_1;
	}
	
	
	public void userInfo(Registration user) {
		userSession = user;	
	}
	private JMenu getMnSecurityLogin() {
		if (mnSecurityLogin == null) {
			mnSecurityLogin = new JMenu("Security Login");
			mnSecurityLogin.add(getMntmChangePassword());
		}
		return mnSecurityLogin;
	}
	private JMenuItem getMntmChangePassword() {
		if (mntmChangePassword == null) {
			mntmChangePassword = new JMenuItem("Change Password");
			mntmChangePassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SecurityLogin sl=new SecurityLogin();
					int id=userSession.getId();
					sl.getId(userSession);
					sl.setVisible(true);
					
				}
			});
		}
		return mntmChangePassword;
	}
}
