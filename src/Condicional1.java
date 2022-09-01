import java.util.Scanner;
public class Condicional1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		double perc;
		double valorFinal;
		
		System.out.println("Digite o valor da compra");
		
		valor = sc.nextDouble();
		
		if(valor >= 500) {
			perc = valor * 10/100;
			
			valorFinal = valor - perc;
		}else {
			valorFinal = valor;
		}
		
		System.out.println("O valor final da compra é: " + valorFinal);
		
	}

}
