programa
{
	
	funcao inicio()
	{
		const inteiro LIMITE_INFERIOR = 1
		const inteiro LIMITE_SUPERIOR = 500

		inteiro somaMultiplosImpares = 0
	
		para(inteiro i=LIMITE_INFERIOR; i < LIMITE_SUPERIOR; i++) {
			se(i % 2 != 0 e i % 3 == 0) {
				somaMultiplosImpares += i
			}
		}

		escreva("Soma dos múltiplos de 3 entre os limites: ", somaMultiplosImpares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */