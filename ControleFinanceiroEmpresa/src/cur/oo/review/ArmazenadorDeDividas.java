package cur.oo.review;

public interface ArmazenadorDeDividas {
	void salva(Divida divida);
	Divida carrega(Documento documentoCredor);
	void desconecta();
}
