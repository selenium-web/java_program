package Static;

public class Counter {
	
	static int count=0; // static veriable gets memory allocated in class area only once at the time of class loading.
	static int x;
	String country;
	Counter()
	{
		count++;
        System.out.println(count);
	}
	
	static int cube(int x) {
		return x*x*x;
	}
	
	void show()
	{
		System.out.println(x);
	}

}
