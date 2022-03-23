programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, y1
		real x2, y2
		real difX, difY
		real distanciaEntrePontos
		
		
		escreva("COORDENADAS DO PONTO 1")
		escreva("\nDigite o valor da coordenada X: ")
		leia(x1)
		escreva("\nDigite o valor da coordanda Y: ")
		leia(y1)
		
		escreva("\nCOORDENADAS DO PONTO 2")
		escreva("\nDigite o valor da coordenada X: ")
		leia(x2)
		escreva("\nDigite o valor da coordanda Y: ")
		leia(y2)

		difX = mat.potencia((x2-x1), 2.0)
		difY = mat.potencia((y2-y1), 2.0)

		distanciaEntrePontos = mat.potencia((difX + difY) , 0.5)

		escreva("\nA distância entre entre os pontos é: ", distanciaEntrePontos)

		
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 673; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */