package cur.oo.review;

public class GerenciadorDeDividas {
	
	public void efetuaPagamento(Divida divida, double valor, String pagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setValor(valor);
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(pagador);
		divida.registra(pagamento);
	}
}
