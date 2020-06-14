package Programming_java_code;

public enum Animal {
	CAT("Tom"), DOG("Fido"), MOUSSE("Jerry");

	private String name;

	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "this animal is called " + name;
	}
}
