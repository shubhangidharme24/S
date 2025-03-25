package Demo;

public class NonStaticMethodCall_InMainMethod {

	public static void main(String[] args)
	{
		NonStaticMethodCall_InMainMethod obj = new NonStaticMethodCall_InMainMethod();
		obj.Add();
		obj.StringMethod();
		obj.Sub();
		
		Log();
		LoginSuccessfully();
		
	}
    static void Log()
    {
    	System.out.println("Log a bug");
    }
    static void LoginSuccessfully()
    {
    	System.out.println("Able to login Application successfully");
    }
	public void Add()
	{
		int a=50;
		int b=70;
		int sum = a+b;
		System.out.println(sum);
	}
	public void StringMethod()
	{
		String name = "shubhangi Dharme";
		System.out.println("My name is "+name);
	}
	public void Sub()
	{
	  double b =500.49;
	  int a=100;
	  double c= b-a;
	  System.out.println("Result is "+c);
		
	}

}
