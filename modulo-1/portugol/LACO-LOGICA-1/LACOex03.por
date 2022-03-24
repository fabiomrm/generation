programa
{
	
	funcao inicio()
	{
		real numeros[4]
		real quadrados[4]

		para(inteiro i=0; i < 4; i++) {
			escreva("\nDigite um número: ")
			leia(numeros[i])
			quadrados[i] = calculaQuadrado(numeros[i])
		}

		se(quadrados[2] >= 1000) {
			escreva("O quadrado de ", numeros[2], " é: ", quadrados[2])
		} senao {
			para(inteiro i=0; i < 4; i++) {
				escreva("\nO quadrado de: ", numeros[i], ", é: ", quadrados[i])
			}
		}
		
	}

	funcao real calculaQuadrado(real num) {
		retorne num * num
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */