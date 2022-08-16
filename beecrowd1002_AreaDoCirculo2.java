import java.util.Locale;
import java.util.Scanner;

public class beecrowd1002_AreaDoCirculo2 {
	
	//ESTRUTURA SEQUENCIAL
	
		//Exerc�cio da plataforma beecrowd, n�vel iniciante: 1002 �rea do c�rculo
		//https://www.beecrowd.com.br/judge/pt/problems/view/1002
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//A f�rmula para calcular a �rea de uma circunfer�ncia �: area = pi . raio2. Considerando para este problema que pi = 3.14159:

		//- Efetue o c�lculo da �rea, elevando o valor de raio ao quadrado e multiplicando por pi.

		//Entrada
		//A entrada cont�m um valor de ponto flutuante (dupla precis�o), no caso, a vari�vel raio.

		//Sa�da
		//Apresentar a mensagem "A=" seguido pelo valor da vari�vel area, conforme exemplo abaixo, com 4 casas ap�s o ponto decimal. Utilize vari�veis de dupla precis�o (double). 
		//Como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

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
