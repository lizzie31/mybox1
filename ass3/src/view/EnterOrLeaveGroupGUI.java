package view;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

import javax.swing.JMenu;

public class EnterOrLeaveGroupGUI extends JFrame {

	private JFrame frmEnterLeaveGroup;
	private JTextField textField;
	private JButton btnCancel;
	private JButton btnSendToSystem;
	private JPanel panel=null;
	/**
	 * Launch the application.
	 * Create the application.
	 */
	public EnterOrLeaveGroupGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 345, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setContentPane(getCreatePanel());
		
		JLabel lblUsername = new JLabel("userName");
		lblUsername.setBounds(31, 37, 113, 16);
		panel.add(lblUsername);
		
		JLabel lblChooseEnterleave = new JLabel("choose enter/leave");
		lblChooseEnterleave.setBounds(31, 100, 125, 16);
		panel.add(lblChooseEnterleave);
		
		
		JLabel lblChooseGroup = new JLabel("choose group");
		lblChooseGroup.setBounds(31, 172, 91, 16);
        panel.add(lblChooseGroup);
		
		textField = new JTextField();
		textField.setBounds(215, 33, 131, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(215, 169, 131, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(215, 97, 131, 22);
		panel.add(comboBox_1);
		comboBox_1.addItem("enter");
		comboBox_1.addItem("leave");
		
		btnCancel = new JButton("cancel");

		btnCancel.setBounds(12, 223, 120, 32);
		panel.add(btnCancel);
		
		btnSendToSystem = new JButton("send to system administrator");
		btnSendToSystem.setBounds(232, 219, 200, 40);
		panel.add(btnSendToSystem);
		
		btnSendToSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "your request was send to the system administrator!");
			}
		});
	
	}
	private JPanel getCreatePanel(){
		
		
		if(panel==null)
		{
			panel=new JPanel();
			panel.setLayout(null);
			
			JMenu menu = new JMenu("New menu");
			menu.setBounds(343, 130, 109, 22);
			panel.add(menu);
		}
		return panel;
	}
	public void addcancel(ActionListener l) {
		btnCancel.addActionListener(l);
	}
	

	
	public void close() {
		setVisible(false);
		dispose();
	}
}
