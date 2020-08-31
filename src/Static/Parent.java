package Static;

public class Parent {
	
	int a=1;
	
	public Parent() {
        System.out.println("Parent Constructor");
    }    
    static {
        System.out.println("Parent static block");    
    }    
    {
        System.out.println("Parent initialisation / instance block");
    }
	public Parent(int id) {
		this.a=id;
        System.out.println("Parent Constructor");
    }   

}
