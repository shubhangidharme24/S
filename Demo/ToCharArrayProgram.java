package Demo;

public class ToCharArrayProgram {

	public static void main(String[] args) 
	{
		try {
		int rollno[]=new int[3];
		rollno[0]=10;
		rollno[1]=28;
		rollno[2]=89;
		rollno[3]=90;
		for(int i=0; i<=2; i++)
		{
			System.out.println(rollno[i]);
		}
		}	
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(" Please enter data proper");
			throw new ArrayIndexOutOfBoundsException();
		}
	
		
//		String str = "Ram";
//		char[] arr = str.toCharArray();
		
		

	}

}
