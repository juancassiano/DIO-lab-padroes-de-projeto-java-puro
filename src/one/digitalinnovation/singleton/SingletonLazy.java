package one.digitalinnovation.singleton;

/**
 *  Singleton "Preguiçoco"
 *  @author juancassiano
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	

}
