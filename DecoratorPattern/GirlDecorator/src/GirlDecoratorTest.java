
public class GirlDecoratorTest 
{
	public static void main(String []args)
	{
		Girl girl = new HotGirl();
		
		girl = new Makeup(girl);
		System.out.println(girl.getLooks());
		
		girl = new SimpleGirl();
		girl = new Makeup(girl);
		
		System.out.println(girl.getLooks());
	}
}
