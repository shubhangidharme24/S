package Demo;

public class TryCatch_Finally_Exception {

	public static void main(String[] args) {
		//we are not sure 
		try 
		{
		int a = 1/0;
		System.out.println(a);
		
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Catch block");
			
		}
		finally 
		{
		System.out.println("Finally block");	
		}

	}

}
