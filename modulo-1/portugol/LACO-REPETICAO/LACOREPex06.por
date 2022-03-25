programa
{
	
	funcao inicio()
	{
		inteiro numero
		inteiro contador=1
		inteiro soma=0

		escreva("Você quer saber a soma de números até qual? ")
		leia(numero)

		faca {
			soma+=contador
			contador++
		} enquanto( contador <= numero)

		escreva("Somatório: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */