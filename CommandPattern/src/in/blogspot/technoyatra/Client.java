package in.blogspot.technoyatra;

public class Client 
{
	public static void main(String [] args)
	{
		//Light.
		Device device = new Light();
		
		//turn on Light.
		Command command = new CommandOn(device);
		Switch mySwitch = new Switch();
		invoke(mySwitch, command);
		
		//turn off Light.
		command = new CommandOff(device);
		invoke(mySwitch, command);
		
		//Fan.
		device = new Fan();
		
		//turn on Fan.
		command = new CommandOn(device);
		invoke(mySwitch, command);
		
		//turn off Fan.
		command = new CommandOff(device);
		invoke(mySwitch, command);
		
		//Fan.
		device = new Computer();
		
		//turn on Fan.
		command = new CommandOn(device);
		invoke(mySwitch, command);
		
		//turn off Fan.
		command = new CommandOff(device);
		invoke(mySwitch, command);
	}
	
	public static void invoke(Switch mySwitch, Command command)
	{
		mySwitch.setCommand(command);
		mySwitch.invoke();
	}
}
