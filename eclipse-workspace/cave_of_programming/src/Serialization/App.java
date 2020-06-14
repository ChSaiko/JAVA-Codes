package Serialization;

public class App {

	public static void main(String[] args) {
		App app = new App();
		// *********************************************
		int value = 7;
		System.out.println("1.Value is: " + value);

		app.show(value);

		System.out.println("4.Value is: " + value);
		// *********************************************
		System.out.println();
		Person1 person = new Person1("Bob");
		System.out.println("1.Person is: " + person);
		app.show(person);
		System.out.println("4.person is: " + person);

	}

	public void show(int value) {
		System.out.println("2.Value is: " + value);

		value = 8;

		System.out.println("3.Value is: " + value);

	}

	public void show(Person1 person) {
		System.out.println("2.person is : " + person);

		person = new Person1("Mike");
		person.setName("Lee");

		System.out.println("3.person is: " + person);
	}
}
