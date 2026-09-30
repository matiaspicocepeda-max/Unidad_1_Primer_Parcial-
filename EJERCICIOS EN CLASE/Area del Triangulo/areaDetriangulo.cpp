#include <iostream>

using namespace std;

int main() {
	double base;
	double altura;

	cout << "Ingrese la base del triangulo: ";
	cin >> base;

	cout << "Ingrese la altura del triangulo: ";
	cin >> altura;

	if (base <= 0 || altura <= 0) {
		cout << "La base y la altura deben ser mayores que cero." << endl;
	} else {
		double area = (base * altura) / 2;
		cout << "El area del triangulo es: " << area << endl;
	}

	return 0;
}
