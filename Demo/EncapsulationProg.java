package Demo;

class Enpr
{
	private String name = "Shubhangi";
	private String emailId = "shubhangi@gmail.com";
	public String getName() 
	{
		return name;
		
	}
	public void setName(String name) 
	{
		this.name = name;
		
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
		
	}


}

public class EncapsulationProg
{
	
	
	public static void main(String[] args)
	{
	
	Enpr p1 = new Enpr();
	System.out.println(p1.getEmailId());
	
	p1.setEmailId("abc@gmail.com");
	p1.getName();
	p1.setName("RUTVI..");
		

	}

}
