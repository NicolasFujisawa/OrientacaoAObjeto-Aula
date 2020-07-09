package cur.oo.review;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDividas {
	private final Map<Documento, Divida> dividasNoBando = new HashMap<Documento, Divida>();

	public BancoDeDados(String endereco, String usuario, String senha) {
		System.out.println("Conectado");
	}
	
	@Override
	public void salva(Divida divida) {
		dividasNoBando.put(divida.getDocumentoCredor(), divida);
	}
	
	@Override
	public Divida carrega(Documento documentoCredor) {
		return dividasNoBando.get(documentoCredor);
	}
	
	@Override
	public void desconecta() {
		System.out.println("Desconectado");
	}
}
