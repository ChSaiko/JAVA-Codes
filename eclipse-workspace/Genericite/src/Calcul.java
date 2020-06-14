import java.util.Date;

public class Calcul<U> {
	private U x;

	public <T> boolean comparer(T a, T b) {
		if (a instanceof Produit) {
			// Quand j'ai cette type en fait cette traitement
			// Quand j'ai l'autre type je fais le traitement l'autre
		} else if (a instanceof String) {

		}

		return a.equals(b);

	}
}
