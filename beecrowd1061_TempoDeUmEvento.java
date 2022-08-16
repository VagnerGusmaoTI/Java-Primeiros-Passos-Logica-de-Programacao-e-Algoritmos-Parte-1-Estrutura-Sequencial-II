import java.util.Scanner;

public class beecrowd1061_TempoDeUmEvento {
	
	public static void main(String[] args) {

		//ESTRUTURA SEQUENCIAL
		
		//Exercicio da plataforma beecrowd, nivel iniciante: 1061 Tempo de um evento
		//https://www.beecrowd.com.br/judge/pt/problems/view/1061
		//OBS: ao publicar o exerc�cio na Plataforma Beecrowd mudar o nome da classe para Main
		
		//Pedrinho est� organizando um evento em sua Universidade. O evento dever� ser no m�s de Abril, iniciando e terminando dentro do m�s. 
		//O problema � que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

		//Sabendo que o evento pode durar de poucos segundos a v�rios dias, voc� dever� ajudar Pedrinho a calcular a dura��o deste evento.

		//Entrada
		//Como entrada, na primeira linha vai haver a descri��o �Dia�, seguido de um espa�o e o dia do m�s no qual o evento vai come�ar. Na linha seguinte, ser� informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haver� outra informa��o no mesmo formato das duas primeiras linhas, indicando o t�rmino do evento.

		//Sa�da
		//Na sa�da, deve ser apresentada a dura��o do evento, no seguinte formato:

		//W dia(s)
		//X hora(s)
		//Y minuto(s)
		//Z segundo(s)

		//Obs: Considere que o evento do caso de teste para o problema tem dura��o m�nima de 1 minuto.
		
		Scanner sc = new Scanner (System.in);
		
		int dia1, hora1, minuto1, segundo1, dia2, hora2, minuto2, segundo2, diasResultado, horasResultado, minutosResultado, segundosResultado, inicio, fim, duracaoEvento, resto;
		String textoDia, separadorDoisPontos;

		textoDia = sc.next();
		dia1 = sc.nextInt();
		hora1 = sc.nextInt();
		separadorDoisPontos = sc.next();
		minuto1 = sc.nextInt();
		separadorDoisPontos = sc.next();
		segundo1 = sc.nextInt();
		
		textoDia = sc.next();
		dia2 = sc.nextInt();
		hora2 = sc.nextInt();
		separadorDoisPontos = sc.next();
		minuto2 = sc.nextInt();
		separadorDoisPontos = sc.next();
		segundo2 = sc.nextInt();
		
		inicio = dia1*24*60*60 + hora1*60*60 + minuto1*60 + segundo1;
		fim = dia2*24*60*60 + hora2*60*60 + minuto2*60 + segundo2;
		duracaoEvento = fim - inicio;
		
		diasResultado = duracaoEvento / (24*60*60);
		resto = duracaoEvento % (24*60*60);
		horasResultado = resto / (60*60);
		resto = resto % (60*60);
		minutosResultado = resto / 60;
		segundosResultado = resto % 60;
		
		System.out.println(diasResultado + " dia(s)");
		System.out.println(horasResultado + " hora(s)");
		System.out.println(minutosResultado + " minuto(s)");
		System.out.println(segundosResultado + " segundo(s)");	
		
		sc.close();

	}

}
