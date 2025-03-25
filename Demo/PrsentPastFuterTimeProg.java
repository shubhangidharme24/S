package Demo;

import java.text.Format;
import java.util.Date;

public class PrsentPastFuterTimeProg 
{


	public static void main(String[] args)
	{
		Date d1 = new Date();
		
		    // d1.getda      //green color circle with cross line menas method is depriciated means dead  
		System.out.println(d1);
		
		  //d1+(1000*60*60*24*1);
		String formar1= d1.toString();
		System.out.println(formar1);
		
		//DD-MM-YY
		//DD-MM-YYYY
		
		String month = formar1.substring(4, 7);
		System.out.println(month);
		
		String date = formar1.substring(8, 10);
		System.out.println(date);
		
		String year = formar1.substring(formar1.length()-4);
		System.out.println(year);
		
		String format2 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format2);
		
		String format3 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format3);
		
	}

}
