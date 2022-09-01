import java.util.Scanner;
public class Para {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cont, num, maior;
		
		System.out.println("Digite 5 numeros");
		num = sc.nextInt();
		maior = num;
		
		for(cont = 1; cont < 5; cont++) {
			num = sc.nextInt();
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("Maior valor = " + maior);
		
		
	}

}
