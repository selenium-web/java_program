package Final;

public class main extends Final_class{
	
	main(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	void show()             // final method can not be override  
	{
		System.out.println("method overridding");
	}

	public static void main(String[] args) {
		
		Final_class fc=new Final_class(77);
		fc.display();   // final method can be inherited.
		
		// // final veriables should be initialized inside the constructor only.
//		fc.id=99;
//		fc.name="Gayatri";
//		fc.country="Japan";
		fc.city="Pune";
		fc.display();
		fc.show();

	}

}
