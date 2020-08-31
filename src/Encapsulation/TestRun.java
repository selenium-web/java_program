package Encapsulation;

public class TestRun {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setName("Abhi");
		s.setCity("Pune");
		s.setId(55);
		s.getName();
		s.getCity();
		s.getId();
		s.setStanderds(9);
		s.getStanderds();
		s.Country="USA";
	//	s.name;  //as veriable is private, itcan not be assccable in other class.
		 System.out.println(s.getName()+" "+s.getCity()+" "+s.getId()+" "+s.getStanderds()
		 +" "+s.Country+" "+s.state); 
	}

}
