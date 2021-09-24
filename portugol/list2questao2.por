programa
{
	
	funcao inicio()
	{
		cadeia codigo
		inteiro salarioNormal
		inteiro salarioExtra
		inteiro horaExtra 
		inteiro horas

		escreva("a matrícula do funcionário é: ")
		leia(codigo)
		
		escreva("total de horas de trabalho: ")
		leia(horas)

		horaExtra=horas-50
		salarioExtra=horaExtra*20
		salarioNormal=horas*10

		se(horaExtra>0.1){
			escreva("você trabalhou ", horaExtra, " horaExtra ",  "e vai receber R$", salarioExtra, " a mais no salário")
		}
		senao se(horaExtra==0){
			escreva("você cumpriu seu horário padrão de trabalho e vai receber o salário normal")
		}

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 447; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */