
public class Couple<T> {
	// <T> la classe couple genere un parametre 
	//de type generique T
	private T a;
	private T b;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public Couple() {
		super();
	}

	public Couple(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

}
/*
 * on utilise génerallement un classe génerique ou une interface génerique, si on a les m^ methodes 
 * dans les differens classes filles ou les different interfaces
 *
 */