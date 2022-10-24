package one.digitalinnovation.singleton;

/**
 *  Singleton "Lazy Holder"
 *  @author juancassiano
 */
public class SingletonLazyHolder {
	
	private static SingletonLazyHolder instancia;

	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazyHolder();
		}
		return instancia;
	}
	

}
