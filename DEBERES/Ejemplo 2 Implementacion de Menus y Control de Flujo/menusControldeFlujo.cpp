#include <iostream> 

#include <string> 
using namespace std; 

void ejecutarDeposito(); 

void ejecutarRetiro(); 

void mostrarSaldo(); 

void mostrarError(string mensaje); 
int main() { 

    int opcion; 

    cout << "--- MENU BANCARIO ---" << endl; 

    cout << "1. Deposito" << endl; 

    cout << "2. Retiro" << endl; 

    cout << "3. Mostrar Saldo" << endl; 

    cout << "Elija una opcion: "; 

    cin >> opcion; 

    switch (opcion) { 

        case 1: 

            ejecutarDeposito(); 

            break;  

        case 2: 

            ejecutarRetiro(); 

            break; 

        case 3: 

            mostrarSaldo(); 

            break; 

        default:  

            mostrarError("Opcion no valida"); 

            break; 

    } 
    return 0; 

} 
void ejecutarDeposito() { 

    cout << "Ejecutando deposito... Transaccion exitosa." << endl; 

} 
void ejecutarRetiro() { 

    cout << "Ejecutando retiro... Por favor tome su dinero." << endl; 

} 
void mostrarSaldo() { 

    cout << "Mostrando saldo actual... Su saldo es $100.00" << endl; 

} 
void mostrarError(string mensaje) { 

    cout << "Error: " << mensaje << endl; 

} 