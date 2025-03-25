package Demo;

abstract class program1
{
	program1()
	{
		System.out.println("Constructor ..");
		
	}
	public abstract void Add();
	abstract void Sub(); //abstract method which does not have implementation
	int a =50;
	static int b=60;
	final int d = 500;
	void Login()   // concrete method
	{
		System.out.println("3");
	}
	static void logout()    // concrete method
	{
		System.out.println("4");
	}
	
	
}

public class AbstrClass extends program1
{
	AbstrClass(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	

	public static void main(String[] args) 
	{
		AbstrClass p = new AbstrClass(10,50);
		p.Add();
		p.Sub();
	    logout(); 
		p.Login();
	}

	
	public void Add()
	{
		
		int c=a+b;
		System.out.println("addition is " +c);
		
	}

	void Sub() 
	{
		int c = a-b;
		System.out.println("sub is " +c);
	}

}
