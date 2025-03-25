package Demo;

public class TypeCasting {

	public static void main(String[] args) 
	{
		//Widening - convert int into double
		//byte-short-int-long-float-double
		
		int a = 40;
		double dd = a; // implicite casting
		System.out.println(dd);
		
		double d = (double)a; // explicite casting
		System.out.println("int into double: " +d);
		
		//byte into int
		byte b = 60;
		int l=(int)b;
		System.out.println("Byte into int: "+b);
		
		//Narrowing convert double into int
		//double-float-long-int-short-byte
		
		double p = 789.0987; //explicite casting
		int i = (int)p;
		System.out.println("double into int: "+i);
		
		//Double into float
		  float f = (float)p;
		  System.out.println("double into float: " +f);
		  
		//int into byte
		  byte b1 = (byte)69;
		  System.out.println("int into byte:" +b1);
		  
		  //int into byte here int value is greater than -127 to 128
		  int t=10000;
		  byte e=(byte)t;
		  System.out.println("in into byte where int value is 10000 :  " +e);
		  
		  
		  
		
		
		

	}

}
