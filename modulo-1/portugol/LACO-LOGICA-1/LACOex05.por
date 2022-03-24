programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva("Digite o índice de poluíção: ")
		leia(indice)

		se(indice <= 0.25) {
			escreva("O índice é aceitável!")
		} senao se (indice > 0.25 e indice < 0.3) {
			escreva("Favor reavaliar urgentemente pois estamos entrando na zona de suspensão!")
		} senao se (indice >= 0.3 e indice < 0.4) {
			escreva("Empresas do primeiro grupo devem suspender atividades imediatamente!")
		} senao se (indice >= 0.4 e indice < 0.5) {
			escreva("Empresas do primeiro e segundo grupo devem suspender atividades imediatamente!")
		} senao {
			escreva("Todas as empresas devem suspender as atividades imediatamente!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */