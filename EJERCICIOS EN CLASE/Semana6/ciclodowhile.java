import java.util.Scanner;

public class ciclodowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        do {
            System.out.println("Ingresa tu edad:");
            edad = sc.nextInt();
        } while (edad < 18);

        System.out.println("Acceso permitido.");
        sc.close();
    }   
}