import java.util.Scanner;

public class AtJavaQuestao3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double r, s, d;
		int a, b, c;
		System.out.println("Digite um valor para a : ");
		a = leia.nextInt();
		System.out.println("Digite um valor para b : ");
		b = leia.nextInt();
		System.out.println("Digite um valor para c : ");
		c = leia.nextInt();

		r= Math.pow((a + b),2);
		s= Math.pow((b + c),2);

		d= (r + s)/2; 
		System.out.println("O resultado de d é : " + d);
		
	}

}
