import java.util.Scanner;
public class MeuPrimeiroPrograma{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Esse programa mostrará todos os múltiplos de um número selecionado.");
		System.out.println("Digite o número inicial:");
		int ni = input.nextInt();
		System.out.println("Digite o número final:");
		int nf = input.nextInt();
		System.out.println("Intervalo entre números:");
		int intervalo = input.nextInt();
		while (ni <= nf) {
			if (ni%intervalo == 0) {
				System.out.println(ni + " é múltiplo de " + intervalo + ".");
				}
			ni = ni + 1;
		}
		
	}
}
