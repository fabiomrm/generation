programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite a idade da pessoa nadadora: ")
		leia(idade)

		se(idade >= 5 e idade <= 7) {
			escreva("Intantil A")
		} senao se(idade >=8 e idade <= 11) {
			escreva("Infantil B")
		} senao se(idade >= 12 e idade <= 13) {
			escreva("Juvenil A")
		} senao se(idade >= 14 e idade <= 17) {
			escreva("Juvenil B")
		} senao se(idade >= 18) {
			escreva("Adultos")
		} senao {
			escreva("Pessoaa muito nova (menor que 5 anos)")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */