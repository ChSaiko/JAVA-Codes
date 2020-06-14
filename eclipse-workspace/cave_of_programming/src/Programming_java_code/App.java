package Programming_java_code;

public class App {
	/*
	 * public static final int DOG = 0; public static final int CAT = 1; 
	 * public static final int MOUSSE = 2;
	 */
	public static void main(String[] args) {
		Animal animal = Animal.CAT.DOG;
		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSSE:
			System.out.println("Moussse");
			break;
		default:
			break;

		}
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.MOUSSE.getName());
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
	}

}
