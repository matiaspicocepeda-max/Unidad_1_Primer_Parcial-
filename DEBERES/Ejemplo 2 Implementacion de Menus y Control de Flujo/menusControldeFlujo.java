import java.util.Scanner; 
public class menusControldeFlujo { 

  

    public static void main(String[] args) { 

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1. Deposito\n2. Retiro\n3. Saldo"); 

            System.out.print("Elija una opcion: "); 

            int opcion = scanner.nextInt(); 

            switch (opcion) {
                case 1 -> ejecutarDeposito();
                case 2 -> ejecutarRetiro();
                case 3 -> mostrarSaldo();
                default -> mostrarError("Opcion no valida");
            }
        }

    } 

    public static void ejecutarDeposito() { System.out.println("Deposito exitoso."); } 

    public static void ejecutarRetiro() { System.out.println("Retiro exitoso."); } 

    public static void mostrarSaldo() { System.out.println("Su saldo es $100.00"); } 

    public static void mostrarError(String mensaje) { System.out.println("Error: " + mensaje); } 

} 

 