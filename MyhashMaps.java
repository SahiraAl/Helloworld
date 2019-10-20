package collectionJava;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MyhashMaps {

	
		public static void main(String[] args) {
			Map<Integer,String> car =new HashMap<Integer,String>();
			car.put(5,"MBW");
			car.put(1,"Lexaz");
			car.put(7,"Nissan");
			car.put(6,"Jeep");
			car.put(9,"Toyota");
			car.put(3,"Tasla");
			for (int item : car.keySet()) {
				System.out.println(item);
		}   for (String item :car.values()) {
			System.out.println(item);
		}

}}
