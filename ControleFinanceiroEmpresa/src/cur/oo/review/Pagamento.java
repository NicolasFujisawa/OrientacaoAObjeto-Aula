package cur.oo.review;

import java.util.Calendar;

public class Pagamento {
	private String pagador;
	private Documento docPagador;
	private double valor;
	private Calendar data;
	
	public void mostraPagamento() {
		System.out.println("Pagamento " + this.getPagador() + ":" + this.getDocumentoPagador() + ";");
		System.out.println("R$" + this.getValor() + " Data: " + this.getData());
	}
	
	public String getPagador() {
		return pagador;
	}
	public void setPagador(String pagador) {
		this.pagador = pagador;
	}
	public Documento getDocumentoPagador() {
		return docPagador;
	}
	public void setDocumentoPagador(Documento docPagador) {
		this.docPagador = docPagador;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
}
