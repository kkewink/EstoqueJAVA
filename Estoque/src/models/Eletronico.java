package models;

public class Eletronico extends Produto {
	
	private String marca;
	private String modelo;

	public Eletronico(String nome, String descricao, int codigo, int quantidade, double preco, String marca, String modelo) {
		super(nome, descricao, codigo, quantidade, preco);
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void exibirInfo () {
		super.exibirInfo();
		System.out.println("Marca do Eletronico: " + this.getMarca());
		System.out.println("Modelo do Eletronico: " + this.getModelo());
		
	}
	@Override
	public void gravarEstoque(String fileName, String fileContent) {
		super.gravarEstoque(fileName, fileContent);
	}
	
	
}
