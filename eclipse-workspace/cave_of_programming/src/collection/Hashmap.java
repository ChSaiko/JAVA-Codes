package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Tow");

		map.put(4, "Hello");
		// here we declare a text type of String
		String text = map.get(4);
		System.out.println(text);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			// here w declare a variable named key type of in here value is map.getKey()
			int key = entry.getKey();

			// here we declare a variable of String name value =map.getValue()
			String value = entry.getValue();

			System.out.println(key + ":" + value);
		}
//HashMap sorted the result in order when the items not make in order
	}
}
