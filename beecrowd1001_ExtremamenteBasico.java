import java.util.Scanner;

public class beecrowd1001_ExtremamenteBasico {
	
	//ESTRUTURA SEQUENCIAL
	
		//Exercicio da plataforma beecrowd, nivel iniciante: 1001 Extremamente basico
		//https://www.beecrowd.com.br/judge/pt/problems/view/1001
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A e B atribuindo o seu resultado na vari�vel X. Imprima X conforme exemplo apresentado abaixo. N�o apresente mensagem alguma al�m daquilo que est� sendo especificado e n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

		//Entrada
		//A entrada cont�m 2 valores inteiros.

		//Sa�da
		//Imprima a mensagem "X = " (letra X mai�scula) seguido pelo valor da vari�vel X e pelo final de linha. Cuide para que tenha um espa�o antes e depois do sinal de igualdade
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int A, B, X;
			
			A = sc.nextInt();
			B = sc.nextInt();
			X = A + B;
			
			System.out.println("X = " + X);
			
			
			sc.close();
		}

}
