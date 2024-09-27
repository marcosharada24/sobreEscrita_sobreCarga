package br.edu.fatecpg.conversorSobregarga.model;

public class Convesor {
public double converter(double celsius) {
	return (celsius * 9 / 5) + 32;
}
public double converter(double quilometros, boolean isQuilometros) {
	return quilometros * 0.621371;
}
public String converter(String texto) {
	return texto.toUpperCase();
}
}
