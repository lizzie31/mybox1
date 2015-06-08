package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.fileMenuGui;
import view.userMainMenuGUI;
import Model.User;

public class fileMenuCon {

	private User user;
	private fileMenuGui CurrGui;
	private userMainMenuController prevCon;
	private userMainMenuGUI menuGui;
	
	public fileMenuCon(fileMenuGui menu,userMainMenuController  lastCon,User user) {
		this.menuGui=menuGui; 
		this.user=user;
		this.CurrGui=menu;
		this.prevCon=lastCon;
		CurrGui.addcancel(new ButtoncancelListener());
	}
	
	class ButtoncancelListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			CurrGui.dispose();
			
			
		}
	}
}


