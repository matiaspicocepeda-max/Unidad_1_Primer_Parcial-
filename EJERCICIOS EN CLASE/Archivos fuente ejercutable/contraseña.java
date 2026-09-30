import java.util.Scanner;
class contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String clave = "Java2026";
        String intento;
        int intentosRestantes = 3;


        while (intentosRestantes > 0) {
            System.out.print("Ingrese la contrasena: ");
            intento = scanner.nextLine();


            if (intento.equals(clave)) {
                System.out.println("Acceso permitido");
                intentosRestantes = 0; // Termina el ciclo inmediatamente
            } else {
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("Contrasena incorrecta. Intentos restantes: " + intentosRestantes);
                } else {
                    System.out.println("Usuario bloqueado");
                }
            }
        }
        scanner.close();
    }
}
