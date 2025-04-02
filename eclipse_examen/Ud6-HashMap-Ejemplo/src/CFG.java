// Java program to convert a HashMap
// to an ArrayList

import java.util.*;

public class CFG {
	public static void main(String[] args)
	{
		// Create an empty hash map
		HashMap<String, Integer> map
			= new HashMap<>();

		// Add elements to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Finding the Set of keys from
		// the HashMap
		Set<String> keySet = map.keySet();

		// Creating an ArrayList of keys
		// by passing the keySet
		ArrayList<String> listOfKeys
			= new ArrayList<String>(keySet);

		// Getting Collection of values from HashMap
		Collection<Integer> values = map.values();

		// Creating an ArrayList of values
		ArrayList<Integer> listOfValues
			= new ArrayList<>(values);

		System.out.println("The Keys of the Map are "
						+ listOfKeys);

		System.out.println("The Values of the Map are "
						+ listOfValues);
	}
}

