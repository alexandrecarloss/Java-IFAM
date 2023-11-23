package controller;

import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class LivroController {
	private List<Livro> livros = new ArrayList<>();
	
	public void setLivro(Livro evento) {
		livros.add(evento);
	}
	
	public Livro getLivro(int indice) {
		return livros.get(indice);
	}
	
	public List<Livro> getTodosLivros() {
		return livros;
	}
	
	public int quantidadeLivro() {
		return livros.size();
	}
}
