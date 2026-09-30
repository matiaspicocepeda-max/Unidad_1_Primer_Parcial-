import java.util.Scanner;

public class operadorModulo {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese el dividendo: ");
			int dividendo = scanner.nextInt();

			System.out.print("Ingrese el divisor: ");
			int divisor = scanner.nextInt();

			if (divisor == 0) {
				System.out.println("El divisor no puede ser cero.");
			} else {
				int residuo = dividendo % divisor;
				System.out.println("El residuo es: " + residuo);
			}
		}
	}
}
