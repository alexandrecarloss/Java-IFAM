package editoracarlos.view;

import java.util.Scanner;

import editoracarlos.control.LivroController;

public class MenuEditoraView {
	
	public void mostrarMenu() {
		Scanner opcaoMenu = new Scanner(System.in);
		int opcao = 0;
		LivroView livroView = new LivroView(new LivroController());
		
		do {
			System.out.println("1. Cadastrar Livro");
			System.out.println("2. Cadastrar Páginas");
			System.out.println("3. Listar Livros");
			System.out.println("4. Ver um Livro");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = opcaoMenu.nextInt();
			
			switch(opcao) {
			case 1:
				livroView.cadastrarLivro();
				break;
			case 2:
				livroView.cadastrarPaginas();
				break;
			case 3:
				livroView.listarLivros();
				break;
			case 4:
				livroView.mostrarLivro();
			}
		} while(opcao != 5);
		
	}
}
