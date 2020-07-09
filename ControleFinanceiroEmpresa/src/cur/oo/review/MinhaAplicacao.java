package cur.oo.review;

public class MinhaAplicacao {

	public static void main(String[] args) {
		ArmazenadorDeDividas ad = new BancoDeDados("localhost", "usuario", "1234");
		BalancoEmpresa balanco = new BalancoEmpresa(ad);
		registraDividas(balanco);
		ad.desconecta();
	}
	
	private static void registraDividas(BalancoEmpresa balanco) {
		Divida divida1 = new Divida();
		Divida divida2 = new Divida();
				
		divida1.setCredor("Palmeiras");
		divida1.setDocumentoCredor(new Cnpj("42.432.4.432/043"));
		divida1.setTotal(1000);
		
		divida2.setCredor("Palmeiras");
		divida2.setDocumentoCredor(new Cnpj("42.423.4.423/042"));
		divida2.setTotal(560);
		
		balanco.registrarDivida(divida1);
		balanco.registrarDivida(divida2);
	}
}
