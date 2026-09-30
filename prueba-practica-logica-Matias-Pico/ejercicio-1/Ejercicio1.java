import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== COMPETENCIA DE PROGRAMACION POR NIVELES ===");

            System.out.print("Ingrese Puntaje Reto 1: ");
            double reto1 = solicitarNumeroValido(sc);

            System.out.print("Ingrese Puntaje Reto 2: ");
            double reto2 = solicitarNumeroValido(sc);

            System.out.print("Ingrese Puntaje Reto 3: ");
            double reto3 = solicitarNumeroValido(sc);

            System.out.print("Ingrese Numero de errores: ");
            int errores = solicitarEnteroNoNegativo(sc);

            System.out.print("Ingrese Tiempo total en minutos: ");
            int tiempo = solicitarEnteroNoNegativo(sc);

            String extra = solicitarSiNo(sc, "Resolvio desafio extra? (Si/No): ");
            String copia = solicitarSiNo(sc, "Fue descalificado por copia? (Si/No): ");

            double puntajeBase = reto1 + reto2 + reto3;
            double penalizacion = errores * 4.0;
            double bonificacion = 0.0;

            if (esRespuestaSi(extra)) {
                bonificacion += 15.0;
            }

            if (tiempo < 30) {
                bonificacion += 10.0;
            }

            double puntajeFinal = puntajeBase - penalizacion + bonificacion;
            if (puntajeFinal < 0) {
                puntajeFinal = 0;
            }

            String nivel;
            if (puntajeFinal < 30) {
                nivel = "Principiante";
            } else if (puntajeFinal < 50) {
                nivel = "Basico";
            } else if (puntajeFinal < 70) {
                nivel = "Intermedio";
            } else if (puntajeFinal < 90) {
                nivel = "Avanzado";
            } else {
                nivel = "Experto";
            }

            if (esRespuestaSi(copia)) {
                nivel = "Descalificado";
            }

            String observacion = "Ninguna";
            if (puntajeFinal >= 70 && errores >= 5) {
                observacion = "Resultado inconsistente: revisar calidad de resolucion";
            }

            System.out.println("\n================ SALIDA ESPERADA ================");
            System.out.printf("Puntaje base  : %.2f\n", puntajeBase);
            System.out.printf("Penalizacion  : %.2f\n", penalizacion);
            System.out.printf("Bonificacion  : %.2f\n", bonificacion);
            System.out.printf("Puntaje final : %.2f\n", puntajeFinal);
            System.out.println("Nivel         : " + nivel);
            System.out.println("Observacion   : " + observacion);
            System.out.println("===============================================");
        }
    }

    private static double solicitarNumeroValido(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada invalida. Ingrese un valor numerico: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static int solicitarEnteroNoNegativo(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Entrada invalida. Ingrese un entero no negativo: ");
            sc.next();
        }
        int valor = sc.nextInt();
        while (valor < 0) {
            System.out.print("Entrada invalida. Ingrese un entero no negativo: ");
            valor = sc.nextInt();
        }
        return valor;
    }

    private static String solicitarSiNo(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        String resp = sc.next().trim();
        while (!esRespuestaSi(resp) && !esRespuestaNo(resp)) {
            System.out.print("Respuesta no valida. Ingrese Si/No (o S/N): ");
            resp = sc.next().trim();
        }
        return resp;
    }

    private static boolean esRespuestaSi(String resp) {
        return resp.equalsIgnoreCase("Si")
                || resp.equalsIgnoreCase("Si")
                || resp.equalsIgnoreCase("S");
    }

    private static boolean esRespuestaNo(String resp) {
        return resp.equalsIgnoreCase("No")
                || resp.equalsIgnoreCase("N");
    }
}