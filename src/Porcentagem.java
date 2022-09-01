import java.util.Scanner;
public class Porcentagem {
	
	public static void main(String[] args) {
		
		double valor;
		int porc;
		double perc;
		double acres;
		double decres;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = sc.nextDouble();
		
		System.out.println("Digite a porcentagem: ");
		porc = sc.nextInt();
		
		perc = valor * porc / 100;
		
		acres = valor + perc;
		
		decres = valor - perc;
		
		System.out.println("O percentual de " + porc + " sobre o valor de " + valor + "é " + perc + " sendo assim o acrescimo é " + acres + " e o desconto é " + decres);
		
	}
	

}
