programa
{
	
	funcao inicio()
	{
		inteiro idadeAnos
		inteiro idadeMeses
		inteiro idadeDias
		inteiro totalDias

		escreva("Digite sua idade em anos completos: ")
		leia(idadeAnos)
		escreva("\nDigite agora quantoes meses você tem: ")
		leia(idadeMeses)
		escreva("\nPor fim, me informe quantos dias você tem: ")
		leia(idadeDias)

		totalDias = converteIdadeEmDias(idadeAnos, idadeMeses, idadeDias)
		
		imprimeResultado(totalDias)
	}

	funcao inteiro converteIdadeEmDias(inteiro idadeAnos, inteiro idadeMeses, inteiro idadeDias) {
		retorne idadeAnos * 365 + idadeMeses * 30 + idadeDias
	}

	funcao imprimeResultado(inteiro resultado) {
		escreva("\nSua idade em dias é: ", resultado) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */