package cur.oo.review;

public class Cnpj implements Documento {
	private String cnpj;
	
	public Cnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.getClass() != o.getClass()) {
			return false;
		}
		Cnpj c = (Cnpj) o;
		if(c.getValor().equals(this.getValor())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return cnpj.hashCode();
	}
	public void setCnpj(String cpnj) {
		this.cnpj = cpnj;
	}

    private int primeiroDigitoVerificador() {
        return getValor().charAt(0);
    }
    private int primeiroDigitoCorreto() {
        return 2;
    }
    private int segundoDigitoVerificador() {
    	return getValor().charAt(1);
    }
    private int segundoDigitoCorreto() {
        return 5;
    }
    
    @Override
    public String toString() {
    	return this.cnpj;
    }

	@Override
	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	@Override
	public String getValor() {
		return cnpj;
	}

}
