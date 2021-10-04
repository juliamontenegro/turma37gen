package Lista2;
import java.util.Scanner;

public class AtLacoDeDecisaoQuestao1 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		int num1 = leia.nextInt();
		
		System.out.println("Digite outro valor: ");
		int num2 = leia.nextInt();
		
		if (num1>num2) {
			System.out.println("O número " + num1 + " é maior que " + num2);
		}
		
		else 
			System.out.println(" O número " + num2 + " é maior que " + num1);
		
	}

}
