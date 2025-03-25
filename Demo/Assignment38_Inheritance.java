package Demo;

public class Assignment38_Inheritance
{

	public static void main(String[] args)
	{
		Bike obj = new Bike();
		obj.Sub(100, 50);
		obj.Add(20, 50);
		

	}
	public void Sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}

}
class Bike extends Assignment38_Inheritance
{
	
	public void Add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}

}
