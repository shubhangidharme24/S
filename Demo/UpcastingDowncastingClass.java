package Demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UpcastingDowncastingClass {

	public static void main(String[] args) 
	{
		//implicite syntax of upcasting 
		Object o1 = new UpcastingDowncastingClass();
		
		List p = new LinkedList();//upcasting
		p.add(10);
		Map m = new HashMap();
		//explicite syntax of upcasting
		Object o2 = (Object)new UpcastingDowncastingClass();
		
		//DOWNCASTING
		
		UpcastingDowncastingClass p2=(UpcastingDowncastingClass) o1;
		
		
		
		
		
		
		
	}

}
