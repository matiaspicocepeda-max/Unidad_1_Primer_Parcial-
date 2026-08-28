#include <iostream>
using namespace std;

int main() {
    float nt1, nt2, nt3, promedio;

    cout << "Ingrese la nota 1: ";
    cin >> nt1;

    cout << "Ingrese la nota 2: ";
    cin >> nt2;

    cout << "Ingrese la nota 3: ";
    cin >> nt3;

    promedio = (nt1 + nt2 + nt3) / 3;

    cout << "Su primera nota es: " << nt1 << endl;
    cout << "Su segunda nota es: " << nt2 << endl;
    cout << "Su tercera nota es: " << nt3 << endl;
    cout << "Su promedio es: " << promedio << endl;

    if (promedio >= 7) {
        cout << "Está aprobado" << endl;
    } else {
        cout << "Está reprobado" << endl;
    }

    return 0;
}