package one.digitalInovation.gof.singleton;

public class SingontonLazy {
	
	private static SingontonLazy instancia;
	
	private SingontonLazy() {
		super();
	}
	
	public static SingontonLazy getInstancia() {
		
		if(instancia == null) {
			instancia = new SingontonLazy();
		}
		return instancia;
	}

}
