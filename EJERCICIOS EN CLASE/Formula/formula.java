import java.util.Scanner;

public class formula {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese el valor de n: ");
			long n = sc.nextLong();

			long resultado = n * (n + 1) / 2;
			System.out.println("El resultado de n * (n + 1) / 2 es: " + resultado);
		}
	}
}
