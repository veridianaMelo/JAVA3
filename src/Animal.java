package br.aeso.java3.aula2;

public class Animal {
	
	private String nome;
	private double peso;
	private String comida;
	
	
	public void dormir(){
		System.out.println("Dormir");
	}
	
	public void fazerBarulho(){
		System.out.println("Fazer barulho");
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", peso=" + peso + ", comida=" + comida + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}
	
	

}
