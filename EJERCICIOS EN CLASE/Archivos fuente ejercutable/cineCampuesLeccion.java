
import java.util.Scanner;

public class CineCampus {

    static final double PRECIO_2D = 5.00;
    static final double PRECIO_3D = 7.00;
    static final double DESCUENTO_ESTUDIANTE = 0.20;
    static final double DESCUENTO_MAYOR = 0.30;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        int opcion;
        int cantidad;
        int edad;
        int tipoFuncion;

        
        int totalEntradas = 0;
        int entradasEstudiante = 0;
        int entradasMayor = 0;

        
        double totalRecaudado = 0;

        do {

            
            System.out.println("\n========== CINECAMPUS ==========");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Mostrar resumen");
            System.out.println("3. Salir");
            System.out.println("================================");

           
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            while (opcion < 1 || opcion > 3) {
                System.out.println("Opción inválida.");
                System.out.print("Ingrese una opción entre 1 y 3: ");
                opcion = scanner.nextInt();
            }

            
            switch (opcion) {

                case 1:

                    
                    System.out.println("\n--- TIPO DE FUNCIÓN ---");
                    System.out.println("1. Película 2D - $5.00");
                    System.out.println("2. Película 3D - $7.00");

                    System.out.print("Seleccione el tipo de función: ");
                    tipoFuncion = scanner.nextInt();

                    
                    while (tipoFuncion < 1 || tipoFuncion > 2) {
                        System.out.println("Tipo de función inválido.");
                        System.out.print("Ingrese 1 para 2D o 2 para 3D: ");
                        tipoFuncion = scanner.nextInt();
                    }

                    
                    System.out.print("Ingrese la cantidad de entradas: ");
                    cantidad = scanner.nextInt();

                    
                    while (cantidad <= 0) {
                        System.out.println("La cantidad debe ser mayor que 0.");
                        System.out.print("Ingrese nuevamente la cantidad: ");
                        cantidad = scanner.nextInt();
                    }

                    
                    for (int i = 1; i <= cantidad; i++) {

                        System.out.println("\n--- Entrada #" + i + " ---");

                        System.out.print("Ingrese la edad del cliente: ");
                        edad = scanner.nextInt();

                        
                        while (edad < 0 || edad > 120) {
                            System.out.println("Edad inválida.");
                            System.out.print("Ingrese una edad entre 0 y 120: ");
                            edad = scanner.nextInt();
                        }

                        
                        double precio;

                        if (tipoFuncion == 1) {
                            precio = PRECIO_2D;
                        } else {
                            precio = PRECIO_3D;
                        }

                        
                        double descuento = 0;

                        if (edad >= 18 && edad <= 25) {

                            descuento = precio * DESCUENTO_ESTUDIANTE;
                            entradasEstudiante++;

                        } else if (edad >= 60) {

                            descuento = precio * DESCUENTO_MAYOR;
                            entradasMayor++;

                        }

                        double precioFinal = precio - descuento;

                        
                        totalRecaudado += precioFinal;
                        totalEntradas++;

                        
                        System.out.println("Tipo: "
                                + (tipoFuncion == 1 ? "2D" : "3D"));
                        System.out.println("Precio normal: $" + precio);
                        System.out.println("Descuento: $" + descuento);
                        System.out.println("Precio final: $" + precioFinal);
                    }

                    System.out.println("\nCompra realizada correctamente.");

                    break;

                case 2:

                   
                    System.out.println("\n========== RESUMEN ==========");
                    System.out.println("Total de entradas: " + totalEntradas);
                    System.out.println("Entradas con descuento estudiantil: "
                            + entradasEstudiante);
                    System.out.println("Entradas con descuento de adulto mayor: "
                            + entradasMayor);
                    System.out.printf("Total recaudado: $%.2f%n",
                            totalRecaudado);
                    System.out.println("=============================");

                    break;

                case 3:

                    System.out.println("\nGracias por utilizar CineCampus.");
                    System.out.println("Programa finalizado.");

                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }
}
```
