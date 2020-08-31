package Access_Modifier;

public class Private_class {
	
	private int id;
	String name; 
	protected String country;
	
	
	public Private_class()
	{
		System.out.println("private constructor");
		
	}
	
	void show()
	{
		System.out.println("Default method");
	}
	
	private Private_class(String name)
	{
		System.out.println("private constructor");
		this.name=name;
	}
	
	private void display()
	{
		System.out.println(id+" "+name);
		System.out.println("private method");
	}
	
	protected void hide()
	{
		System.out.println("protected method");
	}
	
	public static void main(String[] arg)
	{
		Private_class pc=new Private_class("Abhi");
		pc.id=66;
		pc.name="Gayatri";
		pc.display();		
	}

}
