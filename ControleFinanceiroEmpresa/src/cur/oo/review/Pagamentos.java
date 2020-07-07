package cur.oo.review;

import java.util.ArrayList;
import java.util.Calendar;

public class Pagamentos extends ArrayList<Pagamento>{
	private double valorPago;
	
	public Pagamentos pagamentosAntesDe(Calendar data) {
		Pagamentos pagamentos = new Pagamentos();
		for(Pagamento pagamento : this) {
			if(pagamento.getData().before(data)) {
				pagamentos.add(pagamento);
			}
		}
		return pagamentos;
	}

	public boolean add(Pagamento pagamento) {
		if(pagamento == null) {
			return false;
		}
		this.add(pagamento);
		return true;
	}
	
	private void paga(double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("valor invalido para pagamento");
		}
		if(valor > 100) {
			valor -= 8;
		}
		this.valorPago += valor;;
	}
	
	public void registra(Pagamento pagamento) {
		this.add(pagamento);
		this.paga(pagamento.getValor());
	}
	
	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
}
