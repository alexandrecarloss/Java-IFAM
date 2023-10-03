package editora.model;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	private String titulo;
	private List<String> autores = new ArrayList<>();
	private List<Pagina> paginas = new ArrayList<>();
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<String> getAutores() {
		return autores;
	}
	public List<Pagina> getPaginas() {
		return paginas;
	}
	public void inserirAutor(String autor) {
		autores.add(autor);
	}
	public void inserirPagina(Pagina pagina) {
		paginas.add(pagina);
		pagina.setNumero(paginas.size());
	}
}
