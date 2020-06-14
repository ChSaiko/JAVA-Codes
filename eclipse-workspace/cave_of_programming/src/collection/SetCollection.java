package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		// HashSet does not retain order
		Set<String> set1 = new HashSet<String>();

		// LinkedHashSet remembers the order you added the items in
		Set<String> set2 = new LinkedHashSet<String>();

		// TreeSet retain in order
		Set<String> set3 = new TreeSet<String>();
		
		//Here the set1 has not a value then the result is empty
		if (set1.isEmpty()) {
			System.out.println("Set is empty");
		}
		//her we added a value in set1 that is why we can't declarate empty again
		set1.add("dog");
		set1.add("cat");
		set1.add("mousse");
		set1.add("snake");
		set1.add("bear");
		if (set1.isEmpty()) {
			System.out.println("Set is empty");
		}
		// Adding duplicate items does nothing
		set1.add("mousse");

		System.out.println((set1));
		System.out.println();

		set2.add("Orange");
		set2.add("Banana");
		set2.add("Apple");
		set2.add("Farise");
		set2.add("Kewi");

		set3.add("A");
		set3.add("B");
		set3.add("G");
		set3.add("F");
		set3.add("W");
		set3.add("O");
		set3.add("I");
		set3.add("P");
		set3.add("Z");
		set3.add("J");

		// in any type of set we can't add the same items because set can't accept the
		// reputation
		set2.add("Kewi");
		System.out.println(set2);
		for (String element : set1) {
			System.out.println(element);
		}
		if (set1.contains("aadvark")) {
			System.out.println("Contains aadvark");
		}
		if (set1.contains("cat")) {
			System.out.println("Contains cat");
		}
		System.out.println(set3);
	}

}
