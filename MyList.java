package collectionJava;

import java.util.ArrayList;

public class MyList {

	public static void main(String[] args) {
		//ArrayList formula = ArrayList<objectDataType>objectName = new ArrayList<ObjectDataType>();
		//Array Example 
		// String[] objName = new String [5];
		//String abc = new String ("hello");
		ArrayList<String>strList = new ArrayList<String>();
		strList.add("James");// we add James to the list
		strList.add("Jos");
		strList.add("Jim");
		strList.add("Jane");
		/*System.out.println(strList.get(1));
		strList.remove(1);
		System.out.println(strList.get(1));*/
		
		for (String item : strList) {
			System.out.println(item);
		}
		
	}

}
