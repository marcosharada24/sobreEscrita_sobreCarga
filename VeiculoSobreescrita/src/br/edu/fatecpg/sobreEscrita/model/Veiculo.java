package br.edu.fatecpg.sobreEscrita.model;

public abstract class Veiculo {
private String marca;

public Veiculo(String mrc) {
	this.marca = mrc;	
}
	public void mover() {
		System.out.println("esta se movendo");
	}
}
