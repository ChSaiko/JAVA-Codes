package Programming_java_code;

public class Debugging {

	public static void main(String[] args) {
		int value = 2;
		System.out.println("Starting");
		
		System.out.println("Inc value: " + (value++));
		System.out.println("Inc value: " + (value++));
		System.out.println("look the difference betwen the tow lines of code:");
		System.out.println("Inc value: " + (+value));
		System.out.println("Inc value: " + (++value));

		System.out.println("Finishing");
	}

}
