package Demo;

public class StringProg {

	public static void main(String[] args) {
		String s ="RUTVI";
		String r = "School";
		System.out.println(s.toLowerCase());
		System.out.println(r.toUpperCase());

		int a = r.length(); // length always start count from zero and length calculate
		                    //everything in " "
		
		System.out.println(a);
		

		System.out.println(s.charAt(0));

		String d = ("  Student   are good  ..");
		System.out.println(d);
		System.out.println(d.trim());

		String input = "Shubhangi";
		String I2 = "Shaligrem";
		String I3 = "Dharme";

		String p = input.concat(" ").concat(I2).concat(" ").concat(I3);
		System.out.println(p);

		String j = "Rutvi Gajanan Nagpure";

		boolean b = j.contains("Rutvi");
		System.out.println(b);

	}

}
