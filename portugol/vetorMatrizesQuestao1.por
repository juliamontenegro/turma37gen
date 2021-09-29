programa
{
	
	funcao inicio()
	{
		inteiro vet[5], x, maior=0
		para (x=0; x<5; x++) {
			escreva("\nInforme o ",x+1,"º valor: ")
			leia(vet[x])
			se(vet[x]>maior) { 
				maior=vet[x]
			}
		}

			para(x=0; x<5; x++) {
				escreva(vet[x],"\t")
			}

			para(x=0; x<5; x++) {
				se(maior<vet[x]) {
					maior=vet[x]
				}
			
			} 
			escreva("\nO maior valor é: ",maior) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */