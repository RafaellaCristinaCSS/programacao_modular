package trabalho;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/* Lendo os arquivos */
		int livro_escolhido = 0;
		int cliente_escolhido = 0;
		Program p = new Program();
		System.out.println("Livro");
		 p.executar_leitura_livro(livro_escolhido);
		System.out.println("Cliete");
		 p.executar_leitura_cliente(cliente_escolhido);
	}

	public void executar_leitura_livro(int livro_escolhido) {
		File file_livro = new File(
			"C:\\Users\\Suporte\\Downloads\\PUC\\Laboratorio de Programação Modular\\Trabalho_6\\programacao_modular\\livro.txt");
		String[] arm_livro = new String[100];
		Scanner leitura_file_livro = null;
		try {
			leitura_file_livro = new Scanner(file_livro);
			int cont = 0;
			while (leitura_file_livro.hasNextLine()) {
				String line = leitura_file_livro.nextLine(); // Recebe as linhas do arquivo
				String[] livros = line.split(";"); // Separa o arquivo

				Livro livro = new Livro(livros[0], livros[1]);
				arm_livro[cont]=livro.getCodigo();
				cont++;
			}
			System.out.println(arm_livro[livro_escolhido]); 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (leitura_file_livro != null) {
				leitura_file_livro.close();
			}
		}
	}
	public void executar_leitura_cliente(int cliente_escolhido){
		File file_cliente = new File(
				"C:\\Users\\Suporte\\Downloads\\PUC\\Laboratorio de Programação Modular\\Trabalho_6\\programacao_modular\\cliente.txt");
				String[] arm_cliente = new String[100];
				
				Scanner leitura_file_cliente = null;
				try {
					leitura_file_cliente = new Scanner(file_cliente);
					int cont=0;
					while (leitura_file_cliente.hasNextLine()) {
						String line = leitura_file_cliente.nextLine(); // Recebe as linhas do arquivo
						String[] clientes = line.split(";"); // Separa o arquivo
		
						Cliente cliente = new Cliente(clientes[0], clientes[1]);
						arm_cliente[cont]=cliente.getMatricula();

					}
					System.out.println(arm_cliente[cliente_escolhido]);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				} finally {
					if (leitura_file_cliente != null) {
						leitura_file_cliente.close();
					}
				}
		
	}
}
