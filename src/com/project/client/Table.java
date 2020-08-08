package com.project.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.project.model.Registration;
import com.project.service.FormService;
import com.project.service.FormServiceImpl;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Table extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblSearch;
	private JTextField search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
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
	public Table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getLblSearch());
		contentPane.add(getSearch());
		displayData();
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 47, 754, 239);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(new Object[][]{},new String[] {"Id","FirstName","MiddleName","lastname","Phone","Email","username","password"
					}
		));	
		}
		return table;
	}
	public void displayData() {
		FormService fs=new FormServiceImpl();
		List<Registration> lr=fs.getAll();
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		model.setRowCount(0);
		for(Registration rr:lr) {
			model.addRow(new Object[] {rr.getId(),rr.getFname(),rr.getMname(),rr.getLname(),rr.getPhone(),rr.getEmail(),rr.getUsername(),rr.getPassword()});
		}
	}
	private JLabel getLblSearch() {
		if (lblSearch == null) {
			lblSearch = new JLabel("Search");
			lblSearch.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
			lblSearch.setBounds(458, 14, 83, 21);
		}
		return lblSearch;
	}
	private JTextField getSearch() {
		if (search == null) {
			search = new JTextField();
			search.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String input=search.getText().trim();
					FormService fs=new FormServiceImpl();
					List<Registration> uli=fs.search(input);
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					model.setRowCount(0);
					
					for(Registration rr:uli) {
						model.addRow(new Object[] {rr.getId(),rr.getFname(),rr.getMname(),rr.getLname(),rr.getPhone(),rr.getEmail(),rr.getUsername(),rr.getPassword()});
					}
				}
			});
			search.setBounds(540, 12, 185, 26);
			search.setColumns(10);
		}
		return search;
	}
}
