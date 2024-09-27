package br.edu.fatecpg.conversorSobregarga.view;

import br.edu.fatecpg.conversorSobregarga.model.Convesor;

public class Main {

	public static void main(String[] args) {
		Convesor conversor = new Convesor();
		
		double celsius = 25;
		double fahrenheit = conversor.converter(celsius);
		System.out.println(celsius + " graus celsius é igual a " + fahrenheit + " fahrenheit " );
		
		double quilometros = 10;
		double milhas = conversor.converter(quilometros, true);
		System.out.println(quilometros + "km é igual a " + milhas + " milhas");
		
		String texto = "olá, mundo";
		String textoMaiusculo = conversor.converter(texto);
		System.out.println("texto em maiúsculas: " + textoMaiusculo );
		
	}

}
