package Demo;
interface Amazon_I1
{
	void add();
	void sub();
	
}
public class Amazon_class_Inter implements Amazon_I1 {

	public static void main(String[] args) 
	{
		Amazon_class_Inter p= new Amazon_class_Inter();
		p.add();
		p.sub();

	}

	
	public void add()
	{
		System.out.println("1");
		
	}

	
	public void sub()
	{
		System.out.println("2");
		
	}

}
