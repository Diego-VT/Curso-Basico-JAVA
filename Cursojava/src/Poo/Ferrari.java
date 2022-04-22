package Poo;

public class Ferrari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro ferrari = new Carro();
		ferrari.ano = 2022;
		ferrari.cor = "Vermelho";
		System.out.println("Carro Ferrari");
		System.out.println("Ano: " +ferrari.ano);
		System.out.println("Cor: " +ferrari.cor);
		ferrari.liga();
		ferrari.acelerar();
		ferrari.desligar();

	}

}
