package Sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import cadastrados.CadastrarAlimento;
import cadastrados.CadastrarEletronico;
import cadastrados.CadastrarProduto;

public class Sistema {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		CadastrarProduto cadastrarProduto = new CadastrarProduto();
		CadastrarAlimento cadastrarAlimento = new CadastrarAlimento();
		CadastrarEletronico cadastrarEletronico = new CadastrarEletronico();

		do {
			menu();
			int escolha = teclado.nextInt();

			switch (escolha) {

			case 1: {
				CadastrarProduto.newCadastrarProduto();
				continue;
			}
			case 2: {

				CadastrarAlimento.newCadastrarAlimento();
				continue;

			}

			case 3: {
				CadastrarEletronico.newCadastrarEletronico();
				continue;

			}

			case 4: {

				System.out.println(exibirDetalhes("Estoque.txt")); 

				continue;

			}

			case 9: {
				System.exit(0);
			}
			}

		} while (true);

	}

	static public void menu() {
		System.out.println(" ");
		System.out.println(" Bem vindo ao Sistema de Cadastro de Produto ");
		System.out.println(" ");
		System.out.println("-------------------------------------------------");
		System.out.println("1 -     Cadastrar um Novo Produto");
		System.out.println("2 -     Cadastrar um Novo Alimento");
		System.out.println("3 -	Cadastrar um Novo Eletronico");
		System.out.println("4 -     Exibir informações Dos Itens Cadastrados");
		System.out.println("9 -     Sair do Sistema");
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
	}
	
	public static String exibirDetalhes(String fileName) {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			/*Executar o loop de repetição enquanto a variavel lida
			 * no aruivo for diferente de nulo
			 */
			while((line = reader.readLine()) != null) {
				//escrevendo conteudo na variavel
				content.append(line).append("\n");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler do arquivo:" + e.getMessage());
		}
		return content.toString();
	}
}
