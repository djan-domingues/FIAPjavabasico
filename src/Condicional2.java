import java.util.Scanner;
public class Condicional2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double salario;
		int tempoCasa;
		double perc;
		
		System.out.println("Digite o seu salário: ");
		salario = sc.nextDouble();
		
		System.out.println("Digite o tempo de casa: ");
		tempoCasa = sc.nextInt();
		
		if(tempoCasa >= 5) {
			perc = salario * 10/100;
			salario = salario + perc;
		}
		else if(tempoCasa < 5 && tempoCasa >= 3) {
			perc = salario * 3/100;
			salario = salario + perc;
		}
		
		System.out.println("De acordo com o tempo de casa o seu salario recebeu um acrescimo e agora é de: R$" + salario);
		
	}

}
