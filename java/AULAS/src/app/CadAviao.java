package app;

import entities.Aviao;

public class CadAviao {

	public static void main(String[] args) {

		Aviao ex2 = new Aviao();

		ex2.empresa = "GOL";
		ex2.capacidade = 1000;
		ex2.anoFabricacao = 1970;
		ex2.valorMercado = 10000000.50;

		System.out.println();
		System.out.println(ex2.toString());
	}


}
