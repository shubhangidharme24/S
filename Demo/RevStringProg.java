package Demo;

public class RevStringProg {

	public static void main(String[] args)
	{
		
		String str = "shubhangi";
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
		 char c1 = str.charAt(i);	
		
		 rev = rev+c1;
		
		
		}
		System.out.println("Reverse of string is: " +rev);
		
		if(str.equals(rev))
		{
			System.out.println("Sring is pallindrome");
		}
		else
		{
			System.out.println("String is not a pallindrome");
		}
		

	}

}
