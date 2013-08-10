
public class ObserverTest 
{
	public static void main(String []args)
	{
		Boss boss = new Boss();
		Vickey vickey = new Vickey();
		Vihaan vihaan = new Vihaan();
		
		boss.addObserver(vickey);
		boss.addObserver(vihaan);
		
		Thread bossThread = new Thread(boss);
		
		bossThread.start();
	}
}
