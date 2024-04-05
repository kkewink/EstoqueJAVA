package models;

import java.time.LocalDate;

public class Alimento extends Produto {

	private LocalDate validade = LocalDate.now();

	public Alimento(String nome, String descricao, int codigo, int quantidade, double preco) {
		super(nome, descricao, codigo, quantidade, preco);

	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Validade do Alimento : " + this.getValidade());

	}

	@Override
	public void gravarEstoque(String fileName, String fileContent) {
		super.gravarEstoque(fileName, fileContent);
	}
}
