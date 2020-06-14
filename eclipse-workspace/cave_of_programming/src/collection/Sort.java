package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//here we use the comparator methode and we give them the variable witch we like to compare
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len2 > len1) {
			return -1;
		}
		return 0;
	}

	
	  class AlphabeticalComparator implements Comparator<String> {
	  
	  @Override public int compare(String s1, String s2) {
	  
	  return s1.compareTo(s2); }
	  
	  }
	 
public static class Sorting {
	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("elephant");
		animals.add("tigre");
		animals.add("lion");
		animals.add("snak");
		animals.add("mongoss");

		// Here we like to get the result in the order we can use: collections.sort(name
		// of the List=animals)
		Collections.sort((animals), new StringLengthComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);

		// Again here we want sort this list in order we use colections.sort(name of the
		// list=numbers)
		Collections.sort(numbers);

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
}
}
