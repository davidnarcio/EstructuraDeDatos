#include <iostream>
using namespace std;

int main(){
    int matriz3d[2][2][2] = {
        {{1, 2}, {3, 4}},
        {{5, 6}, {7, 8}}
    };

    cout << "---Recorrido de matriz 3D---" << endl;
    for(int i=0; i<2; i++){
        cout << "Capa " << i << ":" << endl;
        for(int j=0; j<2; j++){
            for(int k=0; k<2; k++){
                cout << matriz3d[i][j][k] << " ";
            }
            cout << endl;
        }
    }

    return 0;
}