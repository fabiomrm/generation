programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamentos[10]
		inteiro tamanho_vetor = Util.numero_elementos(lancamentos)
		inteiro maiorPontuacao=0
		
		logico primeiro = verdadeiro

		para(inteiro i=0; i < tamanho_vetor; i++) {
			escreva("\nJogada ", i+1, ": ")
			leia(lancamentos[i])

			se(primeiro) {
				maiorPontuacao = lancamentos[i]
				primeiro = falso
			}

			se(lancamentos[i] > maiorPontuacao) {
				maiorPontuacao = lancamentos[i]				
			}
		}

		inteiro frequenciaMaiorPontuacao = calculaFrequenciaMaiorPontuacao(lancamentos, maiorPontuacao)
		real mediaLancamentos = calculaMediaLancamentos(lancamentos)

		para(inteiro i=0; i < tamanho_vetor; i++) {
			escreva(lancamentos[i], " - " )
		}

		escreva("\nMaior pontuação: ", maiorPontuacao,"! O número apareceu: ", frequenciaMaiorPontuacao, " vezes.")
		escreva("\nA média foi: ", mediaLancamentos)
	}

	
	funcao inteiro calculaFrequenciaMaiorPontuacao(inteiro lancamentos[], inteiro maiorPontuacao) {
		inteiro frequenciaMaiorPontuacao = 0
		
		para(inteiro i=0 ; i < Util.numero_elementos(lancamentos); i++) {
			se(lancamentos[i] == maiorPontuacao) {
				frequenciaMaiorPontuacao++	
			}
		}

		retorne frequenciaMaiorPontuacao
	}

	funcao real calculaMediaLancamentos(inteiro lancamentos[]) {
		real soma =0.0
		inteiro tamanho_vetor = Util.numero_elementos(lancamentos)
		para(inteiro i=0; i < tamanho_vetor; i++) {
			soma += lancamentos[i]
		}
		
		retorne soma / tamanho_vetor
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 147; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */