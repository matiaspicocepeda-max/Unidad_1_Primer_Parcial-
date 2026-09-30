#include <iostream>

using namespace std;

int main() {
	int dividendo;
	int divisor;

	cout << "Ingrese el dividendo: ";
	cin >> dividendo;

	cout << "Ingrese el divisor: ";
	cin >> divisor;

	if (divisor == 0) {
		cout << "El divisor no puede ser cero." << endl;
	} else {
		int residuo = dividendo % divisor;
		cout << "El residuo es: " << residuo << endl;
	}

	return 0;
}
