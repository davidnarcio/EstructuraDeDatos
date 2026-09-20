using System;

class OrdenamientoSeleccion {
    static void Main() {
        int[] arreglo = {61, 21, 51, 11, 41, 31};

        Console.WriteLine("---Ordenamiento por Seleccion---");
        Console.Write("El arreglo original es: ");
        for (int i = 0; i < arreglo.Length; i++) {
            Console.Write(arreglo[i] + " ");
        }

        for (int i = 0; i < arreglo.Length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < arreglo.Length; j++) {
                if (arreglo[j] < arreglo[menor]) {
                    menor = j;
                }
            }
            int temp = arreglo[i];
            arreglo[i] = arreglo[menor];
            arreglo[menor] = temp;
        }

        Console.Write("\nEl arreglo ordenado es: ");
        for (int i = 0; i < arreglo.Length; i++) {
            Console.Write(arreglo[i] + " ");
        }
    }
}