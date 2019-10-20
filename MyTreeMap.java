package collectionJava;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap{
	
	public static void main(String[] args) {
		
		Map<Integer,String> car =new TreeMap<Integer,String>();
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
	// how to print the key ant the value formula
	for(Map.Entry<Integer, String>item: car.entrySet()) {
		int key = item.getKey();
		String value = item.getValue();
		System.out.println(key+ " : "+ value);
	}
}}


