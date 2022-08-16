import java.util.Locale;
import java.util.Scanner;

public class beecrowd1002_AreaDoCirculo2 {
	
	//ESTRUTURA SEQUENCIAL
	
		//Exercício da plataforma beecrowd, nível iniciante: 1002 Área do círculo
		//https://www.beecrowd.com.br/judge/pt/problems/view/1002
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//A fórmula para calcular a área de uma circunferência é: area = pi . raio2. Considerando para este problema que pi = 3.14159:

		//- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por pi.

		//Entrada
		//A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

		//Saída
		//Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). 
		//Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

		public static void main(String[] args) {
			
			 Locale.setDefault(Locale.US);
			 Scanner sc = new Scanner(System.in);
			 
			 double area, raio, n;
			 
			 n = 3.14159;
			 raio = sc.nextDouble();
			 area = n*raio*raio;
			 
			 System.out.printf("A=%.4f%n", area);
			 
			 sc.close();
			 
		}

}
