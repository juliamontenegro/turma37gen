package VetoresMatrizes;

import java.util.Scanner;

public class VetoresMatrizesQuestao4 {
	
public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
				int M [] [] = new int [3] [3];
				int x=0;
				int y=0;
				int soma=0;
				int somaDiagonal=0;
				
				for (x=0; x<3; x++) {
					for (y=0; y<3; y++) {
						System.out.print("Digite um número: ");
						M [x] [y] = leia.nextInt();
						soma=soma+M [x] [y];
						if (x==y) {
							somaDiagonal=somaDiagonal+M [x] [y];
						}
					}
				}
				
				for (x=0; x<3; x++) {
					for (y=0; y<3; y++) {
						System.out.print(M [x] [y]+ " ");
				
					}
					System.out.print("\n");
				}
				
				System.out.printf("Soma dos valores da matriz: "+soma+"\n");
				System.out.printf("\nSoma da diagonal da matriz: "+somaDiagonal);
	}

}
