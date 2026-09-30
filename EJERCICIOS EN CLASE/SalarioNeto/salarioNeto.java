import java.util.Scanner;

public class salarioNeto {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese el salario bruto: ");
			double salarioBruto = sc.nextDouble();

			if (salarioBruto < 0) {
				System.out.println("El salario no puede ser negativo.");
			} else {
				double descuentoIESS = salarioBruto * 0.0945;
				double salarioNeto = salarioBruto - descuentoIESS;

				System.out.printf("Descuento del IESS (9.45%%): %.2f%n", descuentoIESS);
				System.out.printf("Salario neto: %.2f%n", salarioNeto);
			}
		}
	}
}
