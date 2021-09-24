programa
{
	
	funcao inicio()
	{
		real indice=0.0

		escreva("o indice de poluição é: ")
		leia(indice)

		se(indice<=0.29) {
			escreva("o indice está aceitável! ")
		}

		senao se(indice<0.4) {
			escreva("grupo 1, parem suas atividades! ")
			
		}
		senao se(indice<0.5) {
			escreva("grupo 1, grupo 2, parem suas atividades! ")
			
		}
		senao {
			escreva("grupo 1, grupo 2, grupo 3, parem suas atividades! ")
		}
		escreva("\n fim do programa! ")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */