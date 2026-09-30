import java.util.Scanner;

public class salariosEmpleados {

    public static void main(String[] args) {
        // Uso de try-with-resources para liberar el recurso de Scanner automaticamente
        try (Scanner sc = new Scanner(System.in)) {

            // Variables de control interno
            int contadorEmpleados = 0;   // Contador para saber cuantos salarios validos se ingresaron
            double sumaSalarios = 0.0;   // Acumulador para guardar la suma de los salarios

            System.out.println("=== CALCULO DE PROMEDIO DE SALARIOS ===");
            System.out.println("Ingrese los salarios de los empleados.");
            System.out.println("Para finalizar el programa, ingrese un salario negativo (ejemplo: -1).\n");

            // Lectura inicial (primer salario)
            System.out.print("Ingrese el salario del empleado " + (contadorEmpleados + 1) + ": ");
            double salario = solicitarNumeroValido(sc);

            // Ciclo centinela: se repite MIENTRAS el salario sea mayor o igual a cero
            while (salario >= 0) {
                sumaSalarios += salario;      // Acumula el salario ingresado
                contadorEmpleados++;          // Incrementa el numero de empleados contabilizados

                // Solicita el siguiente salario
                System.out.print("Ingrese el salario del empleado " + (contadorEmpleados + 1) + ": ");
                salario = solicitarNumeroValido(sc);
            }

            // Muestra de resultados
            System.out.println("\n----------------- RESUMEN -----------------");
            if (contadorEmpleados > 0) {
                double promedio = sumaSalarios / contadorEmpleados;
                System.out.printf("Total de empleados procesados : %d\n", contadorEmpleados);
                System.out.printf("Suma total de salarios        : $%.2f\n", sumaSalarios);
                System.out.printf("Promedio de salarios          : $%.2f\n", promedio);
            } else {
                System.out.println("No se ingresaron salarios validos para calcular el promedio.");
            }
            System.out.println("-------------------------------------------");
        }
    }

    // Metodo auxiliar para evitar que el programa falle si se ingresan letras
    private static double solicitarNumeroValido(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada no valida. Ingrese un valor numerico para el salario: ");
            sc.next(); // Consume la entrada incorrecta
        }
        return sc.nextDouble();
    }
}
