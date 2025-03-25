package Demo;

public class Addition {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		//int sum= a+b;
		//int sub=a-b;
		int mul = a*b;
		int div = b/a;
		int mod=b%10;
		
		//System.out.println(sum);
		//System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		
		if(b%2==0)
		{
			System.out.println("Number is even");
			
		}
		else
		{
			System.out.println("Number is Odd");
		}
		

	}

}
