package models;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Produto {
	
	 private String nome;
	 private String descricao;
	 private int codigo;
	 private int quantidade;
	 private double preco;
	 
	 
	 
	public Produto(String nome, String descricao, int codigo, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	 
	
	public void exibirInfo() {
		System.out.println("Nome do Produto : " + this.getNome());
		System.out.println("Descrição do Produto : " + this.getDescricao());
		System.out.println("Codigo do Produto : " + this.getCodigo());
		System.out.println("Quantidade do Produto : " + this.getQuantidade());
		System.out.println("Preço do Produto : " + this.getPreco());
	}
	
	
	public void gravarEstoque(String fileName, String fileContent) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))) {
			writer.write(fileContent);
			writer.newLine();
		}catch(Exception e) {
			System.out.println("ERRO A GRAVAR DADOS");
		}
	}
}