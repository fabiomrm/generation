programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		const inteiro PESO_MAXIMO = 50
		const real VALOR_MULTA_POR_QUILO = 4.0

		real P
		real multa = 0.0
		real E = 0.0

		escreva("Digite o peso de tomate que você está carregando: ")
		leia(P)

		se(P > PESO_MAXIMO) {
			E = P - PESO_MAXIMO
			multa = E * VALOR_MULTA_POR_QUILO
		}

		escreva("\nExcesso: ", E, " kgs")
		escreva("\nMulta: R$ ", mat.arredondar(multa, 2))
		

		
		
	}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */