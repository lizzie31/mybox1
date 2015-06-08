package controllers;


import java.awt.CardLayout;
import java.awt.Container;

import view.*;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class administratorMenuController extends userMainMenuController {
	
	private administratorMenuGUI CurrGui=null;
	
	public administratorMenuController (){
		
	super(null,null,null);
	CurrGui.addrequests(new ButtonrequestsListener());
	}
	
	private class ButtonrequestsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			buttonrequestsPressed();
		}
		
	}
	
	private void buttonrequestsPressed() {
		CurrGui.close();
		requestsGUI R= new requestsGUI();
		//new GroupsListController(R,this);
		R.setVisible(true);
	}

}
