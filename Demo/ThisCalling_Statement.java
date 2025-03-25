package Demo;

public class ThisCalling_Statement {
	ThisCalling_Statement()
	{
		this(10);
		System.out.println(" Plane constructor");
		
	}
	ThisCalling_Statement(int a)
	{   
		this("Hellow");
		System.out.println(" Int type data is 10");
		
	}
	ThisCalling_Statement(String name)
	{
		
		System.out.println(" Shubhangi ");
	}

	public static void main(String[] args)
	{
		
		new ThisCalling_Statement();
		

	}

}
