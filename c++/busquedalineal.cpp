#include <iostream>
using namespace std;
int main(){
    int array[6]={11,21,31,41,51,61};
    int num=sizeof(array)/sizeof(array[0]);
    int numbuscar;

    cout<<"---Busqueda secuencial---\n";
    cout<<"El array es: ";
    for(int i=0;i<num;i++)
    {
        cout<<array[i]<<" ";
    }

    cout<<"\nEscribe el numero a buscar: ";
    cin>>numbuscar;

    int i;
    for(i=0; i<num; i++){
        if(array[i]==numbuscar){
            cout<<"El numero esta en el lugar: "<<i+1<<endl;
            break;
        }
    }

    if(i==num){
        cout<<"El numero no esta en el array"<<endl;
    }

    return 0;
}