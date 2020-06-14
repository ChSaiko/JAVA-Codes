
public class App3 {

	public static void main(String[] args) {
		Calcul<String> c = new Calcul<>();

		double a = 8.9;
		double b = 9.5;
		System.out.println(c.comparer(a, b));

		String x = "azerty";
		String y = "azerty";
		System.out.println(c.comparer(x, y));

		Produit p1 = new Produit(999999L, "TOTO", 10.9999);
		Produit p2 = new Produit(999999L, "TOTO", 10.9999);

		System.out.println(c.comparer(p1, p2));
	}

}
