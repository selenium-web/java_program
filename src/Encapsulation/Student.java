package Encapsulation;

public class Student {
	
	private String name;
	private String City;
	private int id;
	private int standerd=3;
	String Country="India";
	String state="MH";
	
	public void setStanderds(int standerd)
	{
		this.standerd= standerd;
	}
	
	public int getStanderds()
	{
		return standerd;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setCity(String City)
	{
		this.City=City;
	}

	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCity()
	{
		return City;
	}
	
	public int getId()
	{
		return id;
	}
}
