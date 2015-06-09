package controllers;





import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;






import view.*;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import client.myboxapp;
import Model.Envelope;
import Model.User;
import Model.file;

public class userMainMenuController extends AbstractTransfer{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected userMainMenuGUI CurrGui=null;
	protected logInCon prevController;
	protected User userDetails;
	protected fileMenuGui fileMenu;
    protected fileMenuCon fileCon;
	private Envelope en;
	private file f;
	private ArrayList<file> filesarr;

	public userMainMenuController(userMainMenuGUI menu, logInCon lastCon,User user) {
		this.CurrGui= menu;
		prevController=lastCon;
		userDetails=user;
		CurrGui.addcreatenewfile(new ButtoncreatenewfileListener());
		CurrGui.addcreatenewfolder(new ButtoncreatenewfolderListener());
		CurrGui.addleaveEntergruop(new ButtonAddleaveAGrouprListener());
		CurrGui.addshowgruops(new ButtonshowgrouprListener());
		CurrGui.addLogOut(new LogOutListener());
		CurrGui.addlistClickedListener(new ListSelectionListener());
		CurrGui.addsearchfiles(new addsearchfilesListener());
	}

	protected class ButtonshowgrouprListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			buttonshowgroupPressed();
		}	
	}

	protected void buttonshowgroupPressed() {	
		en=new Envelope(userDetails,"show user interest groups");
		sendToServer(en);
		myboxapp.clien.setCurrObj(this);	
	}
	
	protected class addsearchfilesListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			buttonsearchfilesPressed();
		}	
	}
	protected void buttonsearchfilesPressed() {	
		String str = CurrGui.getTextField();
		if(str.equals(""))
		{
			Component frame = null;
			JOptionPane.showMessageDialog(frame, "Please type the filename to search!");
		}
			
		else
		{
			
			//f = new Files(str);
			//CurrGui.close();
			//fileSearchGui CNFG=new fileSearchGui (f);
			//new fileSearchController(CNFG,this);
			sendToServer("search files");
			myboxapp.clien.setCurrObj(this);
		}
			
	}

	 class LogOutListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				UpdateDB(); //update the user to status 0 = logout
				CurrGui.dispose();
				prevController.getLoginG().ClearText();
				prevController.getLoginG().setVisible(true);
			}
	 } 

	 class ListSelectionListener implements javax.swing.event.ListSelectionListener{
			public void valueChanged(ListSelectionEvent e) {
				 String choosenFile=(String)CurrGui.getlist().getSelectedValue();
				 file file = null;
				 for(int i=0;i<userDetails.getFilesInDB().size();i++)
					{
						if(userDetails.getFilesInDB().get(i).getFileName().equals(choosenFile))
							file=userDetails.getFilesInDB().get(i);
					}
							
				 fileMenu=new fileMenuGui(userDetails,choosenFile);
				 fileCon=new fileMenuCon(fileMenu,getCon(),userDetails,file);
			}
		 }
	 
	private class ButtoncreatenewfileListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			buttoncreatenewfilePressed();
		}
	}

	private void buttoncreatenewfilePressed() {
		CurrGui.close();
		createNewFileGUI CNFG=new createNewFileGUI ();
		new createNewFileController(CNFG,this);
		CNFG.setVisible(true);
	}

	private class ButtoncreatenewfolderListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			buttoncreatenewfolderPressed();
		}
	}

	private void buttoncreatenewfolderPressed() {
		CurrGui.close();
		createNewFolderGUI CNFOG=new createNewFolderGUI ();
		new createNewFolderController(CNFOG,this);
	    CNFOG.setVisible(true);
	}

	public userMainMenuGUI getusermainmenu() {
		return CurrGui;
	}


	private class ButtonAddleaveAGrouprListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			buttonAddleaveAGroupPressed();
		}
	}

	

	private void buttonAddleaveAGroupPressed() {
		CurrGui.close();
		EnterOrLeaveGroupGUI ALG=new EnterOrLeaveGroupGUI (userDetails);
		new EnterOrLeaveGroupController(ALG,this);
		ALG.setVisible(true);
	}

	public void UpdateDB(){

		en=new Envelope(userDetails,"log out status");
		 sendToServer(en);
		 userDetails.setStatus(0);
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {

		this.userDetails = userDetails;

	}
public userMainMenuController getCon(){
		return this;
	}
	

	public void handleDBResult(Object message) {
	userDetails = (User)message;
	CurrGui.close();
	this.setUserDetails((User)userDetails);
	groupListGUI SG=new groupListGUI (userDetails);
	new GroupsListController(SG,this);
	SG.setVisible(true);
	}
	
	public void handleDBResultFile(Object message) {
		if(message instanceof ArrayList<?>)
		{
			if(((ArrayList<?>) message).get(1) instanceof file)
				filesarr= (ArrayList<file>)message;
		}
		CurrGui.close();
		fileSearchGui SG=new fileSearchGui (filesarr);
		new fileSearchController(SG,this);
		SG.setVisible(true);
		}
	

public logInCon getPrevController() {
		return prevController;
	}
	
}

