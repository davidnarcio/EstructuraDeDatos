using System;

class RecorridoMatriz3D {
    static void Main() {
        int[,,] matriz3d = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        Console.WriteLine("---Recorrido de matriz 3D---");
        for (int i = 0; i < 2; i++) {
            Console.WriteLine("Capa " + i + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    Console.Write(matriz3d[i, j, k] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}