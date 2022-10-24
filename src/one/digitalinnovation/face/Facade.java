package one.digitalinnovation.face;

import one.digitalinnovation.subsistema.cep.CepApi;
import one.digitalinnovation.subsistema.crm.CrmService;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
