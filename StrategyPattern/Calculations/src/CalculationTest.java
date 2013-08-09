
public class CalculationTest 
{
	public static void main(String [] args)
	{
		float a=1,b=2,result;
		
		//add 'a' and 'b'.
		Calculation calculation = new Calculation(new Add());
		
		System.out.println("Results");
		
		result = calculation.calculate(a, b);
		System.out.println("Addition:" + result);
		
		calculation.setMethod(new Subtract());
		result = calculation.calculate(a, b);
		System.out.println("Subtraction:"+ result);
		
		calculation.setMethod(new Multiply());
		result = calculation.calculate(a, b);
		System.out.println("Multiplication:" + result);
		
		calculation.setMethod(new Division()); 
		result = calculation.calculate(a, b);
		System.out.println("Divide:" + result);
		
	}
}
