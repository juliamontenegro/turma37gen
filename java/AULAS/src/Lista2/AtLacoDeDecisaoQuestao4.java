package Lista2;

import java.util.Scanner;

public class AtLacoDeDecisaoQuestao4 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero, resultado;
		
		System.out.print("Digite um número: ");
		numero = leia.nextDouble();
		
		if (numero%2==0 && numero!=0) {
			System.out.print("O número digitado é par");
			resultado = Math.sqrt(numero);
			System.out.printf("\nA raíz quadrada do número %.2f é %.2f ", numero, resultado);
		}
		else if (numero%2==1) {
			System.out.print("O número digitado é ímpar");
			resultado = Math.pow(numero, 2);
			System.out.printf("\nO número %.2f elevado ao quadrado é %.2f ", numero, resultado);
		}
		else if (numero==0) {
			System.out.printf("O número %.2f é nulo", numero);
	
		}
	}
		

}
