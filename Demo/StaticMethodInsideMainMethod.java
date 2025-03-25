package Demo;

public class StaticMethodInsideMainMethod {
	
	
	static void Add()
	{
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		Add();

	}

}
