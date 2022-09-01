import java.util.Scanner;
public class Lacos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String opcao;
		
		System.out.println("Digite 'S' para sim ou 'N' para não.");
		opcao = sc.next();
		
		while(!(opcao.equals("s") || opcao.equals("S") || opcao.equals("n") || opcao.equals("N"))) {
			System.out.println("Voce digitu " + opcao + ". Por favor, digite 'S' ou 'N'.");
			opcao = sc.next();
			
		}
		
		System.out.println("Voce digitou " + opcao);
		
	}
	

}
