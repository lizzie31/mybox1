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
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class fileMenuGui extends JFrame {

	private JFrame frame;
	private JPanel panel=null;
	private JButton btnCancel=null;
	private String[] values = null;
	private User user;
	

	public fileMenuGui(User u) {
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
		values=new String[user.getInterestGroupInDB().size()];
		for(int i=0;i<user.getInterestGroupInDB().size();i++){
	
		values[i]=user.getInterestGroupInDB().get(i).getGroupNumber();
		}
	}
	private JPanel getCreatePanel(){
		
		
		if(panel==null)
		{
			panel=new JPanel();
			panel.setBackground(SystemColor.inactiveCaption);
			panel.setLayout(null);
			
			JButton btnRead = new JButton("read");
			btnRead.setBounds(48, 56, 89, 23);
			panel.add(btnRead);
			
			JButton btnUpdate = new JButton("update");
			btnUpdate.setBounds(183, 56, 89, 23);
			panel.add(btnUpdate);
			
			JButton btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(330, 56, 89, 23);
			panel.add(btnNewButton);
			
			JLabel lblWhatIsThe = new JLabel("what is the action you want to do with the file:");
			lblWhatIsThe.setFont(new Font("Arial Black", Font.PLAIN, 12));
			lblWhatIsThe.setBounds(44, 11, 358, 34);
			panel.add(lblWhatIsThe);
			
			JButton btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setBounds(48, 108, 89, 23);
			panel.add(btnNewButton_1);
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
