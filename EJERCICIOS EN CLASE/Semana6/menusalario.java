import java.util.Scanner;

public class SistemaSalariosMenu {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Variables globales del sistema (mantienen el estado entre opciones)
            int contadorEmpleados = 0;
            double sumaSalarios = 0.0;
            double salarioMayor = 0.0;
            double salarioMenor = 0.0;
            int opcion = -1;

            // Bucle principal para repetir el menu
            do {
                System.out.println("\n===== SISTEMA DE SALARIOS =====");
                System.out.println("1. Registrar salarios");
                System.out.println("2. Mostrar resumen");
                System.out.println("3. Comparar un salario con el promedio");
                System.out.println("4. Reiniciar informacion");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opcion: ");

                while (!sc.hasNextInt()) {
                    System.out.print("Opcion invalida. Ingrese un numero: ");
                    sc.next();
                }
                opcion = sc.nextInt();

                // Procesamiento de opciones con switch
                switch (opcion) {
                    case 1:
                        System.out.println("\n--- REGISTRO DE SALARIOS ---");
                        System.out.println("Ingrese salarios. Ingrese un valor negativo para terminar.");
                        
                        System.out.print("Ingrese el salario del empleado " + (contadorEmpleados + 1) + ": ");
                        double salario = solicitarNumeroValido(sc);

                        // Registro con ciclo while y centinela
                        while (salario >= 0) {
                            // Si es el primer salario global, se asigna como mayor y menor
                            if (contadorEmpleados == 0) {
                                salarioMayor = salario;
                                salarioMenor = salario;
                            } else {
                                if (salario > salarioMayor) {
                                    salarioMayor = salario;
                                }
                                if (salario < salarioMenor) {
                                    salarioMenor = salario;
                                }
                            }

                            sumaSalarios += salario;
                            contadorEmpleados++;

                            System.out.print("Ingrese el salario del empleado " + (contadorEmpleados + 1) + ": ");
                            salario = solicitarNumeroValido(sc);
                        }
                        System.out.println("Registro finalizado.");
                        break;

                    case 2:
                        System.out.println("\n--- RESUMEN DE SALARIOS ---");
                        // Control para evitar division por cero
                        if (contadorEmpleados > 0) {
                            double promedio = sumaSalarios / contadorEmpleados;
                            System.out.printf("Total de empleados procesados : %d\n", contadorEmpleados);
                            System.out.printf("Suma total de salarios        : $%.2f\n", sumaSalarios);
                            System.out.printf("Promedio de salarios          : $%.2f\n", promedio);
                            System.out.printf("Salario mayor                 : $%.2f\n", salarioMayor);
                            System.out.printf("Salario menor                 : $%.2f\n", salarioMenor);
                        } else {
                            System.out.println("No hay datos registrados en el sistema.");
                        }
                        break;

                    case 3:
                        System.out.println("\n--- COMPARAR SALARIO CON PROMEDIO ---");
                        if (contadorEmpleados > 0) {
                            double promedioActual = sumaSalarios / contadorEmpleados;
                            System.out.print("Ingrese el salario a comparar: ");
                            double salarioBuscar = solicitarNumeroValido(sc);

                            if (salarioBuscar > promedioActual) {
                                System.out.printf("El salario $%.2f esta POR ENCIMA del promedio ($%.2f).\n", salarioBuscar, promedioActual);
                            } else if (salarioBuscar < promedioActual) {
                                System.out.printf("El salario $%.2f esta POR DEBAJO del promedio ($%.2f).\n", salarioBuscar, promedioActual);
                            } else {
                                System.out.printf("El salario $%.2f es IGUAL al promedio ($%.2f).\n", salarioBuscar, promedioActual);
                            }
                        } else {
                            System.out.println("No hay salarios registrados para calcular un promedio.");
                        }
                        break;

                    case 4:
                        // Reiniciar informacion
                        contadorEmpleados = 0;
                        sumaSalarios = 0.0;
                        salarioMayor = 0.0;
                        salarioMenor = 0.0;
                        System.out.println("\nInformacion reiniciada correctamente.");
                        break;

                    case 0:
                        System.out.println("\nSaliendo del sistema. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                        break;
                }

            } while (opcion != 0);
        }
    }

    private static double solicitarNumeroValido(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada no valida. Ingrese un valor numerico: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}