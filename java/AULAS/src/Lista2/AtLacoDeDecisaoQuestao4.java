package Lista2;

import java.util.Scanner;

public class AtLacoDeDecisaoQuestao4 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero, resultado;
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		if (numero%2==0 && numero!=0) {
			System.out.print("O n�mero digitado � par");
			resultado = Math.sqrt(numero);
			System.out.printf("\nA ra�z quadrada do n�mero %.2f � %.2f ", numero, resultado);
		}
		else if (numero%2==1) {
			System.out.print("O n�mero digitado � �mpar");
			resultado = Math.pow(numero, 2);
			System.out.printf("\nO n�mero %.2f elevado ao quadrado � %.2f ", numero, resultado);
		}
		else if (numero==0) {
			System.out.printf("O n�mero %.2f � nulo", numero);
	
		}
	}
		

}
