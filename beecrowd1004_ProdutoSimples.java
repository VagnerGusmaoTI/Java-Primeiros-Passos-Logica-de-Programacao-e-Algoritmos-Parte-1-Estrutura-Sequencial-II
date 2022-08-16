import java.util.Scanner;

public class beecrowd1004_ProdutoSimples {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1004 Produto Simples
		//https://www.beecrowd.com.br/judge/pt/problems/view/1004
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
	
		//Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   

		//Entrada
		//O arquivo de entrada contém 2 valores inteiros.

		//Saída
		//Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. 
		//Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

		Scanner sc = new Scanner (System.in);
		
		int A, B, prod;
		
		A = sc.nextInt();
		B = sc.nextInt();
		prod = A * B;
		
		System.out.println("PROD = " + prod);
		
		sc.close();

	}

}
