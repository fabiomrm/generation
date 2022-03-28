programa
{
	
	funcao inicio()
	{
		inteiro matrizN1[4][6]
		inteiro matrizN2[4][6]

		inteiro matrizM1[4][6]
		inteiro matrizM2[4][6]

		
		escreva("DADOS DA MATRIZ N1")
		para(inteiro i=0; i < 4; i++) {
			para(inteiro j=0; j < 6; j++) {
				escreva("\nInforme o valor da matriz N[",i+1,"][",j+1,"]: ")
				leia(matrizN1[i][j])
			}
		}

		escreva("\n\n\nDADOS DA MATRIZ N2\n")
		para(inteiro i=0; i < 4; i++) {
			para(inteiro j=0; j < 6; j++) {
				escreva("\nInforme o valor da matriz N[",i+1,"][",j+1,"]: ")
				leia(matrizN2[i][j])
			}
		}
		
		para(inteiro i=0; i < 4; i++) {
			para(inteiro j=0; j < 6; j++) {
				matrizM1[i][j] = matrizN1[i][j] + matrizN2[i][j]
			}
		}

		escreva("\n\nMATRIZ M1 SENDO A SOMA ENTRE N1 + N2\n")
		para(inteiro i=0; i < 4; i++) {
			escreva("[ ")
			para(inteiro j=0; j < 6; j++) {
				escreva(matrizM1[i][j], " ")
			}
			escreva(" ]\n")
		}

		escreva("\n\nMATRIZ M2 SENDO A DIFERENÇA ENTRE N1 + N2\n")
		para(inteiro i=0; i < 4; i++) {
			escreva("[ ")
			para(inteiro j=0; j < 6; j++) {
				escreva(matrizM2[i][j], " ")
			}
			escreva(" ]\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1029; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */