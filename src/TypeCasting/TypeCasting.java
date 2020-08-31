package TypeCasting;

public class TypeCasting {
	
	public static void main(String[] args)
	{
		
	//	 One o = new Two(); // Super class reference refers to sub class object. 
	 //    Two t = (Two)o; // Converting super class reference type into sub class reference type. 
		
//		Object o = new String("Durga");
//		StringBuffer sb = (StringBuffer)o; 
		
		// Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be 
	// 	cast to java.lang.StringBuffer
		// String and StringBuffer are at same level. 
	
//		String s = new String("Durga");
//		StringBuffer sb = (StringBuffer)s;  
//		
		Object o1 = new String("Durga");
		String sb1 = (String)o1; 
		
		Number r = new Integer(1);
		Object o = (Object)r;
		
	}

}
