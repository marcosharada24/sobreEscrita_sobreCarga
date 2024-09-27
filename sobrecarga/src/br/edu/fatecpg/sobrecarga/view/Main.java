package br.edu.fatecpg.sobrecarga.view;

import br.edu.fatecpg.sobrecarga.model.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Testando as sobrecargas do método somar
        System.out.println("Soma de 2 e 5: " + calc.somar(2, 5));            // Soma de dois inteiros
        System.out.println("Soma de 2, 3 e 5: " + calc.somar(2, 3, 5));    // Soma de três inteiros
        System.out.println("Soma de 2.5 e 5.5: " + calc.somar(2.5, 5.5));  // Soma de dois doubles
    }
}
