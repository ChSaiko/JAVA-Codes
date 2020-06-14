package collection;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Collections13 {

	public static String[] vehicules = { "Toyota", "Nissan", "Land Rover", "Scoda" };
	public static String[][] drivers = { { "Fred", "Sue", "Richard", "Tommy", "Lio" }, { "Bob", "Miek", "Alex" },
			{ "Ronny", "Nancy" }, { "Raul", "Rodri" } };
	/*
	 * Ici il faut le nbrs de items de vehicules egale sous tableau de tableau
	 * multidimensionels de drivers si le nbres de vehicules est sup de sous tab de
	 * drivers il y'a une Exception de type ArrayIndexOutOfBoundsException
	 */

	public static void main(String[] args) throws Exception {

		Map<String, Set<String>> persones = new LinkedHashMap<String, Set<String>>();

		for (int i = 0; i < vehicules.length; i++) {

			String vehicule = vehicules[i];
			String[] driverList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : driverList) {
				driverSet.add(driver);
			}
			persones.put(vehicule, driverSet);
		}
		// example usage
		Set<String> driverList = persones.get("Toyota");

		for (String driver : driverList) {
			System.out.println(driver);
		}
		// Iterate through whole thing

		for (String vehicule : persones.keySet()) {

			System.out.println((vehicule)+": ");

			Set<String> driverSet = persones.get(vehicule);

			for (String driver : driverSet) {
				System.out.print(driver);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
