import java.util.Scanner;

public class AtJavaQuestao1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int dias, meses, anos, soma;
		System.out.println("Quantos anos voc� tem?"); 
		anos = leia.nextInt();

		System.out.println("Quantos meses voc� tem?");
		meses = leia.nextInt();

		System.out.println("Quantos dias voc� tem?");
		dias = leia.nextInt();

		soma = (anos*365) + (meses*30) + dias;
		System.out.print("Sua idade total em dias � : " + soma);
	}

}
