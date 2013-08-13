package in.blogspot.technoyatra;

public class Fan implements Device
{
	@Override
	public void turnOff() 
	{
		System.out.println("The Fan is now off.");
	} 
	
	@Override
	public void turnOn() 
	{
		System.out.println("The Fan is now on.");
	}
}
