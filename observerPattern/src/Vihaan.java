import java.util.Observable;
import java.util.Observer;


public class Vihaan implements Observer
{ 
	 @Override
	public void update(Observable o, Object arg) 
	 {
		 if(arg instanceof String)
		 {
			 String bossSays = (String)arg;
			 if(bossSays.toLowerCase().equals("hi vihaan") || bossSays.toLowerCase().equals("hi everyone"))
			 {
				System.out.println("Vihaan: Hi boss." );
			 }
		 }
	 }
 }
