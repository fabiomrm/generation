programa
{
	
	funcao inicio()
	{
		inteiro duracaoSegundos
		inteiro horas, minutos, segundos
		inteiro resto

		escreva("Digite o tempo de duração do processo em segundos: ")
		leia(duracaoSegundos)

		horas = duracaoSegundos / 3600
		resto = duracaoSegundos % 3600 
		minutos = resto / 60 
		segundos = resto % 60

		escreva(horas, ":", minutos, ":", segundos)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */