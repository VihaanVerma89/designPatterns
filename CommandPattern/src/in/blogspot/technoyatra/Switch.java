package in.blogspot.technoyatra;

public class Switch 
{
	private Command cmd ;
	
	public void invoke()
	{
		cmd.execute();
	}
	
	public void setCommand(Command cmd)
	{
		this.cmd = cmd;
	}
}
