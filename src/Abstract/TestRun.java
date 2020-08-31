package Abstract;

public class TestRun {
	
	public static void main(String[] args)
	{
		Bank b=new SBI();
		b.getRateOfInterest();
		b.printAmount();
		
		Bank b1=new PNB();    // child class object with parent class reference we can call only parent class methods.
		b1.getRateOfInterest();
		b1.printAmount();
		b.finalMehtod();
		b.changeCity();
	//	b.dispaly();  // can not call child class methods.
		
		PNB p1=new PNB();  // child class object can call parent and child class methods.
		p1.display();
		p1.getRateOfInterest();
		p1.printAmount();
		p1.changeCity();
		p1.finalMehtod();
		p1.city="Amt"; 
		p1.display();
	}

}
