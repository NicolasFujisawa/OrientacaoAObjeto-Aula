package cur.oo.review;

import java.util.Calendar;

public class GerenciadorDeDividas {
	private Pagamentos pagamentos = new Pagamentos();
	
	public void efetuaPagamento(Divida divida, double valor, String pagador, Cnpj cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setValor(valor);
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(pagador);
		pagamento.setData(Calendar.getInstance());
		pagamentos.registra(pagamento);
	}
	
	public void mostraPagamentos(Pagamentos pagamentos) {
		if(pagamentos == null) {
			return;
		}
		
		for(Pagamento pagamento : pagamentos) {
			pagamento.mostraPagamento();
		}
	}
}
