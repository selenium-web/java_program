package naveen;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementFromStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names [] = {"JAVA","SELENIUM","JAVA"};
		
		// USE HASHSET IN COLLECTION 
		
		Set<String> store = new HashSet<String>();
		for(String name:names)
		{
			if(store.add(name)==false)
				System.out.println(name);
		}		
	}
}
