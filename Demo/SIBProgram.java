package Demo;

// we can have multiple static block in a program
//execution start from static block before main method and that is seuentially
public class SIBProgram { 
	
	//All SIB blocks gets executes first and then all IIB blocks executes and finally constructor executes
	SIBProgram()
	{
		System.out.println("Constructor calling");
	}
	static // static initialization block SIB
	{
		System.out.println("SIB 1");
	}
	static // static initialization block SIB
	{
		System.out.println("SIB 2");
	}
	static // static initialization block SIB
	{
		System.out.println("SIB 3");
	}
	{
		System.out.println("IIB 1");
		// IIB Instance initialization block
	}
	{
		System.out.println("IIB 2");
		// IIB Instance initialization block
	}

	public static void main(String[] args)
	{
		
		new SIBProgram();
		System.out.println("Main Method");

	}

}
