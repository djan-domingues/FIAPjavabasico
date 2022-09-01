import java.util.Scanner;

public class Laco2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float num = 1, soma = 0;

		System.out.println("Digite 0 para finalizar: ");

		while (num != 0) {
			System.out.println("Digite um numero: ");
			num = teclado.nextFloat();
		}

		System.out.println("Somatória = " + soma);
	}
}
