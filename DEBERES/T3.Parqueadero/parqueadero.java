import java.util.Scanner;

public class parqueadero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String opcionMenu, tipoVehiculo, rolUsuario, diaSemana, perdioBoleto;
        double horasEstacionado = 0, tarifaBase = 0, factorDia = 0, porcDescuento = 0, multaBoleto = 0;
        double subtotal = 0, montoDescuento = 0, totalPagar = 0;
        String mensajeSalida;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== MENU ESTACIONAMIENTO =====");
            System.out.println("1. Calcular tarifa");
            System.out.println("2. Ver tarifas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = scanner.nextLine();

            switch (opcionMenu) {
                case "1":
                    System.out.print("Ingrese tipo de vehiculo (Auto/Moto): ");
                    tipoVehiculo = scanner.nextLine();

                    System.out.print("Ingrese rol del usuario (Estudiante/Docente/Visitante): ");
                    rolUsuario = scanner.nextLine();

                    System.out.print("Ingrese dia de la semana: ");
                    diaSemana = scanner.nextLine();

                    System.out.print("Ingrese cantidad de horas: ");
                    horasEstacionado = Double.parseDouble(scanner.nextLine());

                    System.out.print("¿Perdio el boleto? (SI/NO): ");
                    perdioBoleto = scanner.nextLine();

                    // Determinar tarifa base
                    if (tipoVehiculo.equalsIgnoreCase("Auto")) {
                        tarifaBase = 1.50;
                    } else if (tipoVehiculo.equalsIgnoreCase("Moto")) {
                        tarifaBase = 0.75;
                    } else {
                        tarifaBase = 0.00;
                        System.out.println("Tipo de vehiculo no valido");
                    }

                    
                    if (diaSemana.equalsIgnoreCase("Sabado") || diaSemana.equalsIgnoreCase("Sábado") || diaSemana.equalsIgnoreCase("Domingo")) {
                        factorDia = 0.10;
                    } else {
                        factorDia = 0.00;
                    }

                    
                    if (rolUsuario.equalsIgnoreCase("Estudiante")) {
                        porcDescuento = 0.50;
                    } else if (rolUsuario.equalsIgnoreCase("Docente")) {
                        porcDescuento = 0.30;
                    } else {
                        porcDescuento = 0.00;
                    }

                    
                    if (perdioBoleto.equalsIgnoreCase("SI")) {
                        multaBoleto = 10.00;
                    } else {
                        multaBoleto = 0.00;
                    }

                    
                    subtotal = (tarifaBase * (1 + factorDia)) * horasEstacionado;
                    montoDescuento = subtotal * porcDescuento;
                    totalPagar = (subtotal - montoDescuento) + multaBoleto;

                    mensajeSalida = "Total a pagar: $" + String.format("%.2f", totalPagar);
                    System.out.println(mensajeSalida);
                    break;

                case "2":
                    
                    System.out.println("\n===== TABLA DE TARIFAS =====");
                    System.out.println("Auto: $1.50/hora | Moto: $0.75/hora");
                    System.out.println("Recargo fin de semana: 10%");
                    System.out.println("Descuento Estudiante: 50% | Docente: 30% | Visitante: 0%");
                    System.out.println("Multa por boleto perdido: $10.00");
                    break;

                case "3":
                    mensajeSalida = "Gracias por usar el sistema. Saliendo...";
                    System.out.println(mensajeSalida);
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida, intente nuevamente");
                    break;
            }
        }

        scanner.close();
    }
}