programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1, num2, num3, num4, d1, d2, d3, d4
		escreva("o valor do primeiro é: ")
		leia(num1)
		escreva("o valor do segundo é: ")
		leia(num2)
		escreva("o vaalor do terceiro é: ")
		leia(num3)
		escreva("o valor do quarto é: ")
		leia(num4)
		
		d1=mat.potencia(num1,2)
		d2=mat.potencia(num2,2)
		d3=mat.potencia(num3,2)
		d4=mat.potencia(num4,2)

		se(num3>=1000) {
			escreva("o valor do terceiro é: ", d3) 
		}
		
		senao {
			escreva("\n o valor do quadrado de", num1, " é ", d1)
			escreva("\n o valor do quadrado de", num2, " é ", d2)
			escreva("\n o valor do quadrado de", num3, " é ", d3)
			escreva("\n o valor do quadrado de", num4, " é ", d4)
			
		}
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 729; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */