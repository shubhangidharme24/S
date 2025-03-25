package Demo;

public class Assignment17 {

	public static void main(String[] args) 
	{
		//static int a=10 // We can not distinguish local variable as a static or non-static
		int a=10;
		System.out.println(a);
		Assignment17 obj=new Assignment17();
		obj.Add();
		
		
    }
	public void Add()
	{
		//static int b=50; // We can not distinguish local variable as a static or non-static
		int b=100;
		System.out.println(b);
		
		
	}

}
