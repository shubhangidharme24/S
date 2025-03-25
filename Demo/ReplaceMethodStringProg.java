package Demo;

public class ReplaceMethodStringProg {

	public static void main(String[] args)
	{
		String name = "Shubhangi Dharme";
		String n1 = name.replace('S', 'G');
		System.out.println(n1);
		
		String n2 = name.replaceAll("Dharme", "Nagpure");
		System.out.println(n2);
		
		String name2 = "Pranav Dharme"; 
		String s1 = name2.replaceAll("[A-Z]", ""); //imp regex function to remove all capital letter with nothing or provided string
		System.out.println(s1);
	
		//remove numerics from given string
		String name3 = "Pr45anav Shaligram39 45Dharme"; 
		String s5 = name2.replaceAll("[0-9]", ""); //imp regex function to remove all capital letter with nothing or provided string
		System.out.println(s5);
		
		
		

	}

}
