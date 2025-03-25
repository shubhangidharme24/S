package Demo;

public class thisKeyword
{
	
	int pi=3;
	int m=20;
	
	void Add()
	{
	 int fi=90;
	 int c=9;

	
	 System.out.println(this.pi=c); // assign local variable value to global variable
	
	 System.out.println(this.m=fi);
		
	}

	public static void main(String[] args)
	{
		thisKeyword t = new thisKeyword();
		t.Add();
		
	}

}
