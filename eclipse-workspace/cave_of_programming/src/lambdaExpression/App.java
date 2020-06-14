package lambdaExpression;

interface Executable {
	int execute(int a);
}

interface StringExecutable {
	int execute(String a);
}

class Runner {

	public void run(Executable e) {
		System.out.println("Executing code...");
		int value = e.execute(99);
		System.out.println("The value is: " + value);
	}

	public void run(StringExecutable e) {
		System.out.println("Executing code...");
		int value = e.execute("***********");
		System.out.println("The value is: " + value);
	}

}

public class App {

	public static void main(String[] args) {

		Runner runner = new Runner();
		/*
		 * ici on declare une fonction run avec une redefinition de methode
		 * d'implementation
		 */
		/*
		 * runner.run(() -> {
		 * System.out.println("there is code pass in lambda expression");
		 * System.out.println("Hello there"); return 8; });
		 * 
		 * runner.run(() -> { return 8; });===runner.run(() -> return 8; );
		 * 
		 * runner.run((int a) -> 8);
		 */
		runner.run(new StringExecutable() {
			//here if we have one method and have a variable in bracket just we tap the name of variable without nature of variable
			public int execute( String a) {
				System.out.println("Hello there");

				return 7;
			}
		});
		System.out.println("=================");
		// here we use the lambda expression with the new Java 8
		// here the lambda expression in one line:if we have a simple instruction
		runner.run((int a) -> {
			System.out.println("Hello there");

			return 999;
		});
 
	}
}
