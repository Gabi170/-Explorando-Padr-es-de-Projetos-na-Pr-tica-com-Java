package one.digitalInovation.gof.facade;

import subsistem2.cep.CepApi;
import subsistema1.crm.CrmServoce;

public class Facade {

		public void migrarCliente(String nome, String cep) {
			String cidade = CepApi.getInstancia().recuperarCidade(cep);
			String estado = CepApi.getInstancia().recuperarEstado(cep);
			
			CrmServoce.gravarCliente(nome, cep, estado, cidade);
		}
	}


