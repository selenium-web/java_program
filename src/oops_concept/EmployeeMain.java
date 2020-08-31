package oops_concept;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=new Address("pune", "India", "Maharashtra");
		Employee employee =new Employee(1, "Abhi", address);
		employee.display();
//		employee.city;  // not valid
	//	address.id; // not valid 
		

	}

}
