package editora.view;

import java.util.List;
import java.util.Scanner;

import editora.control.LivroController;
import editora.model.Livro;
import editora.model.Pagina;

public class LivroView {
	
	private LivroController livroController;
	
	private LivroView() {}
	
	public LivroView(LivroController livroController) {
		this.livroController = livroController;
	}
	
	public void cadastrarLivro() {
		Scanner eTitulo = new Scanner(System.in);
		Scanner eAutor = new Scanner(System.in);
		Scanner eNovoAutorSN = new Scanner(System.in);
		
		Livro livro = new Livro();
		
		System.out.println("Cadastro de Livro");
		System.out.print("Informe o título: ");
		livro.setTitulo(eTitulo.nextLine());
		do {
			System.out.print("Informe o autor: ");
			livro.inserirAutor(eAutor.nextLine());;
			System.out.print("Deseja informar outro autor (S/N) ?");
		}while(eNovoAutorSN.next().toLowerCase().equals("s"));

		livroController.inserirLivro(livro);
	}
	
	public void listarLivros() {
		int i = 1;
		for(Livro livro: livroController.obterLivros())
			System.out.printf("%d. %s\n", i++, livro.getTitulo());
	}
	
	public void cadastrarPaginas() {
		Scanner eLivro = new Scanner(System.in);
		Scanner eLinha = new Scanner(System.in);
		Scanner eNovaPaginaSN = new Scanner(System.in);
		Scanner eNovaLinhaSN = new Scanner(System.in);
		
		System.out.println("Cadastro de páginas");
		listarLivros();
		System.out.print("Informe o número do livro: ");
		int indiceLivro = eLivro.nextInt()-1;
		Livro livro = livroController.obterLivro(indiceLivro);
		do {
			Pagina pagina = new Pagina();
			System.out.printf("Escrevendo a página %d:\n", livro.getPaginas().size()+1);
			int iLinha=1;
			do {
				System.out.printf("Escreva o conteúdo da %da linha:", iLinha++);
				pagina.getLinhas().add(eLinha.nextLine());
				System.out.print("Deseja escrever outra linha (S/N) ?");
			}while(eNovaLinhaSN.next().toLowerCase().equals("s"));
			livro.inserirPagina(pagina);
			System.out.print("Deseja escrever outra pagina (S/N) ?");
		}while(eNovaPaginaSN.next().toLowerCase().equals("s"));
	}
	
	public void mostrarLivro() {
		Scanner eLivro = new Scanner(System.in);
		listarLivros();
		System.out.print("Informe o número do livro: ");
		Livro livro = livroController.obterLivro(eLivro.nextInt()-1);
		System.out.printf("Título: %s\n", livro.getTitulo());
		System.out.print("Autores: ");
		for(String autor:livro.getAutores()) {
			System.out.printf("%s\n", autor);
		}
		System.out.print("Páginas: ");
		for(Pagina pagina:livro.getPaginas()) {
			System.out.printf("Número: %d\n", pagina.getNumero());
			for(String linha:pagina.getLinhas())
				System.out.println(linha);
		}
		
	}
	
	
}
