import java.util.Scanner;

public class beecrowd1004_ProdutoSimples {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1004 Produto Simples
		//https://www.beecrowd.com.br/judge/pt/problems/view/1004
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
	
		//Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta opera��o � vari�vel PROD. A seguir mostre a vari�vel PROD com mensagem correspondente.   

		//Entrada
		//O arquivo de entrada cont�m 2 valores inteiros.

		//Sa�da
		//Imprima a mensagem "PROD" e a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade. 
		//N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

		Scanner sc = new Scanner (System.in);
		
		int A, B, prod;
		
		A = sc.nextInt();
		B = sc.nextInt();
		prod = A * B;
		
		System.out.println("PROD = " + prod);
		
		sc.close();

	}

}
