package model;

public final class Automovel implements Cloneable {
	private String marca; 
	private String modelo; 
	private String tipo;
	// Getters e setters
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	// Sobre escreve o metodo da classe 
	@Override
	public Automovel clone() throws CloneNotSupportedException {
		return (Automovel) super.clone();
	}
}
