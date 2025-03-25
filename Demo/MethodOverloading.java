package Demo;
class testOne 
{
	static void Add()
	{
		System.out.println("overload testing");
		
	}
	
}

public class MethodOverloading extends testOne
{

	public static void main(String[] args) 
	{
		Add(50);
		Add(10,30);
		Add();
		

	
		
		MethodOverloading n= new MethodOverloading();
		n.Add(20.40, 4);
		n.Add(20, 40.78);
		
		
		
		
		LoginEmail(8975072343l);
		LoginEmail("shuhangi.dharme24@gmail.com");
		

	}
	static void Add(int a)
	{
		System.out.println(a);
		
	}
	static void Add(int a, int b)
	{
		System.out.println(a+b);
	}
	void Add(double d, int c)
	{
		System.out.println(d+c);
		
	}
	void Add(int c, double d)
	{
		System.out.println(c+d);
	}
	static void LoginEmail(String name)
	{
		System.out.println("User name is " +name);
	}
	static void LoginEmail(long n)
	{
		System.out.println("Login by Mobile number "+n);
	}
}
