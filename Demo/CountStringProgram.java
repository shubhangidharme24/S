package Demo;

import java.util.Arrays;

public class CountStringProgram {
	
	public static void countAlpha()
	{
		String s1="kv no 2 @^%$";
		char[] c1 =s1.toCharArray();
		//System.out.println(c1);
		int count = 0;
		int countDig=0;
		int counSpace=0;
		System.out.println(Arrays.toString(c1));
		for(int i=0; i<c1.length; i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
		
			boolean b3=Character.isSpace(c1[i]);
			if(b1==true)
			{
				count++;
			}
			if(b2==true)
			{
				countDig++;
			}
			if(b3==true)
			{
				counSpace++;
			}
		}
		System.out.println("Count of alphabets are -> " +count);
		System.out.println("Count of digits are -> " +countDig);
		System.out.println("Count of spaces are -> " +counSpace);
		int countSpecialCharatcer = s1.length()-counSpace-count-countDig;
		System.out.println(countSpecialCharatcer);
		
		
	}
	public static void countOfDigit()
	{
		
	}

	public static void main(String[] args)
	{
		
		
		countAlpha();
		
		
	}

}
