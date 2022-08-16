import java.util.Locale;
import java.util.Scanner;

public class beecrowd1015_DistanciaEntreDoisPontos {
	
	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1015 Distância entre dois pontos
		//https://www.beecrowd.com.br/judge/pt/problems/view/1015
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

		//Distancia = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0))

		//Entrada
		//O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

		//Saída
		//Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double x1, x2, y1, y2, distanciaPercorrida;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		distanciaPercorrida = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));
		
		System.out.printf("%.4f\n", distanciaPercorrida);
		
		sc.close();

	}
	
	
}
