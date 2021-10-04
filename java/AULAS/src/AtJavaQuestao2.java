import java.util.Scanner;

public class AtJavaQuestao2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int anos=0, meses=0, dias=0, totalDias=0;
		
		System.out.println("Quantos dias você tem?");
		totalDias = leia.nextInt();

		anos= totalDias/365;
		meses= (totalDias%365)/30;
		dias= (totalDias%365)%30;

		System.out.println("Você tem " + anos + " anos, " + meses + " meses, " + dias + " dias ");
	}

}
