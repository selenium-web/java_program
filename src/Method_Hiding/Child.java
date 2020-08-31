package Method_Hiding;

class Child extends Parent {
    // Hiding
    public static void foo() {
        System.out.println("Inside foo method in child class");
    }
 
    // Overriding
    public void bar() {
        System.out.println("Inside bar method in child class");
    }
    
    // Overloading
    public void foor(int id) {
        System.out.println("Inside foo method in child class");
    }
}
