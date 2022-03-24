programa
{
	
	funcao inicio()
	{
		const inteiro VALOR_POR_HORA = 10
		const inteiro VALOR_POR_HORA_EXTRA = 20
		const inteiro LIMITE_HORAS = 50
		
		inteiro C, N , E
		inteiro salarioBase, salarioTotal

		escreva("Olá! Digite o código do operário: ")
		leia(C)

		escreva("\nPerfeito! Agora me indique a quantidade de horas trabalhadas: ")
		leia(N)

		se(N > LIMITE_HORAS) {
			salarioBase = LIMITE_HORAS * VALOR_POR_HORA
			E = (N - LIMITE_HORAS) * VALOR_POR_HORA_EXTRA
		} senao {
			salarioBase = N * VALOR_POR_HORA
			E = 0	
		}
		
		salarioTotal = salarioBase + E

		escreva("\n====DADOS DO OPERÁRIO====\n")
		escreva("Código: ", C)
		escreva("\nHoras trabalhadas: ", N)
		escreva("\nSalário excedente: R$ ", E)
		escreva("\nSalário total: R$ ",salarioTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */