package Demo;

public class Assignment23_ForLoop1To5 {

	public static void main(String[] args)
	{

          Assignment23_ForLoop1To5 obj = new Assignment23_ForLoop1To5();
          obj.PrintOneToFive();

	}
	public void PrintOneToFive()
	{
		for(int i=1; i<=5; i=i+1)
		{
			System.out.println("Print number "+i);
		}
	}

}
