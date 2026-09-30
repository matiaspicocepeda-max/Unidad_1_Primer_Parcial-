import java.util.Scanner;

public class divisionEntera {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese el dividendo: ");
			int dividendo = sc.nextInt();

			System.out.print("Ingrese el divisor: ");
			int divisor = sc.nextInt();

			if (divisor == 0) {
				System.out.println("No se puede dividir entre cero.");
			} else {
				int cociente = dividendo / divisor;
				int residuo = dividendo % divisor;

				System.out.println("Cociente entero: " + cociente);
				System.out.println("Residuo: " + residuo);
			}
		}
	}
}
