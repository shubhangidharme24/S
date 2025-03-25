package Demo;

import java.util.Scanner;

public class Assignment31_Circumpharance_circle {

	public static void main(String[] args) 
	{
		Assignment31_Circumpharance_circle obj = new Assignment31_Circumpharance_circle();
		obj.CircumpharanceOfCircle();

	}
	public void CircumpharanceOfCircle()
    {
		double pi=3.14;
    	Scanner s= new Scanner(System.in);
    	System.out.println("please enter radious of circle");
    	int r =s.nextInt();
    	double Circumpharance = 2*pi*r;
    	System.out.println(Circumpharance);
    }

}
