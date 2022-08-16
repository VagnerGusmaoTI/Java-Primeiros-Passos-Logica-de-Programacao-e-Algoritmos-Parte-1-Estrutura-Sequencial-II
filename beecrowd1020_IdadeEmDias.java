import java.util.Scanner;

public class beecrowd1020_IdadeEmDias {
	
public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1020 Idade em dias
		//https://www.beecrowd.com.br/judge/pt/problems/view/1020
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main

		
		//Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias

		//Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias. 
		//Nos casos de teste nunca haver� uma situa��o que permite 12 meses e alguns dias, como 360, 363 ou 364. 
		//Este � apenas um exerc�cio com objetivo de testar racioc�nio matem�tico simples.

		//Entrada
		//O arquivo de entrada cont�m um valor inteiro.

		//Sa�da
		//Imprima a sa�da conforme exemplo fornecido.
		
				
		Scanner sc = new Scanner (System.in);
		
		int idadeDias, ano, mes, dia, resto;
		
		idadeDias = sc.nextInt();
		
		ano = idadeDias/365;
		resto = idadeDias % 365;
		mes = resto/30;
		dia = resto % 30;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();

	}

}
