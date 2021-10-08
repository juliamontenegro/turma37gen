package app;

import java.util.Scanner;

import entities.Cliente;

public class CadCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cliente cliente = new Cliente();
		int opcao;
		
		System.out.println("Digite seu nome: ");
		cliente.nome = leia.next();
		System.out.println("Digite seu ano de nascimento: ");
		cliente.anoNascimento = leia.nextInt();
		System.out.println("Digite seu cpf: ");
		cliente.cpf = leia.next();
		System.out.println("Digite a forma de pagamento: 1-crédito, 2-débito, 3-parcelado");
		opcao = leia.nextInt();
		
		if (opcao==1) {
			cliente.formaPagamento = "crédito";
		}
		else if (opcao==2) {
			cliente.formaPagamento = "débito";
		}
		else if (opcao==3) {
			cliente.formaPagamento = "parcelado";
		}
		System.out.println("A idade do cliente é: "+cliente.idade(cliente.anoNascimento));
		System.out.println(cliente.toString());
		
	}

}
