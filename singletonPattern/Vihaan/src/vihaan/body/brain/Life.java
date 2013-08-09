package vihaan.body.brain;

public class Life 
{
	public static void main(String [] args)
	{
		Vihaan vihaan = Vihaan.getVihaan();
		String disposition;
		
		vihaan.setDisposition(new Good());
		disposition = vihaan.act();
		System.out.println(disposition);
		
		vihaan.setDisposition(new Neutral());
		disposition = vihaan.act();
		System.out.println(disposition);
		
		vihaan.setDisposition(new Bad());
		disposition = vihaan.act();
		System.out.println(disposition);
	
		
		vihaan.setDisposition(new Evil());
		disposition = vihaan.act();
		System.out.println(disposition);
	}
}
