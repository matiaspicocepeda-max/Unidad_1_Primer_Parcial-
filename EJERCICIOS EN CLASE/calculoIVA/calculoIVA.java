import java.util.Scanner;

public class calculoIVA {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese el precio: ");
			double precio = sc.nextDouble();

			if (precio < 0) {
				System.out.println("El precio no puede ser negativo.");
			} else {
				double iva = precio * 0.15;
				double total = precio + iva;

				System.out.println("IVA (15%): " + iva);
				System.out.println("Total con IVA: " + total);
			}
		}
	}
}
