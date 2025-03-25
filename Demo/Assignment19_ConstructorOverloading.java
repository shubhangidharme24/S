package Demo;

public class Assignment19_ConstructorOverloading {
	
	Assignment19_ConstructorOverloading(int a, int b)
	{
		double reminder = a%b;
		System.out.println("Reminder is "+reminder);
	
	}
	Assignment19_ConstructorOverloading(int a)
	{
		System.out.println(+a);
	}

	public static void main(String[] args)
	{

		new Assignment19_ConstructorOverloading(101);
		Assignment19_ConstructorOverloading obj = new Assignment19_ConstructorOverloading(100, 12);
		
	}

}
