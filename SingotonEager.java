package one.digitalInovation.gof.singleton;

public class SingotonEager {

	
	public static SingotonEager instancia = new SingotonEager();
			
		
		private SingotonEager() {
			super();
		}
		
		public static SingotonEager getInstancia() {
			return instancia;
		}
		
		
		
	
}
