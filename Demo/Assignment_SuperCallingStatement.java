package Demo;

import java.lang.classfile.Superclass;

class supr
{
	supr(String name)
	{
		System.out.println(" supermost class  "+name);
		
	}


}
class TestSuper extends supr
{
	TestSuper(int a, int b)//para constructor
	{
		super("ShUbHaNgI..");
		int c= a*b;
		System.out.println("Parent class constructor running "+c);
		
	}

	static void area()
	{
		System.out.println("Print area of Circle as expected");
		
	}
	
}
public class Assignment_SuperCallingStatement extends TestSuper
{
   Assignment_SuperCallingStatement() 
   {
	super(5, 2); // super calling statement should be 1st line in every constructor.
	System.out.println("constructor of child class running ");
	//super(5, 2);
	   
   }	
   public static void main(String[] args) 
	{
	     
		new Assignment_SuperCallingStatement(); 
		

	}

}
