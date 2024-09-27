package br.edu.fatecpg.produtoSobrecarga.view;

import br.edu.fatecpg.produtoSobrecarga.model.Produto;

public class Main {

	public static void main(String[] args) {
	Produto produto1 = new Produto("hot wheels: what 4-2");
	Produto produto2 = new Produto("barbie: edição do filme", 19.99);
	Produto produto3 = new Produto("lego: satr wars mandalorian", 29.99, 100);

	
	System.out.println("informaçoes do carrinho:");
	produto1.imprimirInformacoes();
	
	System.out.println("informaçoes da boneca:");
	produto2.imprimirInformacoes();
	
	System.out.println("informaçoes do bolco de montar: ");
	produto3.imprimirInformacoes();
	}

}
