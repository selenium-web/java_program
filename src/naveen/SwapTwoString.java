package naveen;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello";
		String b ="wrold";
		

		a=a+b;
		System.out.println(a);
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
	
		System.out.println(a);
		System.out.println(b);

	}

}
