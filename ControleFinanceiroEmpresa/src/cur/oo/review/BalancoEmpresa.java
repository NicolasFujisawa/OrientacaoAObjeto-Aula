package cur.oo.review;

public class BalancoEmpresa {
	
	private ArmazenadorDeDividas ad;
	
	public BalancoEmpresa(ArmazenadorDeDividas ad) {
		this.ad = ad;
	}
	
	public void registrarDivida(Divida divida) {		
		ad.salva(divida);
	}
	
	public void pagaDivida(Documento docCredor, Pagamento pagamento) {
		Divida divida = ad.carrega(docCredor);
		if(divida != null) {
			divida.registra(pagamento);
		}
		ad.salva(divida);
	}
}
