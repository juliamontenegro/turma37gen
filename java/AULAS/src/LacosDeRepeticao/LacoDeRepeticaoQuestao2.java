package LacosDeRepeticao;

import java.util.Scanner;

public class LacoDeRepeticaoQuestao2 {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int contadorPar = 0;
		int contadorImpar = 0;
		int numero;
		
		for (int x = 0; x<= 10; x++) {
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if ((numero % 2) == 0 && numero>0) {
				contadorPar++;
			
			}
			else if ((numero % 2) !=0 && numero>0) {
				contadorImpar++;
			
			}
			
			
		}
		System.out.println("Quantidade de números pares: " + contadorPar);
		System.out.println("Quantidade de números ímpares: " + contadorImpar);
		
	}
}
	 
	
			
		
	

	
 
	


