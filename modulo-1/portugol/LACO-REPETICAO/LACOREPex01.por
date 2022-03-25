programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		const inteiro QTD_HABITANTES = 20
		
		real salario = 0.0
		real maiorSalario = 0.0
		real somaSalarios = 0.0
		real mediaSalarios = 0.0
		
		real qtdSalariosAteCem = 0.0

		logico primeiro = verdadeiro

		real numeroFilhos = 0.0
		real somaFilhos = 0.0
	
		real mediaNumeroFilhos = 0.0

		para(inteiro i=0; i < QTD_HABITANTES; i++) {
			escreva("\nDigite o salário da pessoa ", i+1, ": R$ ")
			leia(salario)
			
			somaSalarios += salario
			
			se(salario <= 100) {
				qtdSalariosAteCem++
			}

			escreva("\nQuantos filhos você tem? ")
			leia(numeroFilhos)

			somaFilhos += numeroFilhos

			se(primeiro) {
				maiorSalario = salario
				primeiro = falso
			}

			se(salario > maiorSalario) {
				maiorSalario = salario
			}
		}
		
		mediaSalarios = somaSalarios / QTD_HABITANTES
		mediaNumeroFilhos = somaFilhos / QTD_HABITANTES

		escreva("\n===RELATÓRIO DE HABITANTES===")
		escreva("\nMédia do salário da população é: R$ ", mat.arredondar(mediaSalarios, 2))
		escreva("\nMaior salário: R$ ", mat.arredondar(maiorSalario, 2))
		escreva("\nMédia do número de filhos é: ", mat.arredondar(mediaNumeroFilhos, 2))
		escreva("\nPercentual de salários até R$ 100,00: ", mat.arredondar((qtdSalariosAteCem / QTD_HABITANTES) * 100, 2), "%")
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1092; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */