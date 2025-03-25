package Demo;

public  class AccessSpecifier_WithinClass {
	
	public static void Add()
	{
		System.out.println("Add method public");
	}
	private void Mul()
	{
		System.out.println("Multiply method privata");
	}
	protected void SUb()
	{
		System.out.println("Sub method protected");
	}
	void Div()
	{
		System.out.println("Div method default");
	}

	public static void main(String[] args)
	{
		
     
     AccessSpecifier_WithinClass p = new AccessSpecifier_WithinClass();
     p.Mul();
     p.SUb();
     p.Div();
     Add();
	}

}
