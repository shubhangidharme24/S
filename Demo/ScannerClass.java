package Demo;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("My name is: ");
		String name = s1.next();
		
		System.out.println("Please value for a");
		int a=s1.nextInt();
		System.out.println("Please value for b");
		int b=s1.nextInt();
		byte c=  s1.nextByte();
		float f= s1.nextFloat();
		double d= s1.nextFloat();
		byte x= s1.nextByte();
		short s=s1.nextShort();
		long g=s1.nextLong();
		
		
int sum = a+b;
System.out.println("Addition is: "+sum);

        s1.close();
		
		
		
	}

}
