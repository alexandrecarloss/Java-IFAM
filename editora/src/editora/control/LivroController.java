package editora.control;

import java.util.ArrayList;
import java.util.List;

import editora.model.Livro;

public class LivroController {
	private List<Livro> livros = new ArrayList<>();
	
	public void salvar(Livro livro) {
		livros.add(livro);
	}
	
	public void salvar(int i, Livro livro) {
		livros.set(i, livro);
	}
	
	public List<Livro> obterLivros(){
		return livros;
	}
	
	public Livro obterLivro(int i) {
		return livros.get(i);
	}

}
