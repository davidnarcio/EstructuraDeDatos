#include <iostream>
using namespace std;

int main(){
    int arreglo[6] = {61, 21, 51, 11, 41, 31};
    int num = sizeof(arreglo) / sizeof(arreglo[0]);

    cout << "---Ordenamiento Bubble---" << endl;
    cout << "El arreglo original es: ";
    for(int i=0; i<num; i++){
        cout << arreglo[i] << " ";
    }

    for(int i=0; i<num-1; i++){
        for(int j=0; j<num-1-i; j++){
            if(arreglo[j] > arreglo[j+1]){
                int temp = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = temp;
            }
        }
    }

    cout << "\nEl arreglo ordenado es: ";
    for(int i=0; i<num; i++){
        cout << arreglo[i] << " ";
    }

    return 0;
}