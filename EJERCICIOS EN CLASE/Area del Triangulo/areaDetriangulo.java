import java.util.Scanner;

public class areaDetriangulo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese la base del triangulo: ");
			double base = sc.nextDouble();

			System.out.print("Ingrese la altura del triangulo: ");
			double altura = sc.nextDouble();

			if (base <= 0 || altura <= 0) {
				System.out.println("La base y la altura deben ser mayores que cero.");
			} else {
				double area = (base * altura) / 2;
				System.out.println("El area del triangulo es: " + area);
			}
		}
	}
}
