programa
{
	
	funcao inicio()
	{
		inteiro idadeDias

		escreva("Digite sua idade em dias: ")
		leia(idadeDias)
	
		converteIdadeAnosMesesDias(idadeDias)
	}

	funcao  converteIdadeAnosMesesDias(inteiro idadeDias) {
		inteiro anos = idadeDias / 365
		inteiro meses = (idadeDias % 365) / 30
		inteiro dias = (idadeDias % 365) % 30
		
		escreva("Sua idade é de ", anos, " anos, ", meses, " meses e ", dias, " dias!")
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */