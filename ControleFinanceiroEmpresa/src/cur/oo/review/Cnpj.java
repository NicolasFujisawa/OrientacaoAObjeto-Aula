package cur.oo.review;

import javax.crypto.IllegalBlockSizeException;

public class Cnpj {
	private String cnpj;
	
	public Cnpj(String cnpj) throws IllegalBlockSizeException {
		if(cnpj.length() < 13) {
			throw new IllegalBlockSizeException("tamanho de variavel invalido");
		}
		this.cnpj = cnpj;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.getClass() != o.getClass()) {
			return false;
		}
		Cnpj c = (Cnpj) o;
		if(c.getCnpj().equals(this.getCnpj())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return cnpj.hashCode();
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cpnj) {
		this.cnpj = cpnj;
	}
	
	public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }
    private int primeiroDigitoVerificador() {
        return getCnpj().charAt(0);
    }
    private int primeiroDigitoCorreto() {
        return 2;
    }
    private int segundoDigitoVerificador() {
    	return getCnpj().charAt(1);
    }
    private int segundoDigitoCorreto() {
        return 5;
    }

}
