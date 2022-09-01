import java.util.Scanner;
public class Cubo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Escreva um numero: ");
		
		num = sc.nextInt();
		
		int cubo = num * num * num;
		
		System.out.println("O cubo de " + num + " é igual a: " + cubo);
		
	}
	
	

}
