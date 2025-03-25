package Demo;

public class LocalAndGlobalVariable {
	 double pi=3.14; //non-static gloabal variable also known as instance variable
	 static int a;  // static global variable
	 static String name; //global variable has a default value
	 int b=20;
	 static int f=200;
	 static int k=4000;
	 final int l=40; // we can not change final variable value;
	 
	 
public static void main(String[] args)
	{
	
		int m=300; // local variable
		m=500;
		System.out.println("value updated from 300 to "+m);
		System.out.println(a);  //global variable has a default value
		System.out.println(name);
		
		LocalAndGlobalVariable g = new LocalAndGlobalVariable(); // accessing non static global variable using reference variable.
		int c = 100+g.b;
		System.out.println("Addition is "+c);
		int d=g.f;
		d=700;
		System.out.println(d);
		g.Add();
		

	}
  
  public static void Add()
  {
	  int p = 60;
	  p=90;
	  LocalAndGlobalVariable p1 = new LocalAndGlobalVariable();
	  p1.b=600;
	 // int x=a+p1.b;
	  System.out.println();
	  System.out.println( p);
	  
	  
	  
  }

}
