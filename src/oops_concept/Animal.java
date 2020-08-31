package oops_concept;

public class Animal {
	
	String name;
	
	public void eat( )
	{
		System.out.println("eat method");
	}
	public void dogname( )
	{
		System.out.println("dog name is "+name);
	}
    Animal(String name )
    {
      this.name=name;   	
    }
}
