package entities;

public class Aviao {
	public String empresa;
	public int capacidade;
	public int anoFabricacao;
	public double valorMercado;
	
	//METODOS
	
	public void exibirNome() {
		
		System.out.println("A empresa �: "+empresa);
	}
	public void exibirCapacidade() {
		
		System.out.println("A capacidade do avi�o: "+capacidade);
	}
	public void exibirAnoFabricacao() {
		
		System.out.println("O ano de fabrica��o do avi�o �: "+anoFabricacao);
	}
	public void exibirvalorMercado() {
		
		System.out.println("O valor de mercado do avi�o �: "+valorMercado);
	}
	
	@Override
	public String toString() {
		return "Aviao [empresa=" + empresa + ", capacidade=" + capacidade + ", anoFabricacao=" + anoFabricacao
				+ ", valorMercado=" + valorMercado + "]";
	}

}
