package Demo;

import java.util.Arrays;

public class Anagram2StringProg {

	public static void main(String[] args)
	{
		String s1 = "Note";
		
		
		String s2 = "etoN";
		
		
		
		if(s1.length()!=s2.length())
		{
			System.out.println("They are not anagram");
		}
		else
		{
		
		System.out.println("Lets find out if they are anagram");
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		char c2[] = s2.toCharArray();
		Arrays.sort(c2);
		System.out.println("After sorting");
		System.out.println(c1);
		System.out.println("After sorting");
		System.out.println(c2);
		
		
		boolean b1 = Arrays.equals(c1, c2);
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("Sting is Anagram");
		}
		else
		{
			System.out.println("String is not  an anagram");
		}

	}

}
}	
