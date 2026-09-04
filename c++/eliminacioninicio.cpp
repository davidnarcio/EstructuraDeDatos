#include <iostream>
#include <stdlib.h>
using namespace std;
int main(){
    int array[6]={11,21,31,41,51,61};
    int nuevoarray[5];
    int num=sizeof(array)/sizeof(array[0]);
    int ins;
    cout<<"---Eliminacion al eleccion---\n";
    cout<<"El array es: ";
    for(int i=0;i<num;i++)
    {
        cout<<array[i]<<" ";
    } 
    
    for(int i=0; i<num;i++){
        nuevoarray[i]=array[i+1];
    }
    cout<<"\nEl nuevo array es: ";
    for(int i=0;i<num-1;i++)
    {
        cout<<nuevoarray[i]<<" ";
    }
    return 0;
}