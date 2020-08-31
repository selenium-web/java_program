package Interface_3_may;

public class TestRunning {

	public static void main(String[] args) {
	
		Banking b=new BankSBI(); // one class can implement multiple interfaces
		b.getROI();
		
		Drawable d=new BankSBI(); // one class can implement multiple interfaces
		d.draw();
		d.play();             // interface can have default method
		Drawable.cube(6);     // interface can have static method
		
		Bike b3=new BankPNB(); // interface extends another interface
		b3.run();          // interface one, method
		b3.getROI();     // interface second method
		
		BankPNB p=new BankPNB();  // both interfaces have same methods print but implementation is one.
		p.print();
		
		Printable pt=new BankPNB();  // // both interfaces have same methods print but implementation is one.
		pt.print();
		
		Showable st=new BankPNB(); // both interfaces have same methods print but implementation is one.
		st.print();
		
	}

}
