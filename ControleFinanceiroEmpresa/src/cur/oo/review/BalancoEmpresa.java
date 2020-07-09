package cur.oo.review;

import java.util.HashMap;

public class BalancoEmpresa {
	
	private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();
	
	public void registrarDivida(Cnpj credor, Divida divida) {		
		dividas.put(credor, divida);
	}
	
	public void pagaDivida(Cnpj cnpjCredor, Pagamento pagamento) {
		Divida divida = dividas.get(cnpjCredor);
		
		if(divida != null) {
			divida.registra(pagamento);
		}
	}
}
