import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n, fat;

		System.out.println("Digite um número: ");
		n = teclado.nextInt();

		fat = 1;

		while (n > 1) {
			fat *= n;
			n--;
		}

		System.out.println("Fatorial = " + fat);
	}
}
