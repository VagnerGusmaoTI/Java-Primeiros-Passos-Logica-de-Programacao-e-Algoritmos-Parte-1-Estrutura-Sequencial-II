import java.util.Scanner;

public class beecrowd1018_Cedulas {
	
	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL

		//Exercicio da plataforma beecrowd, nivel iniciante: 1018 Cédulas
		//https://www.beecrowd.com.br/judge/pt/problems/view/1018
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
		//As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
		//A seguir mostre o valor lido e a relação de notas necessárias.

		//Entrada
		//O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

		//Saída
		//Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 
		//Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
		
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
