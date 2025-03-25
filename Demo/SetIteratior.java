package Demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratior {

	public static void main(String[] args) 
	{
		Set s1= new HashSet();
		s1.add("shubhangi");
		s1.add(null);
		s1.add("manisha");
		s1.add(10);
		s1.add('P');
		s1.add(null);
		System.out.println("Set S1 is: " +s1);
		
		 Iterator i2    =s1.iterator();
		 
		 while(i2.hasNext())
		 {
			 System.out.println(i2.next());
		 }
		 
		 Set<String> s2= new HashSet<String>();
			s2.add("shu");
			s2.add("ABC");
			s2.add("man");
			
			System.out.println("Set S1 is: " +s2);
			
			s2.addAll(s1);
			System.out.println("After addAll " +s2);
			
			
			
		 
		
		

	}

}
