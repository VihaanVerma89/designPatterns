package in.blogspot.technoyatra;

public class Computer implements Device
{
	@Override
	public void turnOff() 
	{
		System.out.println("The Computer is now off.");
	}
	
	@Override
	public void turnOn() 
	{
		System.out.println("The Computer is now on.");
	}
}
