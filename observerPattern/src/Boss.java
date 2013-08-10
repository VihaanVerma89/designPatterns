import java.util.Observable;
import java.util.Scanner;


public class Boss  extends Observable implements Runnable
{
	@Override
	public void run() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Boss: ");
		while(input.hasNextLine())
		{
			String line = input.nextLine();
			setChanged();
			notifyObservers(line);
			System.out.print("\nBoss: ");
		}
		input.close();
	}
}
