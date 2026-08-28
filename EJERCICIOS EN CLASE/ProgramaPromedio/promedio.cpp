#include <iostream>
using namespace std;
int main(){
    float nt1, nt2, nt3, promedio;

    cout << "Ingrese la nota 1: ";
    cin >> nt1;

    cout << "Ingrese la nota 2: ";
    cin >> nt2;

    cout << "Ingrese la nota 3: ";
    cin >> nt3;

    promedio = (nt1 + nt2 + nt3) / 3;
    cout << "Su promedio es: " << promedio << endl;
    return 0;
}