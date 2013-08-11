
public abstract class GirlDecorator extends Girl
{
	protected Girl decoratedGirl;
	
	public GirlDecorator(Girl decoratedGirl) 
	{
		this.decoratedGirl = decoratedGirl;
	}
	
	@Override
	public String getLooks() {
		return  decoratedGirl.getLooks();
	}
}
