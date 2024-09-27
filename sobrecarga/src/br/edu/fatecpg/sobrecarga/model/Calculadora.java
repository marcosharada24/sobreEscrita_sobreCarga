package br.edu.fatecpg.sobrecarga.model;

public class Calculadora {
    // Soma dois números inteiros
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    // Soma três números inteiros
    public int somar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Soma dois números do tipo double
    public double somar(double n1, double n2) {
        return n1 + n2;
    }
}
