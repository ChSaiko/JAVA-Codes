package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*class Temp {

}*/

public class Sortedmaps {

	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		// A LinkedHashMap take the key and the value and syso in her natural order
		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();

		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		// this is a 3 types of map
		// System.out.println(new Temp());

		/* the HashMap give the result aleatoir */
		testMap(hashmap);
		System.out.println();
		/* the treeMap give the result in order */

		testMap(treemap);
		System.out.println();
		/* the LinkHashMap give the result like we are declared */

		testMap(linkedhashmap);
		//LinkedMap give the result in her natural order
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(10, "fox");
		map.put(90, "cat");
		map.put(92, "dog");
		map.put(98, "giraffe");
		map.put(95, "bear");
		map.put(99, "snake");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}

}
