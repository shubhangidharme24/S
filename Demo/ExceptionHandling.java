package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling 
{
		
//	public static void Add()
//	{
//		
//		try
//		{
//			int a=1/0;
//			System.out.println(a);
//		}
//		catch(ArithmeticException E1)
//		{
//			System.out.println(" Arithmatic exception is handle by catch block");
//		}
//	}
	
	public static void main(String[] args)
	{
		try {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s1.nextInt();
		}
		catch(InputMismatchException ex)
		{
			try
			{
				Scanner s1 = new Scanner(System.in);
				System.out.println("Enter your age as in number format only");
				int age = s1.nextInt();
			}
			catch(InputMismatchException m)
			{
				Scanner s1 = new Scanner(System.in);
				System.out.println("This is last chance please provide number format age only");
				int age = s1.nextInt();
				
			}

		}
		
		//Add();
	}
	

}
