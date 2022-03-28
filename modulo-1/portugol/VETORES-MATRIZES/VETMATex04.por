programa
{
	
	funcao inicio()
	{
		real matriz[3][3]
		real somaElementos = 0.0
		real somaDiagonalPrincipal = 0.0

		para(inteiro i=0; i < 3; i++) {
			para(inteiro j=0; j <3; j++) {
				escreva("\nDigite o valor da posição M[",i+1,"][",j+1,"]: ")
				leia(matriz[i][j])
				
				somaElementos += matriz[i][j]
				se( i == j) {
					somaDiagonalPrincipal += matriz[i][j]
				}
			}
		}

		escreva("Soma dos valores da matriz: ", somaElementos)
		escreva("\nSoma dos valores da diagonal principal: ", somaDiagonalPrincipal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */