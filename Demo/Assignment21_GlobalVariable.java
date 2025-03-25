package Demo;
class dd extends Assignment21_GlobalVariable
{
	void add()
	 {
		 Assignment21_GlobalVariable m = new Assignment21_GlobalVariable();
		 m.b=800;
		 m.a = 600;
		 int c= m.a+m.b;
		 System.out.println(c);
	 }
	

}

public class Assignment21_GlobalVariable {
	static int a=100;//static global variable
	int b=500; // Non-static global variable
	int c;
	
	
	public static void main(String[] args)
	{
		Multiplication();
		Assignment21_GlobalVariable obj = new Assignment21_GlobalVariable();
		obj.CheckForGreaterValue();
		dd p = new dd();
		p.add();

	}
	public static void Multiplication() //access static and non static global variable inside a  static method
	{
		Assignment21_GlobalVariable p = new Assignment21_GlobalVariable();
		int result = (p.b)*a;
		System.out.println("Multiplication is "+result);
		
		
		
		
	}
	public void CheckForGreaterValue() //access static and non static global variable inside a  non static method
	{
		int a =60;
		//System.out.println(this.c=a);
		
		if(a>b)
		{
			System.out.println("Condition true");
		}
		else
		{
			
			System.out.println("Condition is false");
			
		}
	}

}
