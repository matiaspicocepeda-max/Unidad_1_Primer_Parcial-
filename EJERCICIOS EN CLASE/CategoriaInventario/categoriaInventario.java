import java.util.Scanner;

public class categoriaInventario {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese la cantidad de productos en stock: ");
			int stock = sc.nextInt();

			if (stock < 0) {
				System.out.println("El stock no puede ser negativo.");
			} else if (stock <= 10) {
				System.out.println("Categoria: Stock bajo");
			} else if (stock <= 50) {
				System.out.println("Categoria: Stock medio");
			} else {
				System.out.println("Categoria: Stock alto");
			}
		}
	}
}
