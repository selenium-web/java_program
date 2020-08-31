package Static;

public class Child extends Parent{
	
	{
        System.out.println("Child initialisation / instance block");
    }
    static {
        System.out.println("Child static block");
    }

    public Child() {
    	super(9);
        System.out.println("Child Constructor");
    }    
    public static void main(String[] args) {
    	System.out.println("main method");
    	Child c=new Child();    // In child class constructor first line is super (). ==> it will call parent class constructor to perform the initionlization of parent class properties.
                      // parent class constructor and before that initialization block gets called.
      // new Parent();
      // new Parent(5);
       System.out.println(c.a);
    }

}
