#include <iostream>
#include <stdlib.h>
using namespace std;
int main(){
    int array[6]={11,21,31,41,51,61};
    int num=sizeof(array)/sizeof(array[0]);
    cout<<"El array es: ";
    for(int i=num-1;i>=0;i--)
    {
        cout<<array[i]<<" ";
    } 
    return 0;
}