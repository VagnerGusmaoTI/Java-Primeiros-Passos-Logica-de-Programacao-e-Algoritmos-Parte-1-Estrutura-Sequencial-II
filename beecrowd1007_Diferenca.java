import java.util.Scanner;

public class beecrowd1007_Diferenca {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1007 Diferen�a
		//https://www.beecrowd.com.br/judge/pt/problems/view/1007
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
		//Entrada
		//O arquivo de entrada cont�m 4 valores inteiros.

		//Sa�da
		//Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade.
		
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		A= sc.nextInt();
		B= sc.nextInt();
		C= sc.nextInt();
		D= sc.nextInt();
		
		dif = ((A*B)-(C*D));
		
		System.out.println("DIFERENCA = " + dif);
		
		sc.close();

	}

}
