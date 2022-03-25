programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real numero
		real somaNumeros = 0.0
		inteiro qtdNumerosLidos = 0

		escreva("\nDigite um número neutro ou positivo [negativo para encerrar]: ")
		leia(numero)

		enquanto(numero >= 0) {
			somaNumeros += numero
			qtdNumerosLidos++
			
			escreva("\nDigite um número neutro ou positivo [negativo para encerrar]: ")
			leia(numero)
	
		}

		escreva("\nSomatório: ", somaNumeros)
		escreva("\nQuantidade números lidos: ", qtdNumerosLidos)
		escreva("\nMédia números: ", mat.arredondar(somaNumeros/qtdNumerosLidos, 2))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */