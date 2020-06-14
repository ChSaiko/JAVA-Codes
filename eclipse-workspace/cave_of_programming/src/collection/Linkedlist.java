package collection;

import java.util.*;
//import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		/*
		 * ArrayList manage arrays internally. [0][1][2][3][4] ...
		 */
		/*
		 * LinkedList consists of elements where each elements has a reference to the
		 * previous and next element [0]->[1]->[2] <- <-
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedlist = new LinkedList<Integer>();

		// if you want to add or remove a items from the first or the last place of tab
		// use a ArrayList
		// if you want to remove or add a items in anywhere of tab
		// use a LinkedList

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedlist);
	}

	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);

		}

		long start = System.currentTimeMillis();

		// Add items at end of list
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		// Add items elsewhere in list
		for (int i = 0; i < 1E5; i++) {
			list.add(list.size() - 100, i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + "ms for " + type);
	}
}
