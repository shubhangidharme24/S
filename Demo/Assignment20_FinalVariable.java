package Demo;

public class Assignment20_FinalVariable {
	final static int a=45;
	final int b=55;
	
   public static void main(String[] args)
	{
	   Assignment20_FinalVariable m=new Assignment20_FinalVariable();	
	   int c= a+m.b; // here b is a non static final variable
	   System.out.println("Addition is "+c);
	}

}
