package Method_Hiding;

class Parent {
	 
    public static void foo() {
        System.out.println("Inside foo method in parent class");
    }
    
    public void foor() {
        System.out.println("Inside foo method in parent class");
    }
 
    public void bar() {
        System.out.println("Inside bar method in parent class");
    }
}