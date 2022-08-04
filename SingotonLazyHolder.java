package one.digitalInovation.gof.singleton;

/**
*@see <a href="https://stackoverflow.com/a/24018148">Referencia</a> 
**/
public class SingotonLazyHolder {
	
	private static class InstanceHolder {
		public static SingotonLazyHolder instancia = new SingotonLazyHolder();
	}
	
	private SingotonLazyHolder() {
		super();
	}
	
	public static SingotonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
	

}
