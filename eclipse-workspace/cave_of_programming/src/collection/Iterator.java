package collection;

import java.util.LinkedList;

public class Iterator {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("dog");
		animals.add("cat");
		animals.add("bear");

		// Iterator<String> vb=animals.iterator();
		java.util.Iterator<String> it = animals.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			if (value.equals("cat")) {
				it.remove();
				// here if the value =cat then delete cat
				// here we are used the LinkedList because we remove a item(cat) in the List
			}
		}
		System.out.println(animals);

		/// modern iteration ,Java5+
		for (String animal : animals) {
			System.out.println(animal);

			animals.remove();
		}
	}

}
