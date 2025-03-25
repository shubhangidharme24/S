package Demo;
interface One
{
	void method1();
	static void add()
	{
		
	}
	void method2();
	int a = 10;
	
}
interface Two extends One
{
	void method3();
	void method4();
	static int b=20;
}


public class MultipleLevel_inheritance_Interface implements One, Two
{

	public static void main(String[] args)
	{
		
       MultipleLevel_inheritance_Interface I = new MultipleLevel_inheritance_Interface();
       I.method1();
       I.method2();
       I.method3();
       I.method4();
	}

	
	public void method3() {
		
		System.out.println("Method 3 implementation");
		System.out.println(a);
	}

	
	public void method4() {
		System.out.println("Method 4 implementation");
		System.out.println(b);
		
	}

	
	public void method1() {
		
		System.out.println("Method 1 implementation");
	}

	
	public void method2() {
		System.out.println("Method 2 implementation");
		
	}

}
