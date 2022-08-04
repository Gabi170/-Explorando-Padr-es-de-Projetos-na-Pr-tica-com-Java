package subsistema1.crm;

public class CrmServoce {

	private CrmServoce(){
		super();
	}
	
	public static void gravarCliente(String nomo, String cep, String cidade , String estado) {
		System.out.println("Cliente salvo no sistema de Crm.");
		System.out.println(nomo);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		
	}
}
