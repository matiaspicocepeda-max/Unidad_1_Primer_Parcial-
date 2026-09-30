import java.util.Scanner;

public class cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, edad;
        double precioBase = 0, descuento, precioFinal, totalCompra = 0;

        do {
            System.out.println("===== MENU FORMATOS DE CINE =====");
            System.out.println("1. 2D ($5,00)");
            System.out.println("2. 3D ($7,50)");
            System.out.println("3. IMAX ($10,00)");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion invalida. Ingrese un numero del 1 al 4.");
                sc.next();
                System.out.print("Seleccione una opcion: ");
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    precioBase = 5.00;
                    break;
                case 2:
                    precioBase = 7.50;
                    break;
                case 3:
                    precioBase = 10.00;
                    break;
                case 4:
                    System.out.println("Finalizando proceso de seleccion...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }

            if (opcion >= 1 && opcion <= 3) {
                do {
                    System.out.print("Ingrese la edad del cliente (0 a 120): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Error: Ingrese una edad valida.");
                        sc.next();
                        System.out.print("Ingrese la edad del cliente (0 a 120): ");
                    }
                    edad = sc.nextInt();
                    if (edad < 0 || edad > 120) {
                        System.out.println("Error: La edad debe estar entre 0 y 120 anos.");
                    }
                } while (edad < 0 || edad > 120);

                if (edad < 12) {
                    descuento = 0.30;
                } else if (edad >= 65) {
                    descuento = 0.25;
                } else {
                    descuento = 0.00;
                }

                precioFinal = precioBase * (1 - descuento);
                totalCompra += precioFinal;

                System.out.printf("Entrada agregada. Precio con descuento: $%.2f%n%n", precioFinal);
            }

        } while (opcion != 4);

        System.out.println("=================================");
        System.out.printf("Total final de la compra: $%.2f%n", totalCompra);
        System.out.println("Gracias por su compra.");
        sc.close();
    }
}
