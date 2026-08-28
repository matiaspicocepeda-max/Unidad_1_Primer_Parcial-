import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {
        float nt1, nt2, nt3, promedio;
        try (var sc = new Scanner(System.in)) {
            System.out.println("Ingrese la nota 1: ");

        nt1 = sc.nextFloat();

        System.out.println("Ingrese la nota 2: ");

        nt2 = sc.nextFloat();

        System.out.println("Ingrese la nota 3: ");

        nt3 = sc.nextFloat();

        promedio = (nt1 + nt2 + nt3) / 3;
        
        System.out.println("Su primera nota es: " + nt1);
        System.out.println("Su segunda nota es: " + nt2);
        System.out.println("Su tercera nota es: " + nt3);
        System.out.println("Su promedio es: " + promedio);
    }
    }
}