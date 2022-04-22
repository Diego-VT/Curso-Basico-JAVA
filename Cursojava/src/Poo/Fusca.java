package Poo;

public class Fusca {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		fusca.ano = 1986;
		fusca.cor = "Azul";
		System.out.println("Carro Ferrari");
		System.out.println("Ano: " +fusca.ano);
		System.out.println("Cor: " +fusca.cor);
		fusca.liga();
		fusca.acelerar();
		fusca.desligar();

	}

}
