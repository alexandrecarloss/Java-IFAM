package editora.model;

import java.util.ArrayList;
import java.util.List;

public class Pagina {
	private int numero;
	private List<String> linhas = new ArrayList<>();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<String> getLinhas() {
		return linhas;
	}
	public void inserirLinha(String linha) {
		linhas.add(linha);
	}
	
}
