#include <iostream>
using namespace std;

void quicksort(int arreglo[], int inicio, int fin){
    if(inicio < fin){
        int pivote = arreglo[fin];
        int i = inicio - 1;
        for(int j=inicio; j<fin; j++){
            if(arreglo[j] <= pivote){
                i = i + 1;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        int temp2 = arreglo[i+1];
        arreglo[i+1] = arreglo[fin];
        arreglo[fin] = temp2;

        int posicionPivote = i + 1;
        quicksort(arreglo, inicio, posicionPivote - 1);
        quicksort(arreglo, posicionPivote + 1, fin);
    }
}

int main(){
    int arreglo[6] = {61, 21, 51, 11, 41, 31};
    int num = sizeof(arreglo) / sizeof(arreglo[0]);

    cout << "---Ordenamiento Quicksort---" << endl;
    cout << "El arreglo original es: ";
    for(int i=0; i<num; i++){
        cout << arreglo[i] << " ";
    }

    quicksort(arreglo, 0, num-1);

    cout << "\nEl arreglo ordenado es: ";
    for(int i=0; i<num; i++){
        cout << arreglo[i] << " ";
    }

    return 0;
}