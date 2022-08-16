import java.util.Scanner;

public class beecrowd1018_Cedulas {
	
	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL

		//Exercicio da plataforma beecrowd, nivel iniciante: 1018 C�dulas
		//https://www.beecrowd.com.br/judge/pt/problems/view/1018
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) no qual o valor pode ser decomposto. 
		//As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. 
		//A seguir mostre o valor lido e a rela��o de notas necess�rias.

		//Entrada
		//O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).

		//Sa�da
		//Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias, conforme o exemplo fornecido. 
		//N�o esque�a de imprimir o fim de linha ap�s cada linha, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
		
		Scanner sc = new Scanner(System.in);
		
		int numeroQuantia, quociente, resto, nota;
		
		numeroQuantia = sc.nextInt();
		
		System.out.println(numeroQuantia);

		resto = numeroQuantia;

		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 5;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		System.out.println(resto + " nota(s) de R$ 1,00");
		
		sc.close();

	}

}
