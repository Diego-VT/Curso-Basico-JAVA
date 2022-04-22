package Poo;

public class Camaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro camaro = new Carro();
		camaro.ano = 2020;
		camaro.cor = "Vermelho";
		System.out.println("Carro camaro");
		System.out.println("Ano: " +camaro.ano);
		System.out.println("Cor: " +camaro.cor);
		camaro.liga();
		camaro.acelerar();
		camaro.desligar();

	}

}
