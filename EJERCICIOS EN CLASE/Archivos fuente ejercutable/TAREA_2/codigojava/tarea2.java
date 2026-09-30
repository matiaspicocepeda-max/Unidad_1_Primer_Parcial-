import java.util.Scanner;

public class tarea2 {

    public static String calcularEstadoNota(double nota) {
      
        if (nota < 0.0 || nota > 10.0) {
            return "Error: Nota fuera de rango (debe estar entre 0.0 y 10.0)";
        }
        
        
        if (nota >= 7.0) {
            return "Aprobado";
        } 
        
        else if (nota >= 4.0) {
            return "Supletorio";
        } 
        
        else {
            return "Reprobado";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== SISTEMA DE EVALUACIÓN DE NOTAS ===");
            System.out.print("Ingrese la nota del estudiante: ");

            if (scanner.hasNext()) {
                String entrada = scanner.next().replace(',', '.');
                try {
                    double nota = Double.parseDouble(entrada);
                    String resultado = calcularEstadoNota(nota);
                    System.out.println("Resultado: " + resultado);
                } catch (NumberFormatException exception) {
                    System.out.println("Error: Entrada no válida. Debe ingresar un número decimal.");
                }
            } else {
                System.out.println("Error: Entrada no válida. Debe ingresar un número decimal.");
            }

            System.out.println("\n=== EJECUCIÓN DE BATERÍA DE PRUEBAS (100% PATH COVERAGE) ===");
            double[] casosPrueba = {-1.5, 8.5, 5.0, 2.5, 11.0};

            for (double testNota : casosPrueba) {
                System.out.printf("Nota probada: %5.1f -> Estado: %s\n", testNota, calcularEstadoNota(testNota));
            }
        }
    }
}