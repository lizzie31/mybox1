package controllers;


import java.awt.CardLayout;
import java.awt.Container;

import view.*;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.User;

public class administratorMenuController extends userMainMenuController {
	
	private administratorMenuGUI currgui2;
	public administratorMenuController (userMainMenuGUI menu,logInCon lastCon,User user,administratorMenuGUI menu2){
		
	super(menu,lastCon,user);
    this.currgui2=menu2;
	currgui2.addrequests(new ButtonrequestsListener());
	currgui2.addcreatenewfile(new ButtoncreatenewfileListener());

	}
	
	private class ButtoncreatenewfileListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			//super();
		}
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
	}

}
