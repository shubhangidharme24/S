package Demo;

import java.util.Scanner;

public class ArrayProgForScannerClass
{
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("please enter Array");
		int age[] = new int[s.nextInt()];
		
		
		for(int i=0; i<age.length; i++)
		{
			age[i]=s.nextInt();
			System.out.println(age[i]);
		}

	}

}
