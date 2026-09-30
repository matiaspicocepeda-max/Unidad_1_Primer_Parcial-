public class tarea1 {
    public static void main(String[] args) {
        int contadorInteracciones = 0;
        int sumaSeguimiento = 0;

        System.out.println("i | j | Interaccion | Suma Acumulada");
        System.out.println("-------------------------------------");

        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                contadorInteracciones++;
                sumaSeguimiento += (i * j);
                
                
                System.out.printf("%d | %d | %12d | %14d\n", i, j, contadorInteracciones, sumaSeguimiento);
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("Total interacciones: " + contadorInteracciones);
        System.out.println("Resultado final de la suma: " + sumaSeguimiento);
    }
}