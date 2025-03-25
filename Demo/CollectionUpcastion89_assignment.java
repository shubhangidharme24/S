package Demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUpcastion89_assignment {

	public static void main(String[] args) 
	{
		Collection<Integer> c1 = new ArrayList<Integer>();//upcasting
		c1.add(12);
		c1.add(13);
		c1.add(14);
		c1.add(15);
		c1.add(null);
		System.out.println(c1);
		
		c1.remove(14);
		c1.remove(12);
		System.out.println(c1);
		
		Collection<Double> c2 = new ArrayList<Double>();//upcasting
		
		c2.add(44.44);
		c2.add(66.66);
		
		System.out.println(c2);
		boolean b = c2.contains(44.44);
		System.out.println(b);
		
		Collection<String> c3 = new ArrayList<String>();
		c3.add("My");
		c3.add("Name");
		c3.add("Is");
		c3.add("SHUBHANGI DHARME");
		System.out.println(c3);
		c3.remove("My");
		System.out.println(c3);
		
		Collection<Character> c4 = new ArrayList<Character>();
		c4.add('A');
		c4.add('B');
		c4.add('C');
		System.out.println(c4);
		c4.removeAll(c4);
		System.out.println(c4);
		
		
		

	}

}
