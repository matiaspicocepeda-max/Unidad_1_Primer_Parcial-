#include <iostream>

using namespace std;

int main() {
	double precio;

	cout << "Ingrese el precio: ";
	cin >> precio;

	if (precio < 0) {
		cout << "El precio no puede ser negativo." << endl;
	} else {
		double iva = precio * 0.15;
		double total = precio + iva;

		cout << "IVA (15%): " << iva << endl;
		cout << "Total con IVA: " << total << endl;
	}

	return 0;
}
