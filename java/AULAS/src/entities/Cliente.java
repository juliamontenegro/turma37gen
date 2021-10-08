package entities;

public class Cliente {
	
	public String nome;
	public int anoNascimento;
	public String cpf;
	public String formaPagamento;
	
	public int idade (int ano) {
		return 2021 - ano;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", anoNascimento=" + anoNascimento + ", cpf=" + cpf + ", formaPagamento="
				+ formaPagamento + "]";
	}
	
	
}
