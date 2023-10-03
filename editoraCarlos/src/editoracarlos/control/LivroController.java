package editoracarlos.control;

import java.util.ArrayList;
import java.util.List;

import editoracarlos.model.Livro;

public class LivroController {
	private List<Livro> livros = new ArrayList<>();
	
	public void inserirLivro(Livro livro) {
		livros.add(livro);
	}
	
	public List<Livro> obterLivros(){
		return livros;
	}
	
	public Livro obterLivro(int i) {
		return livros.get(i);
	}

}
