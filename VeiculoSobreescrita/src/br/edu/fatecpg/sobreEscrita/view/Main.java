package br.edu.fatecpg.sobreEscrita.view;
import br.edu.fatecpg.sobreEscrita.model.Bicicleta;
import br.edu.fatecpg.sobreEscrita.model.Carro;
public class Main {

	public static void main(String[] args) {
	//Veiculo
    Carro meuCarro = new Carro("ford","logan");
    Bicicleta bicicleta = new Bicicleta("caçoi","preta");
    
    meuCarro.mover();
    bicicleta.mover();
	}

}
