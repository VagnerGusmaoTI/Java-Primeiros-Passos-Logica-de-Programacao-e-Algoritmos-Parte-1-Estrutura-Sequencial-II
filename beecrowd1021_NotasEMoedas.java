import java.util.Locale;
import java.util.Scanner;

public class beecrowd1021_NotasEMoedas {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1021 Notas e Moedas
		//https://www.beecrowd.com.br/judge/pt/problems/view/1021
		//OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
		//A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
		//As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
		//A seguir mostre a relação de notas necessárias.

		//Entrada
		//O arquivo de entrada contém um valor de ponto flutuante N (0 < N < 1000000.00).

		//Saída
		//Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

		//Obs: Utilize ponto (.) para separar a parte decimal.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double valorMonetario;
		int quociente, resto, cedula, moeda;
		
		valorMonetario = sc.nextDouble();
		
		// Vamos multiplicar N por 100 e forçar a conversão para int.
		// Desse modo, por exemplo, 576.73 vai se tornar 57673

		// Vamos tambem somar 0.5 antes de converter, para assegurar 
		// que o numero seja devidamente arredondado, pois o tipo double
		// as vezes da problema de arredondamento (por exemplo: se digitarmos
		// 576.81 e multiplicarmos por 100, o resultado sera 57680.99999999,
		// dai o casting resultaria em 57680 e nao 57681 como desejado)

		resto = (int) (valorMonetario * 100.0 + 0.5);

		System.out.println("NOTAS:");

		// como multiplicamos o valor por 100 acima, o valor de cada nota
		// também deverá ser multiplicado por 100 a seguir
		
		cedula = 100;
		quociente = resto / (cedula * 100);
		System.out.println(quociente + " nota(s) de R$ " + cedula + ".00");
	    resto = resto % (cedula * 100);

	    cedula = 50;
		quociente = resto / (cedula * 100);
		System.out.println(quociente + " nota(s) de R$ " + cedula + ".00");
	    resto = resto % (cedula * 100);

	    cedula = 20;
		quociente = resto / (cedula * 100);
		System.out.println(quociente + " nota(s) de R$ " + cedula + ".00");
	    resto = resto % (cedula * 100);

	    cedula = 10;
		quociente = resto / (cedula * 100);
		System.out.println(quociente + " nota(s) de R$ " + cedula + ".00");
	    resto = resto % (cedula * 100);

	    cedula = 5;
		quociente = resto / (cedula * 100);
		System.out.println(quociente + " nota(s) de R$ " + cedula + ".00");
	    resto = resto % (cedula * 100);

	    cedula = 2;
		quociente = resto / (cedula * 100);
		System.out.println(quociente + " nota(s) de R$ " + cedula + ".00");
	    resto = resto % (cedula * 100);

	    System.out.println("MOEDAS:");

	    // o valor de cada moeda deverá ser representado em centavos
	    
		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
	    resto = resto % moeda;

		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
	    resto = resto % moeda;

		moeda = 25;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.25");
	    resto = resto % moeda;

		moeda = 10;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.10");
	    resto = resto % moeda;

		moeda = 5;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.05");
	    resto = resto % moeda;

		System.out.println(resto + " moeda(s) de R$ 0.01");
		
		sc.close();
		
	}

}
