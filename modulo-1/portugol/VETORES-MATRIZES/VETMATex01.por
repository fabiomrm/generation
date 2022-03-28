programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real numeros[5]
		real maiorNumero = 0.0
		logico primeiro = verdadeiro

		para(inteiro i=0; i < 5; i++) {
			escreva("\nDigite um número: ")
			leia(numeros[i])

			se(primeiro) {
				maiorNumero = numeros[i]
				primeiro = falso
			}
			se(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i]
			}
			
		}

		escreva("O maior número do vetor é: ", maiorNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */