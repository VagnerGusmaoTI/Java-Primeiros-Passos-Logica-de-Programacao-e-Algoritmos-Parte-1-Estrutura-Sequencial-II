import java.util.Scanner;

public class beecrowd1001_ExtremamenteBasico {
	
	//ESTRUTURA SEQUENCIAL
	
		//Exercicio da plataforma beecrowd, nivel iniciante: 1001 Extremamente basico
		//https://www.beecrowd.com.br/judge/pt/problems/view/1001
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

		//Entrada
		//A entrada contém 2 valores inteiros.

		//Saída
		//Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade
		
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
