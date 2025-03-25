package Demo;


interface I1 {
		void Car();

		void Accelerate();

	}


public class Assignment51Interface implements I1 {

	public static void main(String[] args) {
		Assignment51Interface p = new Assignment51Interface();
		p.Car();
		p.Accelerate();

	}

	public void Car() {
		System.out.println("Car method implementation");

	}

	public void Accelerate() {
		System.out.println("Accelerate method implementation");

	}
	

}
