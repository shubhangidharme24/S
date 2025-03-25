package Demo;


class testP 
{
	
	public testP()
	{
		
		System.out.println(" testP class constructor");
	}
	
	

}

class study extends testP
{
	public study()
	{
		System.out.println("Child class constructor");
	}
	

}
public class NonParaSuperCalling_Constructor extends study
{
	
	NonParaSuperCalling_Constructor()
	{
		System.out.println("..Class Consructor..");
	}
	public static void main(String[] args) 
	{
		
		new NonParaSuperCalling_Constructor();
	}

}
