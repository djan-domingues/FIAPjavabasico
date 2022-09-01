import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, soma = 0;

		do {
			System.out.println("Digite um numero");
			num = sc.nextInt();

			if (num >= 0) {

				soma += num;
			}

		} while (num >= 0);

	}
}
