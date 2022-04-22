package Poo;

public class Cessna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aviao cessna = new Aviao();
		cessna.ano = 2021;
		cessna.cor = "Prata";
		cessna.envergadura = 11;		
		System.out.println("Avião: Cessna");
		System.out.println("Ano " +cessna.ano);
		System.out.println("Cor " +cessna.ano);
		System.out.println("Envergadura " +cessna.envergadura+ "m");
		cessna.liga();
		cessna.acelerar();
	}

}
