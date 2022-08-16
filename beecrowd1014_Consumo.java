import java.util.Locale;
import java.util.Scanner;

public class beecrowd1014_Consumo {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL

		//Exercicio da plataforma beecrowd, nivel iniciante: 1014 Consumo
		//https://www.beecrowd.com.br/judge/pt/problems/view/1014
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main

		//Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

		//Entrada
		//O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), 
		//e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

		//Saída
		//Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
		
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
