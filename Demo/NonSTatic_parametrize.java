package Demo;

public class NonSTatic_parametrize {

	public static void main(String[] args)
	{
	  NonSTatic_parametrize obj = new NonSTatic_parametrize();
	  obj.Add(50, 60);
	  obj.Sub(100.34, 200);
	  obj.StringMethod("Shubhangi");
	  obj.PrintChar('M');
	}
	
	public void Add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	public void StringMethod(String name)
	{
		
		System.out.println("My name is "+name);
	}
	public void Sub(double a, int b)
	{
	  double c= b-a;
	  System.out.println("Result is "+c);
		
	}
	public void PrintChar(char c)
	{
		System.out.println("Character is "+c);
	}

}
