package naveen;

public class RemoveJunkCharFromString {
	
	public static void main(String[] args)
	{
		String s="^^^%abhi13564";
		
		// use regular expression [^a-zA-Z0-9]
		// REMOVE IS NOTHING BUT REPLACE WITH NOTHING
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	}

}
