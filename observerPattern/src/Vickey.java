import java.util.Observable;
import java.util.Observer;


public class Vickey  implements Observer
{
	 @Override
	public void update(Observable o, Object arg) 
	 {
		 if(arg instanceof String)
		 {
			 String bossSays = (String)arg;
			 if(bossSays.toLowerCase().equals("hi vickey") || bossSays.toLowerCase().equals("hi everyone"))
			 {
				System.out.println("Vickey: Hi boss." );
			 }
		 }
	 }
}
