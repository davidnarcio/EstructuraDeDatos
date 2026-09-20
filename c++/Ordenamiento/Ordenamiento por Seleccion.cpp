#include <iostream>
using namespace std;

int main(){
    int arreglo[6] = {61, 21, 51, 11, 41, 31};
    int num = sizeof(arreglo) / sizeof(arreglo[0]);

    cout << "---Ordenamiento por Seleccion---" << endl;
    cout << "El arreglo original es: ";
    for(int i=0; i<num; i++){
        cout << arreglo[i] << " ";
    }

    for(int i=0; i<num-1; i++){
        int menor = i;
        for(int j=i+1; j<num; j++){
            if(arreglo[j] < arreglo[menor]){
                menor = j;
            }
        }
        int temp = arreglo[i];
        arreglo[i] = arreglo[menor];
        arreglo[menor] = temp;
    }

    cout << "\nEl arreglo ordenado es: ";
    for(int i=0; i<num; i++){
        cout << arreglo[i] << " ";
    }

    return 0;
}