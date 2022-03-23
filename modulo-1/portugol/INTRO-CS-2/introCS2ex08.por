programa
{
	
	funcao inicio()
	{
		real PCT_DISTRIB = 0.28
		real PCT_IMPOSTO = 0.45
		real custoFabrica
		real custoConsumidor

		escreva("Qual foi o custo de fábrica do carro? R$ ")
		leia(custoFabrica)

		custoConsumidor = custoFabrica + custoFabrica * PCT_DISTRIB + custoFabrica * PCT_IMPOSTO

		escreva("O custo para o consumidor é R$ ", custoConsumidor)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 82; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */