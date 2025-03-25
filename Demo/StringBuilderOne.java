package Demo;

public class StringBuilderOne {

	public static void main(String[] args)
	{
//		String s = new String("RUTVI");
//		s.concat("School");
//		System.out.println(s);
		
		
		StringBuilder s3 = new StringBuilder("shubhangi");
		//StringBuilder l = new StringBuilder("JHJHHGH");
		int p = s3.length();
		System.out.println(p);
		s3.append(" Nagpure");
		System.out.println(s3);
		
		StringBuilder s4=new StringBuilder("Test ");
		s4.insert(5, "Automation");
		System.out.println(s4);
		
		StringBuilder s5=new StringBuilder("ABCDEFG");
		s5.delete(2, 6);
		System.out.println(s5);
		
		StringBuilder s6=new StringBuilder("Pallindrome Program");
		String m= s6.substring(4, 9);
		System.out.println(m);
		
		
		
		StringBuilder s7=new StringBuilder("Manual");
		s7.reverse();
		System.out.println(s7);
		
		StringBuilder s8=new StringBuilder("ManualTesting");
		int cap = s8.capacity();
		System.out.println(cap);
		
		
		
		
		
		
		
		
		
		
//		StringBuffer s4 = new StringBuffer("Pranav");
//		s4.append('D');
//		System.out.println(s4);
		
		

		              
		

	}

}
