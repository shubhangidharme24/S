package Demo;

public class Assignment22_UpdateGlobalLocalVariable {
	
	static int A=50;  //static global varialble
	int D=200;        // non static global varialble
	

	public static void main(String[] args)
	{
		int b=50;
		b=1000;
		System.out.println("local variable value is updated "+b); // local variable value is updated
		
		A=700; //Static global variable value is updated
		System.out.println("Static global variable value is updated "+A);
		
		Assignment22_UpdateGlobalLocalVariable obj = new Assignment22_UpdateGlobalLocalVariable();
		obj.D = 800;        //Non-Static global variable value is updated
		System.out.println("Non-Static global variable value is updated " +obj.D);
		
		
		
		
	}

}
