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
			System.out.println("O n�mero " + num1 + " � maior que " + num2);
		}
		
		else 
			System.out.println(" O n�mero " + num2 + " � maior que " + num1);
		
	}

}
