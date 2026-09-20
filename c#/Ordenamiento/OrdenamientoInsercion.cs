using System;

class OrdenamientoInsercion {
    static void Main() {
        int[] arreglo = {61, 21, 51, 11, 41, 31};

        Console.WriteLine("---Ordenamiento por Insercion---");
        Console.Write("El arreglo original es: ");
        for (int i = 0; i < arreglo.Length; i++) {
            Console.Write(arreglo[i] + " ");
        }

        for (int i = 1; i < arreglo.Length; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > actual) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = actual;
        }

        Console.Write("\nEl arreglo ordenado es: ");
        for (int i = 0; i < arreglo.Length; i++) {
            Console.Write(arreglo[i] + " ");
        }
    }
}