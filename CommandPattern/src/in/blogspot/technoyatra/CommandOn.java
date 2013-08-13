package in.blogspot.technoyatra;

public class CommandOn implements Command
{
	private Device device;
	
	CommandOn(Device device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() 
	{
		device.turnOn();
	}
}
