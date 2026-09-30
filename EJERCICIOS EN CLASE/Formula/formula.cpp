#include <iostream>

using namespace std;

int main() {
	long long n;

	cout << "Ingrese el valor de n: ";
	cin >> n;

	long long resultado = n * (n + 1) / 2;
	cout << "El resultado de n * (n + 1) / 2 es: " << resultado << endl;

	return 0;
}
