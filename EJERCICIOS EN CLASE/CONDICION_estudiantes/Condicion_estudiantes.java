import java.util.Scanner;

public class Condicion_estudiantes{

    
    private static final float NOTA_APROBACION = 7.0f;
    private static final int TOTAL_NOTAS = 3;

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            float[] notas = new float[TOTAL_NOTAS];
            float suma = 0;

       
        for (int i = 0; i < TOTAL_NOTAS; i++) {
            System.out.printf("Ingrese la nota %d: ", i + 1);
            notas[i] = scanner.nextFloat();
            suma += notas[i];
        }

        float promedio = suma / TOTAL_NOTAS;

        
        System.out.println("\n--- RESUMEN DE NOTAS ---");
        for (int i = 0; i < TOTAL_NOTAS; i++) {
            System.out.printf("Nota %d: %.2f%n", i + 1, notas[i]);
        }

        System.out.printf("Promedio final: %.2f%n", promedio);

        String estado = (promedio >= NOTA_APROBACION) ? "Aprobado" : "Reprobado";
        System.out.println("Estado del estudiante: " + estado);

        }
    }
}