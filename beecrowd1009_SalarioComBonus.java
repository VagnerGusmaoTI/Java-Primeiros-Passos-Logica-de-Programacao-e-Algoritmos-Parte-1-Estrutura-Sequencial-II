import java.util.Locale;
import java.util.Scanner;

public class beecrowd1009_SalarioComBonus {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1009 Salário com bônus
		//https://www.beecrowd.com.br/judge/pt/problems/view/1009
	    //OBS: ao publicar o exercício na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
		//Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

		//Entrada
		//O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, 
		//representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

		//Saída
		//Imprima o total que o funcionário deverá receber
		
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
