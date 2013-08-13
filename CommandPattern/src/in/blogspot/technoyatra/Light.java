package in.blogspot.technoyatra;

public class Light implements Device
{
	 @Override
 	 public void turnOff() 
	 {
		 System.out.println("The Light is now off.");
 	 }	
	 
	 @Override
 	 public void turnOn() 
	 {
		 System.out.println("The Light is now on.");
 	 }	
}