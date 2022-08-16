import java.util.Locale;
import java.util.Scanner;

public class beecrowd1017_GastoDeCombustivel {
	
	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1017 Gasto de Combustível
		//https://www.beecrowd.com.br/judge/pt/problems/view/1017
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main

		//Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. 
		//Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). 
		//Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

		//Entrada
		//O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).

		//Saída
		//Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		
		int tempoGastoHoras, velocidadeMedia;
		double totalLitrosViagem;
		
		tempoGastoHoras = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		
		totalLitrosViagem = (tempoGastoHoras * velocidadeMedia) / 12.0;
		
		System.out.printf("%.3f%n", totalLitrosViagem);
		
		sc.close();

	}

}
