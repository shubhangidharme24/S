package Demo;

import java.util.Scanner;

public class Assignment36And37_AreaCircum_RectangleByScanner {
	Scanner s = new Scanner(System.in);
	int l;
	int b;

	public static void main(String[] args)
	{
		Assignment36And37_AreaCircum_RectangleByScanner obj = new Assignment36And37_AreaCircum_RectangleByScanner();
		obj.AreaOfRectangle();
		obj.CircumpharancOfRectangle();

	}

	public void AreaOfRectangle() {

		System.out.println("Enter value of l");
		l=s.nextInt();
		System.out.println("Enter value of b");
		b=s.nextInt();
		int area = l*b;
		System.out.println("Area of Rectangle is " + area);

	}

	public void CircumpharancOfRectangle()

	{
		System.out.println(" ");
		System.out.println("Enter value of l");
		l=s.nextInt();
		System.out.println("Enter value of b");
		b=s.nextInt();
		int cirum =2*(l+b);
		System.out.println("Circumpharance of Rectangle is " + cirum);
	}

}
