package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.BorderLayout;

import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controllers.*;

import java.awt.Color;
import javax.swing.UIManager;
public class administratorMenuGUI extends JFrame {

	private JPanel MainMenu;
	private JTextField textField;
	private JButton btnCreateNewFile=null;
	private JButton btnShowgroups=null;
	private JButton btnCreateNewFolder=null;
	private JButton btnAddleaveAGroup=null;
	private JButton btnRequests = null;
	
	public administratorMenuGUI() {
		this.setSize(500, 500);
		initialize();
		

	}
	private void initialize() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(Color.CYAN);
		setBounds(100, 100, 450, 300);
		this.setSize(500,400);
		this.setTitle("main menu");;
		this.setContentPane(getMainMenu());

		
		btnCreateNewFile = new JButton("create new file");
		btnCreateNewFile.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCreateNewFile.setBounds(307, 250, 132, 23);    
		btnCreateNewFile.setBackground(UIManager.getColor("SplitPane.background"));
		MainMenu.add(btnCreateNewFile);
		
		JButton btnLogOut = new JButton("log out");
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogOut.setBackground(UIManager.getColor("SplitPane.background"));
		btnLogOut.setBounds(307, 284, 89, 23);
		MainMenu.add(btnLogOut);
		
		btnCreateNewFolder = new JButton("create new folder");
		btnCreateNewFolder.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCreateNewFolder.setBackground(UIManager.getColor("SplitPane.background"));
		btnCreateNewFolder.setBounds(307, 214, 138, 25);
		MainMenu.add(btnCreateNewFolder);
		
		textField = new JTextField();
		textField.setBounds(198, 46, 146, 20);
		MainMenu.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearch = new JLabel("search");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearch.setBounds(105, 46, 104, 17);
		MainMenu.add(lblSearch);
		

	}
	
	private JPanel getMainMenu(){
		if(MainMenu==null)
		{MainMenu=new JPanel();
MainMenu.setBackground(new Color(152, 251, 152));
		MainMenu.setLayout(null);

		JTree myFolder = new JTree();
		myFolder.setEditable(true);
		myFolder.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("myFolders") {
				{
				}
			}
		));
		myFolder.setBounds(47, 112, 162, 190);
		MainMenu.add(myFolder);
		
		JLabel lblHelloSystemAdministrtor = new JLabel("hello system administrtor");
		lblHelloSystemAdministrtor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHelloSystemAdministrtor.setBounds(111, 11, 187, 24);
		MainMenu.add(lblHelloSystemAdministrtor);
		
		JButton btnNewButton = new JButton("create group");
		btnNewButton.setBackground(UIManager.getColor("SplitPane.shadow"));
		btnNewButton.setBounds(338, 77, 101, 23);
		MainMenu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("delete group");
		btnNewButton_1.setBackground(UIManager.getColor("SplitPane.shadow"));
		btnNewButton_1.setBounds(338, 109, 101, 23);
		MainMenu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("edit group");
		btnNewButton_2.setBackground(UIManager.getColor("SplitPane.shadow"));
		btnNewButton_2.setBounds(338, 143, 101, 23);
		MainMenu.add(btnNewButton_2);
		
		btnRequests = new JButton("requests");
		btnRequests.setBounds(338, 177, 101, 23);
		MainMenu.add(btnRequests);
		
		}
		return MainMenu;
		
	}
	public void addrequests(ActionListener l) {
		btnRequests.addActionListener(l);
	}
	
	public void addcreatenewfile(ActionListener l) {
		btnCreateNewFile.addActionListener(l);
	}
	public void addcreatenewfolder(ActionListener l) {
		btnCreateNewFolder.addActionListener(l);
	}
	public void addleaveEntergruop(ActionListener l) {
		btnAddleaveAGroup.addActionListener(l);
	}
	public void close() {
		this.setVisible(false);
		dispose();
	}
	}


