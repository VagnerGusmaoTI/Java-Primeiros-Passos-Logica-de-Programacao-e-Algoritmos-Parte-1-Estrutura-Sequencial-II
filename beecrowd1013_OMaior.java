import java.util.Scanner;

public class beecrowd1013_OMaior {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL

		//Exercicio da plataforma beecrowd, nivel iniciante: 1013 O Maior
		//https://www.beecrowd.com.br/judge/pt/problems/view/1013
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
		//Maior AB = (a + b + Math.abs(a - b)) / 2

		//Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

		//Entrada
		//O arquivo de entrada contém três valores inteiros.

		//Saída
		//Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, d, e;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		d = (a + b + Math.abs(a - b)) / 2;
		
		e = (d + c + Math.abs(d - c)) / 2;
				
		System.out.println(e + " eh o maior");
		
		sc.close();
	}

}
