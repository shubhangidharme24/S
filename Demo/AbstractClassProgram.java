package Demo;

abstract class ParentClass
{
	abstract void Add();
	abstract void Sub(); //abstract method which does not have implementation 
}
public class AbstractClassProgram extends ParentClass
{

	public static void main(String[] args)
	{
		
     AbstractClassProgram p = new AbstractClassProgram();
     p.Add();
     p.Sub();
     
	}

	
	void Add()
	{
		System.out.println("2");
		
	}

	void Sub()
	{
		System.out.println("3");
	}
	

}
