import java.util.Scanner;

public class beecrowd1019_ConversaoDeTempo {
	
	public static void main(String[] args) {
		
		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1019 Convers�o de tempo
		//https://www.beecrowd.com.br/judge/pt/problems/view/1019
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//� Aplicamos:
			//� Operador % ("mod")
		
		//Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.

		//Entrada
		//O arquivo de entrada cont�m um valor inteiro N.

		//Sa�da
		//Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos
		
		//AN�LISE:
			//1 minuto = 60 segundos
			//1 hora = 60 minutos = 3600 segundos
			//140153 segundos cont�m quantas horas?
			//140153 / 3600 = 38,931388...
			//38 x 3600 = 136800
			//SOBRA: 3353
			//3353 / 60 = 55,8833...
			//55 x 60 = 3300
			//SOBRA: 53
		
		Scanner sc = new Scanner (System.in);
		
		int numeroSegundos, resto, horas, minutos, segundos;
		
		numeroSegundos = sc.nextInt();
		
		horas = numeroSegundos/3600;
		resto = numeroSegundos % 3600;
		
		minutos = resto / 60;
		
		segundos = resto % 60;
		
		System.out.println(horas+":"+minutos+":"+segundos);
		
		sc.close();

	}

}
