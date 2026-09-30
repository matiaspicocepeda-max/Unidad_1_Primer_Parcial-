import java.util.Scanner;

public class entradaSalida {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese su nombre: ");
			String nombre = sc.nextLine();

			System.out.print("Ingrese su edad: ");
			int edad = sc.nextInt();

			System.out.println("Hola, " + nombre + ". Usted tiene " + edad + " años.");
		}
	}
}
