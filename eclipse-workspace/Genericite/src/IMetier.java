import java.util.List;

public interface IMetier<T, U> {

	public T save(T o);

	public List<T> getALL();

	public T findOne(U id);

	public void update(T o);

	public void delete(U id);

	// une inteface génerique nous permet generalise les memes fonction
	// (getAll,delete,Update,find by...) pour de different interface on rassemble dans
	// un seul interface qui s'appelle "interface generique"
	// mais pour réutilise dans different classes type different(interface produit, inteface Fourniseur...) 
}
