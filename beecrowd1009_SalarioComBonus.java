import java.util.Locale;
import java.util.Scanner;

public class beecrowd1009_SalarioComBonus {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1009 Sal�rio com b�nus
		//https://www.beecrowd.com.br/judge/pt/problems/view/1009
	    //OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro). 
		//Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber no final do m�s, com duas casas decimais.

		//Entrada
		//O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2 valores de dupla precis�o (double) com duas casas decimais, 
		//representando o sal�rio fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

		//Sa�da
		//Imprima o total que o funcion�rio dever� receber
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String vendedor;
		
		double salarioFixo, valorVendas, totalRecebido;
		
		vendedor = sc.next();
		salarioFixo = sc.nextDouble();
		valorVendas = sc.nextDouble();
		
		totalRecebido = salarioFixo + (valorVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", totalRecebido);
		
		
		sc.close();

	}

}
