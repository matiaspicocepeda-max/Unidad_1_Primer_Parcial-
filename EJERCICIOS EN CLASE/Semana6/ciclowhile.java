import java.util.Scanner;

public class ciclowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad = 0;

		while (edad < 18) {
			System.out.println("Ingresa tu edad:");
			edad = sc.nextInt();
		}

		System.out.println("Acceso permitido.");
		sc.close();
	}
}
