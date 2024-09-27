package br.edu.fatecpg.produtoSobrecarga.model;

public class Produto {
private String nome;
private double preço;
private int quantidadeEstoque;
public Produto(String nome) {
this.nome = nome;
this.preço = 0.0;
this.quantidadeEstoque = 0;
}
public Produto(String nome, double preço) {
	this.nome = nome;
	this.preço = preço;
	this.quantidadeEstoque = 0;
}
public Produto(String nome, double preço, int quantidadeEstoque) {
	this.nome = nome;
	this.preço = preço;
	this.quantidadeEstoque = quantidadeEstoque;
}
public void imprimirInformacoes() {
	System.out.println("nome: " + nome);
	System.out.println("preço: r$ " + preço);
	System.out.println("qunatidade em estoque: " + quantidadeEstoque);
}
}

