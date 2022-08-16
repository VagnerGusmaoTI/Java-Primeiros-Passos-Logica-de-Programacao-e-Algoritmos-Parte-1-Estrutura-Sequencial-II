import java.util.Locale;
import java.util.Scanner;

public class beecrowd1012_Area {

public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1012 �rea
		//https://www.beecrowd.com.br/judge/pt/problems/view/1012
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
		//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		//b) a �rea do c�rculo de raio C. (pi = 3.14159)
		//c) a �rea do trap�zio que tem A e B por bases e C por altura.
		//d) a �rea do quadrado que tem lado B.
		//e) a �rea do ret�ngulo que tem lados A e B.
		
		//Entrada
		//O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.

		//Sa�da
		//O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a uma das �reas descritas acima, sempre com mensagem correspondente e um espa�o entre os dois pontos e o valor. 
		//O valor calculado deve ser apresentado com 3 d�gitos ap�s o ponto decimal.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, base, altura, pi, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		
		triangulo = A * C / 2.0;
		circulo = pi * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}
}
