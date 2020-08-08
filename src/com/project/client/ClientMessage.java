package com.project.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientMessage extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMessage;
	private JMenu mnMessageRequest;
	private JMenu mnGroupMessage;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField search;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientMessage frame = new ClientMessage();
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
	public ClientMessage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 351, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getSearch());
		contentPane.add(getLabel());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnMessage());
			menuBar.add(getMnMessageRequest());
			menuBar.add(getMnGroupMessage());
		}
		return menuBar;
	}
	private JMenu getMnMessage() {
		if (mnMessage == null) {
			mnMessage = new JMenu("Message");
		}
		return mnMessage;
	}
	private JMenu getMnMessageRequest() {
		if (mnMessageRequest == null) {
			mnMessageRequest = new JMenu("Message Request");
		}
		return mnMessageRequest;
	}
	private JMenu getMnGroupMessage() {
		if (mnGroupMessage == null) {
			mnGroupMessage = new JMenu("Group Message");
		}
		return mnGroupMessage;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
			label_1.setBackground(Color.WHITE);
			label_1.setBounds(12, 30, 327, 42);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("");
			label_2.setBackground(Color.WHITE);
			label_2.setBounds(12, 72, 327, 42);
		}
		return label_2;
	}
	private JTextField getSearch() {
		if (search == null) {
			search = new JTextField();
			search.setName("");
			search.setBounds(0, 0, 351, 30);
			search.setColumns(10);
		}
		return search;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setBackground(Color.WHITE);
			label.setBounds(12, 114, 327, 42);
		}
		return label;
	}
}
