#include <iostream>
using namespace std;

int main(){
    int arreglo[6] = {61, 21, 51, 11, 41, 31};
    int num = sizeof(arreglo) / sizeof(arreglo[0]);

    cout << "---Ordenamiento por Insercion---" << endl;
    cout << "El arreglo original es: ";
    for(int i=0; i<num; i++){
        cout << arreglo[i] << " ";
    }

    for(int i=1; i<num; i++){
        int actual = arreglo[i];
        int j = i - 1;
        while(j >= 0 && arreglo[j] > actual){
            arreglo[j+1] = arreglo[j];
            j = j - 1;
        }
        arreglo[j+1] = actual;
    }

    cout << "\nEl arreglo ordenado es: ";
    for(int i=0; i<num; i++){
        cout << arreglo[i] << " ";
    }

    return 0;
}