package trabalho;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File(
				"C:\\Users\\Suporte\\Downloads\\PUC\\Laboratorio de Programação Modular\\Trabalho_6\\programacao_modular\\in.txt");
		Scanner sc = null;
			try {
				sc = new Scanner(file);
				while (sc.hasNextLine()) {
					// String line = ;
					System.out.println(sc.nextLine());
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				if (sc != null) {
					sc.close();
				}
				}
			}
		
	}
