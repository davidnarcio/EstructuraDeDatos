using System;

class OrdenamientoBubble {
    static void Main() {
        int[] arreglo = {61, 21, 51, 11, 41, 31};

        Console.WriteLine("---Ordenamiento Bubble---");
        Console.Write("El arreglo original es: ");
        for (int i = 0; i < arreglo.Length; i++) {
            Console.Write(arreglo[i] + " ");
        }

        for (int i = 0; i < arreglo.Length - 1; i++) {
            for (int j = 0; j < arreglo.Length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        Console.Write("\nEl arreglo ordenado es: ");
        for (int i = 0; i < arreglo.Length; i++) {
            Console.Write(arreglo[i] + " ");
        }
    }
}