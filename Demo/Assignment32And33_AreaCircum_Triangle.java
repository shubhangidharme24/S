package Demo;

import java.util.Scanner;

public class Assignment32And33_AreaCircum_Triangle {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args)
	{

	Assignment32And33_AreaCircum_Triangle obj = new Assignment32And33_AreaCircum_Triangle();
	obj.AreaOfTriangle();
	obj.CircumpharancOfTriangle();
    
	}
	
	public void AreaOfTriangle()
	{
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter value of b");
		int b = s.nextInt();
		System.out.println("Enter value of h");
		int h = s.nextInt();
		double area = 0.5*b*h;
		System.out.println("Area of Triangle is "+area);
		
		
	}
    public void CircumpharancOfTriangle()
	
    {
    	System.out.println("");
    	System.out.println("Enter value of a");
		int a = s.nextInt();
		System.out.println("Enter value of b");
		int b = s.nextInt();
		System.out.println("Enter value of c");
		int c = s.nextInt();
		int cirumTriangle = a+b+c;
		System.out.println("Circumpharance of triangle is " +cirumTriangle);
		   
	}
}
