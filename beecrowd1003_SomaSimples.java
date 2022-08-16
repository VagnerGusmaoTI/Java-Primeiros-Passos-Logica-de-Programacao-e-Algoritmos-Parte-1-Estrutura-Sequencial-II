import java.util.Scanner;

public class beecrowd1003_SomaSimples {
	
	//ESTRUTURA SEQUENCIAL
	
	//Exercicio da plataforma beecrowd, nivel iniciante: 1003 Soma Simples
	//https://www.beecrowd.com.br/judge/pt/problems/view/1003
	//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
	
	//Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua � vari�vel SOMA. A seguir escrever o valor desta vari�vel.

	//Entrada
	//O arquivo de entrada cont�m 2 valores inteiros.

	//Sa�da
	//Imprima a mensagem "SOMA" com todas as letras mai�sculas, com um espa�o em branco antes e depois da igualdade seguido pelo valor correspondente � soma de A e B. 
	//Como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		A    = sc.nextInt();
		B    = sc.nextInt();
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
