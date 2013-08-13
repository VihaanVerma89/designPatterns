package in.blogspot.technoyatra;

public class CommandOff implements Command
{
	private Device device;
	
	CommandOff(Device device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() 
	{
		device.turnOff();
	}
}
	