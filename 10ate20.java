import java.util.Scanner;
public class MeuPrimeiroPrograma{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o número 0:");
		int zero = input.nextInt();
		while (zero<20) {
			zero = zero + 1;
					if (zero >= 10) {
						System.out.println(zero);
						}
					}	
	}
}
