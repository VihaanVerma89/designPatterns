
public class Calculation 
{
	Method method;
	
	Calculation(Method method)
	{
		this.method = method;
	}
	
	public void setMethod(Method method)
	{
		this.method = method;
	}
	
	public float calculate(float a, float b)
	{
		return method.calculate(a, b);
	}
}
