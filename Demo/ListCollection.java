package Demo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ListCollection {

	public static void main(String[] args)
	{
		 List<Integer> l1  = new ArrayList<Integer>();
		 l1.add(10);
		 l1.addFirst(70);
		 l1.add(100);
		 l1.add(200);
		 l1.add(2, 5);
		 System.out.println(l1);
		 
		// Iterator i1 = l1.iterator();
		 ListIterator i2 = l1.listIterator();
		 while(i2.hasNext())
		 {
			 System.out.println(i2.next());
		 }
		   System.out.println("List Iterator is: ");
		  
		   
		   while(i2.hasPrevious())
		   {
			   System.out.println(i2.previous());
		   }
			
			

}
}
