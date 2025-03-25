package Demo;

class Google {
	

	void login()
	{
		System.out.println("base class Login by mobile");
	}
}

public class MethodOverride extends Google 
{
	void login() 
	{
        super.login();
		System.out.println(" child class login by gmail");

	}

	public static void main(String[] args) 
	{
        MethodOverride m = new MethodOverride();
		m.login();
		//m.logins();
//		Google p = new MethodOverride();
//		p.login();
		

	}
}
