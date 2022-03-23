programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a, b, c
		real d, k, f
		real x, y

		escreva("\nDigite o valor do coeficiente a: ")
		leia(a)
		escreva("\nDigite o valor do coeficiente b: ")
		leia(b)
		escreva("\nDigite o valor do coeficiente c: ")
		leia(c)
		escreva("\nDigite o valor do coeficiente d: ")
		leia(d)
		escreva("\nDigite o valor do coeficiente e: ")
		leia(k)
		escreva("\nDigite o valor do coeficiente f: ")
		leia(f)

		real denominador = (a * k) - (b * d)
		x = ((c * k) - (b * f)) / denominador
		y = ((a * f) - (c * d)) / denominador

		escreva("x=",mat.arredondar(x, 2), " y=", mat.arredondar(y, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */