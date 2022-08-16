import java.util.Scanner;

public class beecrowd1007_Diferenca {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1007 Diferença
		//https://www.beecrowd.com.br/judge/pt/problems/view/1007
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		//Entrada
		//O arquivo de entrada contém 4 valores inteiros.

		//Saída
		//Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
		
		
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
