package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.AbstractListModel;

import Model.User;

public class groupListGUI extends JFrame {

	private JFrame frame;
	private JPanel panel=null;
	private JButton btnCancel=null;
	private String[] values = null;
	private User user;
	private JList list_1;
	

	public groupListGUI(User u) {
		this.user=u;
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 345, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setContentPane(getCreatePanel());
		
		JLabel lblYourInterestGroup = new JLabel("your interest group:");
		lblYourInterestGroup.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYourInterestGroup.setBounds(81, 28, 186, 23);
		panel.add(lblYourInterestGroup);
		values=new String[user.getInterestGroupInDB().size()];
		for(int i=0;i<user.getInterestGroupInDB().size();i++){
	
		values[i]=user.getInterestGroupInDB().get(i).getGroupNumber();
		}
	}
	private JPanel getCreatePanel(){
		
		
		if(panel==null)
		{
			panel=new JPanel();
			panel.setLayout(null);
			
			btnCancel = new JButton("cancel");
			btnCancel.setBounds(237, 204, 89, 23);
			panel.add(btnCancel);
			
			list_1 = new JList();
			list_1.setModel(new AbstractListModel() {
				
				public int getSize() {
					return values.length;
				}
				public Object getElementAt(int index) {
					return values[index];
				}
			});
			list_1.setBounds(112, 79, 117, 85);
			panel.add(list_1);
		}
		return panel;
	}
	public void addcancel(ActionListener l) {
		btnCancel.addActionListener(l);
	}
	public void close() {
		this.setVisible(false);
		dispose();
	}
}
