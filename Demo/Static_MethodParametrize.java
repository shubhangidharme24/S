package Demo;

public class Static_MethodParametrize 
{

	public static void main(String[] args) 
	{
		Add(60,20);
		StringMethod("Shubhangi Dharme");
		Sub(100.34, 280);
		Multiply(21.21, 2f);
		
	}
	static void Add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	static void StringMethod(String name)
	{
		
		System.out.println("My name is "+name);
	}
	static void Sub(double a, int b)
	{
	  double c= b-a;
	  System.out.println("Result is "+c);
		
	}
	static void Multiply(double c, float d)
	{
		//double m = c*d;
		float h=(float)c*d;
		System.out.println(h);
		
	}

}
