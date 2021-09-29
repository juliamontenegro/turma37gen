programa
{
	
	funcao inicio()
	{
		inteiro matriz [3] [3]
		inteiro x=0
		inteiro y=0
		inteiro soma=0
		inteiro somaDiagonal=0

		para(x=0; x<3; x++) {
			para(y=0; y<3; y++) {
				escreva("Digite um número: ")
				leia(matriz [x] [y])
				soma=soma+matriz [x] [y]
				se(x==y) {
					somaDiagonal=somaDiagonal+matriz [x] [y]
				}
			}
		}
		para(x=0; x<3; x++) {
			para(y=0; y<3; y++) {
				escreva(matriz [x] [y]+ " ")
		
			}
			escreva("\n")
		}
		
		escreva("Soma dos valores da matriz: ",soma+"\n")
		escreva("Soma da diagonal da matriz: ",somaDiagonal)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */