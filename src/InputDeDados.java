import java.util.Scanner;
public class InputDeDados {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		
		int dobro = num * 2;
		
		System.out.println("O dobro de " + num + " é igual a: " + dobro);
	}
	
	

}
