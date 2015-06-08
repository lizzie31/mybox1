package Model;

public class file extends AbstractModel{
	private String fileName;
	private String Direction;
	
	public file(String name,String Dir)
	{
		fileName=name;
		Direction=Dir;
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
}
