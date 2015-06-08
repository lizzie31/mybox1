package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class createNewFileController {
	
	private createNewFileGUI createfile=null;
	private userMainMenuController prevController;
	
	public createNewFileController (createNewFileGUI g , userMainMenuController lastCon){
		
		this.createfile=g;
		prevController=lastCon;
		createfile.addcancel(new ButtoncancelListener());
	}
	private class ButtoncancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			buttoncancelPressed();
		}
		
	}
	private void buttoncancelPressed() {
		createfile.close();
		prevController.getusermainmenu().setVisible(true);
	}
	

}