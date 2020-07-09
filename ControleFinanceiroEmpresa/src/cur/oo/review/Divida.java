package cur.oo.review;

public class Divida {
	private double total;
	private String credor;
	private Documento docCredor;
	private Pagamentos pagamentos = new Pagamentos();
	
	public Divida() {
		
	}
	
	public Divida(double valor, String credor, Documento docCredor) {
		this.setCredor(credor);
		this.setTotal(valor);
		this.setDocumentoCredor(docCredor);
		
	}
	
	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}
	public Documento getDocumentoCredor() {
		return this.docCredor;
	}
	public void setDocumentoCredor(Documento docCredor) {
		this.docCredor = docCredor;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}

	public double getValorPago() {
		return pagamentos.getValorPago();
	}
	
}
