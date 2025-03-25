package Demo;

class EncapsulationProgram
{
	private String emailId = "shubhangi.dharme@gmail.com";

	public String getEmailId() //camel case - firstletter is small and second letter in Caps
	//get or fetch the value
	{
		return emailId;
	}

	public void setEmailId(String emailId)// set value
	{
		this.emailId = emailId;
	}
}


public class EncapsultionProgramGetterSetter {

	public static void main(String[] args)
	{
		
	EncapsulationProgram p = new EncapsulationProgram();
	p.setEmailId("abc@skillsurvey.email");
	System.out.println(p.getEmailId());
	
		

	}

}
