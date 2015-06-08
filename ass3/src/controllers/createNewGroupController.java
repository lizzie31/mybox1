package controllers;
import java.awt.CardLayout;
import java.awt.Container;

import view.*;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.event.ListSelectionEvent;

import client.myboxapp;
import Model.Envelope;
import Model.User;
import Model.file;

public class createNewGroupController {
	private createNewGroupGUI group;
	private administratorMenuController adm;
	public createNewGroupController(createNewGroupGUI group, administratorMenuController lastCon)
	{
		this.group=group;
		this.adm=lastCon;
		group.addcancel(new ButtonCancelListener());
		group.addok(new ButtonOklListener());
	}
	private class ButtonOklListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			buttonOkPressed();
		}
		
	}
	
	private void buttonOkPressed() {
		group.close();
		adm.getAdminCon().setVisible(true);
	
	}
	private class ButtonCancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			buttoncancelPressed();
		}
		
	}
	
	private void buttoncancelPressed() {
		group.close();
		adm.getAdminCon().setVisible(true);
	
	}

}
