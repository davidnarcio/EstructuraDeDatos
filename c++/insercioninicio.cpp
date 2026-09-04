#include <iostream>
#include <stdlib.h>
using namespace std;
int main(){
    int array[6]={11,21,31,41,51,61};
    int nuevoarray[7];
    int num=sizeof(array)/sizeof(array[0]);
    int ins;
    cout<<"---Insercion al inicio---\n";
    cout<<"El array es: ";
    for(int i=0;i<num;i++)
    {
        cout<<array[i]<<" ";
    } 
    cout<<"\nEscribe que numero vas a agregar: ";
    cin>>ins;
    nuevoarray[0]=ins;
    for(int i=0; i<num;i++){
        nuevoarray[i+1]=array[i];
    }
    cout<<"\nEl nuevo array es: ";
    for(int i=0;i<num+1;i++)
    {
        cout<<nuevoarray[i]<<" ";
    }
    return 0;
}