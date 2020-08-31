package oops_concept;

public class ThisKeyward {
	
	int rollNumber;
	String name;
    String course;
	int marks;
	
	public ThisKeyward(int rollNumber,String name,int marks) {
		
		// TODO Auto-generated constructor stub
		
		this.rollNumber=rollNumber;
		this.name=name;
		this.marks=marks;
	}
	
	public ThisKeyward (int rollNumber,String name,int marks,String course )
	{
		this(rollNumber,name,marks); // Call to this() must be the first statement in constructor.
		this.course=course;
	}
	
	void display( )
	{
		this.display1( );
		System.out.println("display is ");
	}
	
	public void display1( )
	{
		System.out.println("rollnumber is " +rollNumber+" "+"nmae is " +name+" "+"cource is "+course+" "+"marks is "+marks);
	}
	}


