import java.util.Scanner;

public class cafeteriaUniversitaria {
    public static void main(String[] agrs) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el tipo de cafe: ");
            String producto = sc.nextLine();

            System.out.print("Ingrese el precio unitario: ");
            double precioUnitario = sc.nextDouble();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = sc.nextInt();

            double subtotal = precioUnitario * cantidad;

            double descuento = subtotal * 0.10;
            double total = subtotal - descuento;

            System.out.println("\n--- FACTURA ---");
            System.out.println("Producto: " + producto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("Descuento (10%): $" + descuento);
            System.out.println("Total a pagar: $" + total);

            System.out.print("\nIngrese el dinero entregado: ");
            double pago = sc.nextDouble();

            if (pago >= total) {
                double cambio = pago - total;
                System.out.println("Pago aceptado. Su cambio es: $" + cambio);
            } else {
                double faltante = total - pago;
                System.out.println("Dinero insuficiente. faltan: $" + faltante);
            }
        }
    }
}