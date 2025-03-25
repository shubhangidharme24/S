package Demo;

import java.util.Scanner;

public class AssignmentOfAgeProgram {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
	       System.out.println(" please enter your age");
	       int age=s.nextInt();
	       System.out.println(" please enter your gender as Female or Male");
	       String gen=s.next();


	        if(age>=18 &&  gen =="F")
	               {
	        	System.out.println(" Person can vote");
	               }
	       else
	                {
	    	   System.out.println(" Person can not vote");
	                }
//		int age = 27;
//		if (age >= 18 || age > 18) {
//			System.out.println("Voter can vote");
//
//		}
//		if (age != 18 && age < 18) {
//			System.out.println("Voter can not vote");
//		}

	}

}
