package Demo;

public class MatchesProgram {

	public static void main(String[] args) 
	{
		String a = "Shubhangi";
		boolean b = a.matches(".........");// regex matchec number of character with any char 
		System.out.println(b);
		
		//String end with i
		boolean b2 = a.matches("(.)*i"); // (.) represent multicharacter
		System.out.println(b2);
		
		//String with a 
		
		boolean b3 = a.matches("S(.)*");
		System.out.println(b3);
		
		//check if a given string man in it
		
		String a4 = "manSpimanderman";
		boolean b4 = a4.matches("(.)*man(.)*");
		System.out.println(b4);
				
		
		
		

	}

}
