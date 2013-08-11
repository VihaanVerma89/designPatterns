
public class Makeup extends GirlDecorator
{
	public Makeup(Girl decoratedGirl) 
	{
		super(decoratedGirl);
	}
	
	@Override
	public String getLooks() 
	{
		return super.getLooks() + " with Makeup.";
	}
}
