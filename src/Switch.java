import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia;
		
		System.out.println("Escreva o dia da semana");
		dia = sc.nextInt();
		
		switch(dia)
		{
		case 1: {
			System.out.println("Hoje é Domingo");
			break;
		}
		case 2: {
			System.out.println("Hoje é Segunda");
			break;
		}
		case 3: {
			System.out.println("Hoje é Terça");
			break;
		}
		case 4: {
			System.out.println("Hoje é Quarta");
			break;
		}
		case 5: {
			System.out.println("Hoje é Quinta");
			break;
		}
		case 6: {
			System.out.println("Hoje é Sexta");
			break;
		}
		case 7: {
			System.out.println("Hoje é Sabado");
			break;
		}
		default: {
			System.out.println("Dia invalido");
			break;
		}
		
		
		
		}
	}
}
