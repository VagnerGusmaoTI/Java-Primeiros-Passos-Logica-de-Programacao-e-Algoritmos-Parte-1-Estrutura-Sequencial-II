import java.util.Scanner;

public class beecrowd1003_SomaSimples {
	
	//ESTRUTURA SEQUENCIAL
	
	//Exercicio da plataforma beecrowd, nivel iniciante: 1003 Soma Simples
	//https://www.beecrowd.com.br/judge/pt/problems/view/1003
	//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
	
	//Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

	//Entrada
	//O arquivo de entrada contém 2 valores inteiros.

	//Saída
	//Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B. 
	//Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		A    = sc.nextInt();
		B    = sc.nextInt();
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
