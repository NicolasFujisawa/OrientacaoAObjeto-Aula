package cur.oo.review;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

public class Pagamentos {
	private double valorPago;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	public Pagamentos pagamentosAntesDe(Calendar data) {
		Pagamentos pagamentos = new Pagamentos();
		for(Pagamento pagamento : this.pagamentos) {
			if(pagamento.getData().before(data)) {
				pagamentos.getPagamentos().add(pagamento);
			}
		}
		return pagamentos;
	}
	
	private void paga(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("valor invalido para pagamento");
		}
		if(valor > 100) {
			valor -= 8;
		}
		this.valorPago += valor;;
	}
	
	public boolean foiRealizado(Pagamento pagamento) {
		return pagamentos.contains(pagamento);
	}
	
	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}
	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(ArrayList<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
}
