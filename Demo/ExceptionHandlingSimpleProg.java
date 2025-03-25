package Demo;

public class ExceptionHandlingSimpleProg {

	public static void ArrayMethod() {
		try {
			int arr[] = new int[3];
			arr[0] = 19;
			arr[1] = 60;
			arr[2] = 59;
			arr[3] = 90;
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index 3 out of bounds for length 3, Please enter valid data inside array boundry");
		}

	}

	public static void main(String[] args) {
		ArrayMethod();

	}

}
