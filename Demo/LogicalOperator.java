package Demo;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;

		if (a == b && b > a)  // AND operator 
		{
			System.out.println("a");
		} else {
			System.out.println("2");
		}

		if (a < b || a == b)   //OR operator
		{
			System.out.println("3");
		} else {
			System.out.println("4");
		}
		if(!(a==6100 && b==200))   // NOT Operator
		{
			System.out.println("5");
		}
		
	}

}
