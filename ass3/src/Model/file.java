package Model;

import java.util.ArrayList;

public class file extends AbstractModel{
	private String fileName;
	private String Direction;
	private ArrayList<file> fileArr = new ArrayList<>();
	
	public file(String name)
	{
		fileName=name;
	}
	
	public file(String name,String Dir)
	{
		fileName=name;
		Direction=Dir;
		System.out.println("nofar");
	}
	
	public String getFileName()
	{
	return fileName;
    }
	
	public void setFileName(String name)
	{
	this.fileName=name;
    }
	
	public String getDirection()
	{
	return Direction;
    }
	
	public void setDirection(String dir)
	{
	this.Direction=dir;
    }

	public ArrayList<file> getFileArr() {
		return fileArr;
	}

	public void setFileArr(ArrayList<file> fileArr) {
		this.fileArr = fileArr;
	}
}
