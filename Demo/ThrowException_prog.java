package Demo;

import java.util.InputMismatchException;

public class ThrowException_prog {

	public static void main(String[] args) throws NullPointerException, InputMismatchException
	{
		if(1<3)
		{
		 throw new NullPointerException();
		}
		else
		{
			throw new InputMismatchException();
		}

	}

}
