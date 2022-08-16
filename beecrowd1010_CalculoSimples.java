import java.util.Locale;
import java.util.Scanner;

public class beecrowd1010_CalculoSimples {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1010 C�lculo Simples
		//https://www.beecrowd.com.br/judge/pt/problems/view/1010
	    //OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
				
		//Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago.

		//Entrada
		//O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

		//Sa�da
		//A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s o "R$". O valor dever� ser apresentado com 2 casas ap�s o ponto.
				

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
