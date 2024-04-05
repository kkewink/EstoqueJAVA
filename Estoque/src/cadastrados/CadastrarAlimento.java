package cadastrados;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import models.Alimento;

public class CadastrarAlimento {

	static ArrayList<Alimento> alimentos = new ArrayList<Alimento>();

	static Scanner teclado = new Scanner(System.in);

	public static void newCadastrarAlimento() {

		String nome = "";
		String descricao = "";
		int codigo = 0;
		int quantidade = 0;
		double preco = 0;
		String data = "";
		LocalDate validade = LocalDate.now();

		System.out.println("-----------------------------------------------");
		System.out.println("Cadastro do Alimento");

		boolean nomeErro = false;
		while (nomeErro == false) {
			System.out.println("Digite o Nome do Alimento: ");
			try {
				nome = teclado.nextLine();
				if (nome.length() == 0) {
					System.err.println("------NÂO DEIXE EM BRANCO------");
					continue;
				} if (nome.length() < 3) {
					System.err.println("------MINIMO DE CARACTERIS 3------");
				}  
				else {	nomeErro = true;
				}
			} catch (Exception e) {

			}

		}

		boolean descricaoErro = false;
		while (descricaoErro == false) {
			System.out.println("Digite a Descrição do Alimento: ");
			try {
				descricao = teclado.nextLine();
				if (descricao.length() == 0) {
					System.err.println("------NÂO DEIXE EM BRANCO------");
					continue;
				} if (descricao.length() < 3) {
					System.err.println("------MINIMO DE CARACTERIS 3------");
				} 
				else {

					descricaoErro = true;
				}
			} catch (Exception e) {

			}

		}

		boolean codigoErro = false;
		while (codigoErro == false) {
			System.out.println("Digite o codigo de barra do Alimento: ");

			try {
				codigo = teclado.nextInt();
				if (codigo < 0) {
					System.err.println("-------DIGITE UM VALOR POSITIVO-----");
				} else {
					codigoErro = true;
				}
			} catch (Exception e) {
				System.err.println("-------DIGITE APENAS NUMEROS------");
			}
			teclado.nextLine();
		}

		boolean quantidadeErro = false;
		while (quantidadeErro == false) {
			System.out.println("Digite quantos Alimentos ira comprar: ");

			try {
				quantidade = teclado.nextInt();
				if (quantidade < 0) {
					System.err.println("-------DIGITE UM VALOR POSITIVO-----");
				} else {
					quantidadeErro = true;
				}
			} catch (Exception e) {
				System.err.println("-------DIGITE APENAS NUMEROS------");
			}
			teclado.nextLine();
		}

		boolean precoErro = false;
		while (precoErro == false) {
			System.out.println("Digite o valor deste Alimento: ");

			try {
				preco = teclado.nextDouble();
				if (preco < 0) {
					System.err.println("-------DIGITE UM VALOR POSITIVO-----");
				} else {
					precoErro = true;
				}
			} catch (Exception e) {
				System.err.println("-------DIGITE APENAS NUMEROS------");
			}
			teclado.nextLine();
		}

		Alimento a = new Alimento(nome, descricao, codigo, quantidade, preco);
		//alimentos.add(a);

		boolean dataErro = false;
		LocalDate newDate = LocalDate.now();

		while (dataErro == false) {
			try {
				System.out.println("Digite a data de validade: yyyy-MM-dd");
				data = teclado.nextLine();
				a.getValidade().parse(data);
				newDate = LocalDate.parse(data);
				
				
				if(newDate.compareTo(LocalDate.now()) <= 0) {
					System.err.println("COLOQUE UMA DATA QUE AINDA NÂO CHEGOU");
					continue;
				}
				
				
				a.setValidade(newDate);
				if (data.length() < 10) {
					System.err.println("DIGITE NA MANEIRA CORRETA");
				} else {
					dataErro = true;
				}
			} catch (Exception e) {
				System.err.println("DIGITE DE FORMA CORRETA");
			}
		}
		
		String dadoA = "Alimento: "+nome+" | Descrição: "+descricao+" | Codigo de Barra: "+codigo+" | Quantidade do Produto: "+quantidade+" | Preço do Produto: "+preco+" | Validade: "+ data;
		a.gravarEstoque("Estoque.txt",dadoA);
		
		System.out.println(" NOVO ALIMENTO CADASTRADO COM SUCESSO!!!!");
		System.out.println("-----------------------------------------------");

	}

	public void exibirAlimento() {
		alimentos.forEach(alimentoCadastrado -> {
			alimentoCadastrado.exibirInfo();

		});
	}

}