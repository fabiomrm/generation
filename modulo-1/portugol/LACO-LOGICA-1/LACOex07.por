programa
{
	
	funcao inicio()
	{
		real base, altura
		
		faca {
			escreva("Digite valor da base: ")
			leia(base)
		}enquanto(nao validaMedida(base))

		faca {
			escreva("Digite valor da altura: ")
			leia(altura)
		}enquanto(nao validaMedida(altura))

		escreva("O triângulo formado por ", base, "x", altura, " tem: ", 
			calculaAreaTriangulo(base,altura), " metros")
		
	}

	funcao real calculaAreaTriangulo(real base, real altura) 
	{
		retorne base * altura / 2
	}

	funcao logico validaMedida(real medida) 
	{
		se(medida <= 0 ) {
			retorne falso
		}
		
		retorne verdadeiro
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */