package entities;

public class Eletronico {
	
	public String nome;
	public String modelo;
	public int unidade;
	public double preco;
	public char formaPagamento;
	
	public void exibirNome() {
		
		System.out.println("O nome do aparelho �: "+nome);
	}
	
	public void exibirModelo() {
		
		System.out.println("O modelo �: "+modelo);
	}
	
	public void exibirUnidade() {
		
		System.out.println("A quantidade solicitada �: "+unidade);
	}
	
	public void exibirPreco() {
		
		System.out.println("O pre�o do aparelho �: "+preco);
	}
	
	public void exibirPagamento() {
		
if (formaPagamento == 'D') {
			
			System.out.println("Cliente "+nome+",pagar� no d�bito");
			
		}
		else if (formaPagamento == 'C') {
			
			System.out.println("Cliente "+nome+",pagar� no cr�dito");
		}
		else if (formaPagamento == 'E') {
			
			System.out.println("Cliente "+nome+",pagar� em esp�cie");
		}
	}

}
	
	


