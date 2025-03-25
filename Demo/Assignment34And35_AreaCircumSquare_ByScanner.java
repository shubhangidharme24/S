package Demo;

import java.util.Scanner;

public class Assignment34And35_AreaCircumSquare_ByScanner {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args)
	{
		Assignment34And35_AreaCircumSquare_ByScanner obj = new Assignment34And35_AreaCircumSquare_ByScanner();
		obj.AreaOfSquare();
		obj.CircumpharancOfSquare();
	}
	public void AreaOfSquare()
	{
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s.nextInt();
		int area =a*a;
		System.out.println("Area of Circle is "+area);
		
		
	}
    public void CircumpharancOfSquare()
	
    {
    	System.out.println("");
    	System.out.println("Enter value of a");
		int a = s.nextInt();
		int cirumSquare = 4*a;
		System.out.println("Circumpharance of Circle is "+cirumSquare);	
	}

}
