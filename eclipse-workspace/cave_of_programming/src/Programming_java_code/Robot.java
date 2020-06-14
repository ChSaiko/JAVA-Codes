package Programming_java_code;

public class Robot {
	private static Integer id;

//un atribues static est un attribue du classe et qui est partage par toutes les instances de la classe
	public Robot(Integer id) {
		this.id = id;
	}

	public void start() {
		System.out.println("The Robo witch has the id: " + id + " starting");
	}

	public static void thinks() {
		System.out.println("Robot " + id + " is thinking");

	}

	public static void main(String[] a) {
		Robot robot = new Robot(148);
		robot.start();
		robot.thinks();
	}
}
