import java.util.Scanner;
public class MeuPrimeiroPrograma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7:");
		int dia = input.nextInt();
				switch(dia) {
				case 1:
					System.out.print("Hoje é domingo.");
					break;
				case 2:
					System.out.print("Hoje é segunda-feira.");
					break;
				case 3:
					System.out.print("Hoje é terça-feira.");
				case 4:
					System.out.print("Hoje é quarta-feira.");
					break;
				case 5:
					System.out.print("Hoje é quinta-feira.");
					break;
				case 6:
					System.out.print("Hoje é sexta-feira.");
					break;
				case 7:
					System.out.print("Hoje é sábado.");
					break;
				}
	
	}
}
