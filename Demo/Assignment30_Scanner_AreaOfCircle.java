package Demo;

import java.util.Scanner;

public class Assignment30_Scanner_AreaOfCircle {
	static double pi=3.14;
	
    public static void main(String[] args) 
	{
    	
		Assignment30_Scanner_AreaOfCircle obj = new Assignment30_Scanner_AreaOfCircle();
		obj.AreaOfCircle();

	}
    public void AreaOfCircle()
    {
    	Scanner s= new Scanner(System.in);
    	System.out.println("please enter radious of circle");
    	int r =s.nextInt();
    	double area = pi*r*r;
    	System.out.println(area);
    }

}
