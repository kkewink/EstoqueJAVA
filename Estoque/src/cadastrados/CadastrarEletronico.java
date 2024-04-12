package cadastrados;

import java.util.ArrayList;

import java.util.Scanner;

import models.Eletronico;

public class CadastrarEletronico {

	static ArrayList<Eletronico> eletronicos = new ArrayList<Eletronico>();

	static Scanner teclado = new Scanner(System.in);

	public static void newCadastrarEletronico() {

		String nome = "";

		String descricao = "";

		int codigo = 0;

		int quantidade = 0;

		double preco = 0;

		String marca = "";

		String modelo = "";

		System.out.println("-----------------------------------------------");

		System.out.println("Cadastro de Eletrônico");

		boolean nomeErro = false;

		while (nomeErro == false) {

			System.out.println("Digite o Nome do Eletrônico: ");

			try {

				nome = teclado.nextLine();

				if (nome.length() == 0) {

					System.err.println("------NÂO DEIXE ESPAÇOS EM BRANCO------");

					continue;

				}
				if (nome.length() < 3) {

					System.err.println("------MÍNIMO DE CARACTERES = 3------");

				}

				else {

					nomeErro = true;

				}

			} catch (Exception e) {

			}

		}

		boolean descricaoErro = false;

		while (descricaoErro == false) {

			System.out.println("Digite a Descrição do Eletrônico: ");

			try {

				descricao = teclado.nextLine();

				if (descricao.length() == 0) {

					System.err.println("------NÂO DEIXE ESPAÇOS EM BRANCO------");

					continue;

				}
				if (descricao.length() < 3) {

					System.err.println("------MÍNIMO DE CARACTERES = 3------");

				}

				else {

					descricaoErro = true;

				}

			} catch (Exception e) {

			}

		}

		boolean codigoErro = false;

		while (codigoErro == false) {

			System.out.println("Digite o código de barra do Eletrônico: ");

			try {

				codigo = teclado.nextInt();

				if (codigo < 0) {

					System.err.println("-------DIGITE UM VALOR POSITIVO-----");

				} else {

					codigoErro = true;

				}

			} catch (Exception e) {

				System.err.println("-------DIGITE APENAS NÚMEROS------");

			}

			teclado.nextLine();

		}

		boolean quantidadeErro = false;

		while (quantidadeErro == false) {

			System.out.println("Digite quantos Eletrônicos irá comprar: ");

			try {

				quantidade = teclado.nextInt();

				if (quantidade < 0) {

					System.out.println("-------DIGITE UM VALOR POSITIVO-----");

				} else {

					quantidadeErro = true;

				}

			} catch (Exception e) {

				System.out.println("-------DIGITE APENAS NÚMEROS------");

			}

			teclado.nextLine();

		}

		boolean precoErro = false;

		while (precoErro == false) {

			System.out.println("Digite o valor deste Eletrônico: ");

			try {

				preco = teclado.nextDouble();

				if (preco < 0) {

					System.err.println("-------DIGITE UM VALOR POSITIVO-----");

				} else {

					precoErro = true;

				}

			} catch (Exception e) {

				System.err.println("-------DIGITE APENAS NÚMEROS------");

			}

			teclado.nextLine();

		}

		boolean marcaErro = false;

		while (marcaErro == false) {

			System.out.println("Digite a marca do Eletrônico: ");

			try {

				marca = teclado.nextLine();

				if (marca.length() == 0) {

					System.err.println("------NÂO DEIXE ESPAÇOS EM BRANCO------");

				} else {

					marcaErro = true;

				}

			} catch (Exception e) {

			}

		}

		boolean modeloErro = false;

		while (modeloErro == false) {

			System.out.println("Digite o modelo do Eletrônico: ");

			try {

				modelo = teclado.nextLine();

				if (modelo.length() == 0) {

					System.err.println("------NÂO DEIXE ESPAÇOS EM BRANCO------");

				} else {

					modeloErro = true;

				}

			} catch (Exception e) {

			}

		}

		Eletronico e = new Eletronico(nome, descricao, codigo, quantidade, preco, marca, modelo);

		// eletronicos.add(e);

		String dadoE = "Eletrônico: " + nome + " | Descrição: " + descricao + " | Código de Barras: " + codigo
				+ " | Quantidade: " + quantidade + " | Preço: " + preco + " | Marca: " + marca + " | Modelo: " + modelo;

		e.gravarEstoque("Estoque.txt", dadoE);

		System.out.println(" NOVO ELETRÔNICO CADASTRADO COM SUCESSO!!!!");

		System.out.println("-----------------------------------------------");

	}

	public void exibirEletronico() {

		eletronicos.forEach(eletronicoCadastrado -> {

			eletronicoCadastrado.exibirInfo();

		});

	}

}
