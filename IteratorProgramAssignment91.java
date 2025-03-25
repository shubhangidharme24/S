package Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorProgramAssignment91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c1 = new ArrayList<Integer>();//upcasting
		c1.add(12);
		c1.add(13);
		c1.add(14);
		c1.add(15);
		c1.add(null);
		//System.out.println(c1);
		
		Iterator<Integer> i1 = c1.iterator();//abstractmethodof a collection class and Iterator<> is an interface
		
		
		while( i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		

	}

}
