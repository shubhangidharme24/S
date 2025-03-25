package Demo;
interface Amaon
{
void Add();
void Sub();
int i=10;
}

interface GoogleOne extends Amaon
{
	Void Display();
	int p=89;
	
	

}


public class ExceptionHandlingProgramOne implements GoogleOne {

	public static void main(String[] args)
	{
	  ExceptionHandlingProgramOne p = new ExceptionHandlingProgramOne();
	  p.Display();
	  p.Add();
	  p.Sub();

	}

	
	public Void Display()
	{
		System.out.println(GoogleOne.p);
		return null;

	}

	
	public void Add() 
	{
		
		System.out.println(Amaon.i);
	}

	public void Sub()
	{
		System.out.println(GoogleOne.p);
		
	}

}
