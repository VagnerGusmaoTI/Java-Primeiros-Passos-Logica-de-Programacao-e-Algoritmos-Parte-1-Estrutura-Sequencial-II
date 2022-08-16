import java.util.Locale;
import java.util.Scanner;

public class beecrowd1005_Media1 {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1005 Média 1
		//https://www.beecrowd.com.br/judge/pt/problems/view/1005
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

		//Entrada
		//O arquivo de entrada contém 2 valores com uma casa decimal cada um.

		//Saída
		//Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
		//Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, media;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		media = ((A*3.5) + (B*7.5)) / (3.5 + 7.5);
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();

	}

}
