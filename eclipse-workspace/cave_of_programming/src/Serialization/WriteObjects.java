package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing Objects...");
		
		Person[] people = { new Person(1, "abdou"), new Person(99, "Maro"), new Person(999, "Atssou") };
		ArrayList<Person>peopleList=new ArrayList<Person>();
		
		try {
			FileOutputStream fs = new FileOutputStream("people.bin");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(people);
			os.writeObject(peopleList);
			System.out.println(peopleList);
			os.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
