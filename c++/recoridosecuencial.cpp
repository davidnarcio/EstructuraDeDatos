#include <iostream>
#include <stdlib.h>
using namespace std;
int main(){
    int array[6]={11,21,31,41,51,61};
    int num=sizeof(array)/sizeof(array[0]);
    cout<<"El array es: ";
    for(int i=0;i<num;i++)
    {
        cout<<array[i]<<" ";
    } 
    return 0;
}