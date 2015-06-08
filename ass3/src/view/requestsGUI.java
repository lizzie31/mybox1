package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class requestsGUI extends JFrame {

	private JFrame frame;
	private JPanel panel = null;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					requestsGUI window = new requestsGUI();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public requestsGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Requests List");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(60, 23, 137, 26);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("request 1");
		chckbxNewCheckBox.setBounds(108, 60, 115, 46);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("request 2");
		chckbxNewCheckBox_1.setBounds(108, 109, 97, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("request 3");
		chckbxNewCheckBox_2.setBounds(108, 142, 97, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JButton btnAprrove = new JButton("aprrove");
		btnAprrove.setBounds(57, 196, 89, 23);
		panel.add(btnAprrove);
		
		JButton btnDeny = new JButton("deny");
		btnDeny.setBounds(211, 196, 89, 23);
		panel.add(btnDeny);
	}
	private JPanel getCreatePanel(){
		
		
		if(panel==null)
		{
			panel=new JPanel();
			panel.setLayout(null);
		}
		return panel;
	}

	public void close() {
		this.setVisible(false);
		dispose();
	}
}
