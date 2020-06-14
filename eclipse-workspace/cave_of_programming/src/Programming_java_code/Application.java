package Programming_java_code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World of Java");
		System.out.println();

		String test = "Hello";
		String blank = " ";
		String name = "Ch";
		String somme = test + blank + name;
		System.out.println(somme);
		System.out.println();

		int value = 0;
		boolean loop = 4 < value;// true;
		System.out.println(loop);
		while (loop) {
			System.out.println("Hi there");
			value++;

		}
		System.out.println();

		for (int i = 0; i <= 5; i = i + 1) {
			System.out.println("Hi back");
			System.out.printf("The value is: %d\n", i);
		}
		System.out.println();

		int myInt = 15;
		if (myInt < 10) {
			System.out.println("yes, it's false");
		} else if (myInt > 20) {
			System.out.println("No think happen");

		} else {
			System.out.println("true");
		}
		System.out.println();

		// Create scanner object

		// Output the prompt
		System.out.println("Enter a integer: ");
		// wait for the user to enter something
		Scanner clavier = new Scanner(System.in);
		// Tell them what they entered
		System.out.println("You entered: " + clavier.nextInt());
		System.out.println();

		int bool = 0;
		while (bool <= 7) {
			System.out.println("Looping " + bool);
			bool++;
			if (bool == 3) {
				continue;
			}
			if (bool == 5) {
				break;
			}
			System.out.println("Running" + bool);

		}

		Scanner text = new Scanner(System.in);
		System.out.println("Please enter a command");
		String word = text.nextLine();
		switch (word) {
		case "start":
			System.out.println("Machine Started");
			break;
		case "stop":
			System.out.println("Machine Stopped");
			break;
		default:
			System.out.println("Command not recognized");
			break;

		}

		String info = "";
		info += "My name is Amine,";
		info += " ";
		info += "I'm a Full-stack developer";
		System.out.println(info);/*
									 * this program take a lot of memory car here every info+ est prend comme un
									 * nouveaux variable avec un nouveaux espace mémoire
									 */

		// stringBuilder
		// we use a StringBuilder to make all the variable in the some memoire
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Sue,").append(" ").append("I am a lion");
		System.out.println(sb);
		System.out.println();
		/// formating
		System.out.println("there is some text.\that was a tab.\n that was a navline");
		System.out.println("More text");
		float d = 5.03f;
		int dd = 120;
		System.out.printf("Total cost %10f D quantity is %d", d, 120);
		// toString method
		Frog forg1 = new Frog();
		System.out.println(forg1);
		// generics Class
		// before Java 5
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		// Modern syntax List
		List<String> Strings = new ArrayList<String>();
		Strings.add("cat");
		Strings.add("dog");
		Strings.add("Jagua");

		String animal = Strings.get(2);
		System.out.println(animal);
		// Reading Files Using Scanner
		/*
		 * String FileName = "C:\\Users\\DELL\\Desktop"; File textFile = new
		 * File(FileName);
		 * 
		 * Scanner in = new Scanner(textFile); int count = in.nextInt(); while
		 * (in.hasNextLine()) { String line = in.nextLine(); System.out.println(count +
		 * ":" + line); System.out.println(line); }
		 */
		// Reading Files with File Reader
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		// lire ligne par ligne
		String line;
		line = br.readLine();
		while (br.readLine() != null) {
			System.out.println(line);
		}
		br.close();
		System.out.println();
		// Creating and Writing Text Files
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.close();

		Double value1 = 7.2, value2 = 7.2;
		Integer number1 = 6, number2 = 6;
		System.out.println(number1 == number2);
		System.out.println(value1 == value2);

		/*
		 * on utlise person1.equal(person2):pour comparer deux objets on utilise le
		 * double égale(==) pour comparer des attribues numériques ou des strings
		 */

		System.out.println("Try-With Resources");

		try (Temp temp = new Temp()) {
			// temp.close();
		}
		Robot robot = new Robot(7);
		robot.start();
	}
}
