package Programming_java_code;

import java.util.Scanner;


public class App_Useful_Trick {

	public static void main(String[] args) {
		// E.g 4!=4*3*2*1
		Scanner clavier =new Scanner(System.in);
		System.out.println("donner un entier"+clavier.nextInt());
		System.out.println(factorial(clavier.nextInt()));
	}

	private static int factorial(int value) {
		System.out.println(value);
		if (value == 1) {
			 return	 1;
		}
		return factorial(value - 1) * value;
	}
}
