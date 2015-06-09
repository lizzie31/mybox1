package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.fileMenuGui;
import view.userMainMenuGUI;
import Model.User;
import Model.file;

public class fileMenuCon {

	private User user;
	private fileMenuGui CurrGui;
	private userMainMenuController prevCon;
	private file ChoosenFile;
	
	public fileMenuCon(fileMenuGui menu,userMainMenuController  lastCon,User user, file file) {
		this.user=user;
		this.CurrGui=menu;
		this.prevCon=lastCon;
		this.ChoosenFile=file;
		CurrGui.addcancel(new ButtoncancelListener());
		CurrGui.addread(new readListener());
	}
	
	class ButtoncancelListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			CurrGui.dispose();
			
			
		}
	}
	
	class readListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			for(int i=0;i<user.getFilesInDB().size();i++)
			{
				if(user.getFilesInDB().get(i).equals(ChoosenFile))
				{
					//if()
				}
			}
			
			
		}
	}
}


