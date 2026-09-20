using System;

class OrdenamientoQuicksort {
    static void Quicksort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = arreglo[fin];
            int i = inicio - 1;
            for (int j = inicio; j < fin; j++) {
                if (arreglo[j] <= pivote) {
                    i = i + 1;
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
            int temp2 = arreglo[i + 1];
            arreglo[i + 1] = arreglo[fin];
            arreglo[fin] = temp2;

            int posicionPivote = i + 1;
            Quicksort(arreglo, inicio, posicionPivote - 1);
            Quicksort(arreglo, posicionPivote + 1, fin);
        }
    }

    static void Main() {
        int[] arreglo = {61, 21, 51, 11, 41, 31};

        Console.WriteLine("---Ordenamiento Quicksort---");
        Console.Write("El arreglo original es: ");
        for (int i = 0; i < arreglo.Length; i++) {
            Console.Write(arreglo[i] + " ");
        }

        Quicksort(arreglo, 0, arreglo.Length - 1);

        Console.Write("\nEl arreglo ordenado es: ");
        for (int i = 0; i < arreglo.Length; i++) {
            Console.Write(arreglo[i] + " ");
        }
    }
}