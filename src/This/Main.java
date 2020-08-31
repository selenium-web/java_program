package This;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1=new Address("MH","iNDIA");
	
		Student s1=new Student("Abhi", 44, 666, "Karanja",a1.get());
		System.out.println(s1.get());  // to test return current class object
		s1.get().dispaly();
		s1.dispaly();  // 
  System.out.print(s1.name);

	}

}
