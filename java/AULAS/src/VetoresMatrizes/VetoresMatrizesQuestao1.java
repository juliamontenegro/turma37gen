package VetoresMatrizes;

import java.util.Scanner;

public class VetoresMatrizesQuestao1 {
		
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		int vet[] = new int [5], x, maior=0;
				for (x=0; x<5; x++) {
					System.out.printf("\nInforme o "+x+1+" º valor: ");
					vet[x] = leia.nextInt();
					if (vet[x]>maior) { 
						maior=vet[x];
			}
		}
				
				for (x=0; x<5; x++) {
					System.out.print(vet[x]+"\t");
				}
				
				for (x=0; x<5; x++) {
					if (maior<vet[x]) {
						maior=vet[x];
					}
				
				} 
				
				System.out.printf("\nO maior valor é: "+maior);
	}
}
