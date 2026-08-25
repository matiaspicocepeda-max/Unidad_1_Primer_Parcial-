#include <iostream>
using namespace std;

int main() {
    char producto[100];
    double precioUnitario;
    int cantidad;
    double pago;

    cout << "Ingrese el tipo de cafe: ";
    cin.getline(producto, sizeof(producto));

    cout << "Ingrese el precio unitario: ";
    cin >> precioUnitario;

    cout << "Ingrese la cantidad: ";
    cin >> cantidad;

    double subtotal = precioUnitario * cantidad;
    double descuento = subtotal * 0.10;
    double total = subtotal - descuento;

    cout << "\n--- FACTURA ---" << endl;
    cout << "Producto: " << producto << endl;
    cout << "Cantidad: " << cantidad << endl;
    cout << "Subtotal: $" << subtotal << endl;
    cout << "Descuento (10%): $" << descuento << endl;
    cout << "Total a pagar: $" << total << endl;

    cout << "\nIngrese el dinero entregado: ";
    cin >> pago;

    if (pago >= total) {
        double cambio = pago - total;
        cout << "Pago aceptado. Su cambio es: $" << cambio << endl;
    } else {
        double faltante = total - pago;
        cout << "Dinero insuficiente. Faltan: $" << faltante << endl;
    }

    return 0;
}