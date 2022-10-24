package one.digitalinnovation.singleton;

/**
 * Singleton "Apressado"
 * @author juancassiano
 *
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
