package vihaan.body.brain;

public class Vihaan 
{
	public Disposition disposition;
	
	private Vihaan()
	{
		
	}
	
	public static  Vihaan getVihaan()
	{
		if(me == null)
		{
			return new Vihaan();
		}
		else
			return me;
	}
	
	public void setDisposition(Disposition disposition)
	{
		this.disposition = disposition;
	}
	
	public String act()
	{
		return disposition.act();
	}
	
	
	private static Vihaan me;
}
