package Demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SeCollectionProgram {

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
	
	Set s2= new HashSet();
	
	s2.add(100);
	s2.add(null);
	
	System.out.println("Set S2 is: " +s2);
	
	s2.addAll(s1);
	
	System.out.println("After AddAll set is : " +s2);
	
	
	
		
	}

}
