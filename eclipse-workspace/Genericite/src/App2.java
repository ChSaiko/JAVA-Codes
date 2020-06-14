import java.util.Date;

public class App2 {

	public static void main(String[] args) {
		Triplet<String, Double> o = new Triplet<>("A", "B", 7.3);
		System.out.println(o.getA());
		System.out.println(o.getB());
		System.out.println(o.getC());

		Triplet<Date, Float> o2 = new Triplet<>(new Date(), new Date(), (float) 7);
		System.out.println(o2.getA());
		System.out.println(o2.getB());
		System.out.println(o2.getC());

	}

}
