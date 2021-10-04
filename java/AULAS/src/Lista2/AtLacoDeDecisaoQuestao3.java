package Lista2;

import java.util.Scanner;

public class AtLacoDeDecisaoQuestao3 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.println("Qual o seu nome? ");
		nome = leia.next();
		
		System.out.println("Qual a sua idade? ");
		idade = leia.nextInt();
		
		if (idade>=18 && idade<=25) {
			System.out.print("Categoria Adulto!");
		}
		else if (idade>=15 && idade<=17) {
			System.out.print("Categoria Juvenil!");
		}
		else if (idade>=10 && idade<=14) {
			System.out.print("Categoria Infantil!");
		}
		else {
			System.out.print("Categoria Inválida!");
		}
		
	}

}
