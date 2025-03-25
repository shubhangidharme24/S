package Demo;

public class StringConcepts {

	public static void main(String[] args)
	{
//		String s1 = new String("Manish");
//		String s2 =s1.concat("  Kumar Tivari"); //string 
//		System.out.println(s2);
		
		//StringBuffer pr = "hgghghf"; // we can not define string buffer like string
		
		StringBuffer s3 =  new StringBuffer("Manish");
		s3.insert(1, "SSD");
		System.out.println(s3);
		
		StringBuffer s4 =  new StringBuffer("Manish");
		s4.replace(0, 6 , "Shubhangi ");
		System.out.println(s4);
		
		StringBuffer s5 =  new StringBuffer("Manish");
		System.out.println(s5.reverse());
		
		StringBuffer s6 =  new StringBuffer("Manish");
		System.out.println(s6.capacity());
		
		StringBuffer s7 =  new StringBuffer("Manish");
		System.out.println(s7.length());
		
		StringBuffer s8 =  new StringBuffer("ManishKumar");
		s8.substring(2);
		System.out.println(s8.substring(2));
		
		StringBuilder b1 = new StringBuilder("Shubhangi");
		b1.insert(0,8);
		
		
		
		
	
		
		
	}

}
