package LacosDeRepeticao;

import java.util.Scanner;

public class LacoDeRepeticaoQuestao5 {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		int num=0,soma=0;
		
		do{
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			soma=soma+num;
		}while(num!=0);
			
			System.out.println("A soma dos valores � igual a: "+soma);
		}
		
}
