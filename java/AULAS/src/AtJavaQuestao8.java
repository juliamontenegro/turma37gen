import java.util.Scanner;

public class AtJavaQuestao8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
				
		double custoConsumidor;
		double custoFabrica, distribuidor, impostos;
		System.out.println("Digite o custo de f�brica do autom�vel: ");
		custoFabrica = leia.nextDouble();

		distribuidor = custoFabrica * 28 / 100;
		impostos = custoFabrica * 45 / 100;

		custoConsumidor = (custoFabrica + distribuidor + impostos);
		System.out.println("O custo do consumidor � de R$ " + custoConsumidor);
		
	}
}
