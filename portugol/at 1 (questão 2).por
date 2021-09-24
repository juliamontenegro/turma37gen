programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses, dias, totalDias

		escreva("Quantos dias você tem?")
		leia(totalDias)

		anos= totalDias/365
		meses= (totalDias%365)/30
		dias= (totalDias%365)%30 

		escreva("Você tem " + anos + " anos, " + meses + " meses, " + dias + " dias ")
		 
		 

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */