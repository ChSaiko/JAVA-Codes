package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Per implements Comparable<Per> {
	String name;

	public Per(String name) {
		this.name = name;
	}

	public String toString() {
		return name;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Per other = (Per) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Per per) {
		// return name.compareTo(person.name);
		int len1 = name.length();
		int len2 = per.name.length();

		if (len1 > len2) {
			return 1;
		}
		if (len1 < len2) {
			return -1;
		} else {
			return  name.compareTo(per.name);
		}
	}

}

public class NaturalOrder {

	public static void main(String[] args) {

		List<Per> list = new ArrayList<Per>();

		SortedSet<Per> set = new TreeSet<Per>();

		addElements(list);
		addElements(set);

		Collections.sort(list);

		showElements(list);
		System.out.println();
		showElements(set);

	}

	private static void addElements(Collection<Per> col) {
		col.add(new Per("Ali"));
		col.add(new Per("Sami"));
		col.add(new Per("Hassen"));
		col.add(new Per("Bader"));
		col.add(new Per("Mohamed"));
	}

	private static void showElements(Collection<Per> col) {
		for (Per element : col) {
			System.out.println(element);
		}
	}
}