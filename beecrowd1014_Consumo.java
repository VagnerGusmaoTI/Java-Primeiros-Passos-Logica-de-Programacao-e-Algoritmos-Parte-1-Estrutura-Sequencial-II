import java.util.Locale;
import java.util.Scanner;

public class beecrowd1014_Consumo {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL

		//Exercicio da plataforma beecrowd, nivel iniciante: 1014 Consumo
		//https://www.beecrowd.com.br/judge/pt/problems/view/1014
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main

		//Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o total de combust�vel gasto (em litros).

		//Entrada
		//O arquivo de entrada cont�m dois valores: um valor inteiro X representando a dist�ncia total percorrida (em Km), 
		//e um valor real Y representando o total de combust�vel gasto, com um d�gito ap�s o ponto decimal.

		//Sa�da
		//Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, seguido da mensagem "km/l".
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int distanciaKm;
		double combustivelLitro, consumoMedio;
		
		distanciaKm = sc.nextInt();
		
		combustivelLitro = sc.nextDouble();
		
		consumoMedio = distanciaKm / combustivelLitro;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		
		sc.close();
		
	}
	
	
}
