package cur.oo.review;

public class Divida {
	private double total;
	private String credor;
	private Cnpj cnpj;
	private Pagamentos pagamentos = new Pagamentos();
	
	public Divida() {
		
	}
	
	public Divida(double valor, String credor, Cnpj cnpjCredor) {
		this.setCredor(credor);
		this.setTotal(valor);
		this.getCnpj().setCnpj(cnpjCredor.getCnpj());
		
	}
	
	
	public Cnpj getCnpj() {
		return cnpj;
	}
	
	public Pagamentos getPagamentos() {
		return pagamentos;
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
	
}
