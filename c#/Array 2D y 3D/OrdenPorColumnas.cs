using System;

class OrdenPorColumnas {
    static void Main() {
        int[,] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Console.WriteLine("---Recorrido por columnas---");
        for (int j = 0; j < 3; j++) {
            Console.Write("Columna " + j + ": ");
            for (int i = 0; i < 3; i++) {
                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine();
        }
    }
}