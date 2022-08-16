import java.util.Locale;
import java.util.Scanner;

public class beecrowd1010_CalculoSimples {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1010 Cálculo Simples
		//https://www.beecrowd.com.br/judge/pt/problems/view/1010
	    //OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
				
		//Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

		//Entrada
		//O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

		//Saída
		//A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
				

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
	    double precoPeca1, precoPeca2, totalGasto;

	    codigoPeca1 = sc.nextInt();
	    quantidadePeca1 = sc.nextInt();
	    precoPeca1 = sc.nextDouble();
	    
	    codigoPeca2 = sc.nextInt();
	    quantidadePeca2 = sc.nextInt();
	    precoPeca2 = sc.nextDouble();

	    totalGasto = precoPeca1 * quantidadePeca1 + precoPeca2 * quantidadePeca2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalGasto);
		
		sc.close();
	}

}
