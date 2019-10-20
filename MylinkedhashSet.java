package collectionJava;

import java.util.LinkedHashSet;
import java.util.Set;
// linkedhashset maintains order
public class MylinkedhashSet {

	public static void main(String[] args) {
		Set<String> lhs =new LinkedHashSet<String>();
		lhs.add("Sara");
		lhs.add("Sanba");
		lhs.add("Sana");
		lhs.add("Sally");
		lhs.add("Kara");
		lhs.add("Santa");
		lhs.add("Sasa");
		lhs.add("Say");
		lhs.add("Sarah");
		lhs.add("Satba");
		lhs.add("Sava");
		lhs.add("Salm");
		for (String item : lhs) {
			System.out.println(item);
	
		
		}

	}

}
