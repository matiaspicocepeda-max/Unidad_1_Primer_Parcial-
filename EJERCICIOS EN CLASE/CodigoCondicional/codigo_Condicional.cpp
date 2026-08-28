#include <iostream>
using namespace std;

int main() {
    int num;

    cout << "Ingrese un numero: ";
    cin >> num;

    if (num > 0 && num < 100) {
        cout << "Es positivo y menor a 100" << endl;
    } else {
        cout << "No es positivo o es mayor a 100" << endl;
    }

    return 0;
}