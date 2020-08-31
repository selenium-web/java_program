package Method_Hiding;

public class Code {
	
/*	/ image 16:
		in overriding, once method in parent classs is override ( redefined ) in child class, parent class method (old method) 
		 is not available for child class as it newly defined in child class, 
		 hence with child class or parent class reference ( P p = new C() ot C c = new C() ) with child class object 
		 always child class method gets called or execute. 

		image 17: 
		In method hiding or overloading :
		in method hiding, once static method in parent classs is override ( redefined ) with static method in child class, 
		parent class method (old method)  is also available with new child class though it newly defined in child class, 
		hence with parent class reference ( P p = new C() ) parent method gets called and for  child class reference C c = new C() ) 
		 child class method gets called or execute. /*/
	 
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();
        System.out.println("****************Method Hiding*******************");
        p.foo(); // This will call method in parent class  as object reference type is of parent class.
        c.foo(); // This will call method in parent class as object reference type is of parent class.
        System.out.println("****************Method overloading*******************");
        p.foor(); // This will call method in parent class as object reference type is of parent class.
        c.foor(); // This will call method in parent class as object reference type is of parent class.
        System.out.println("****************Method overriding*******************");
        p.bar(); // This will call method in parent class as object reference type is of parent class.
        c.bar(); // This will call method in child class as object reference type is of child class.
 
    }
}
