#include <iostream>
using namespace std;
int main(){
    int arreglo[10]={1,2,3,4,5,6,7,8,9,10};
    int num=sizeof(arreglo)/sizeof(arreglo[0]);
    int numero_buscado;

    cout<<"Busqueda binaria\n";
    cout<<"Que numero quiere buscar? ";
    cin>>numero_buscado;

    int inicio=0;
    int final=num-1;
    bool encontrado=false;

    while(inicio<=final){
        int medio=(inicio+final)/2;

        if(arreglo[medio]==numero_buscado){
            cout<<"El numero esta en el lugar: "<<medio+1<<endl;
            encontrado=true;
            break;
        }
        else if(numero_buscado<arreglo[medio]){
            final=medio-1;
        }
        else{
            inicio=medio+1;
        }
    }

    if(!encontrado){
        cout<<"El numero no esta en el array"<<endl;
    }

    return 0;
}