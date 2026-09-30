#include <iomanip>
#include <iostream>
using namespace std;
int main() {
	double salarioBruto;
	cout << "Ingrese el salario bruto: ";
	cin >> salarioBruto;
	if (salarioBruto < 0) {
		cout << "El salario no puede ser negativo." << endl;
	} else {
		double descuentoIESS = salarioBruto * 0.0945;
		double salarioNeto = salarioBruto - descuentoIESS;

		cout << fixed << setprecision(2);
		cout << "Descuento del IESS (9.45%): " << descuentoIESS << endl;
		cout << "Salario neto: " << salarioNeto << endl;
	}
	return 0;
}
