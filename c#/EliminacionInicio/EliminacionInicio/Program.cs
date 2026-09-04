using System;

class EliminacionInicio
{
    static void Main()
    {
        int[] arreglo = { 11, 21, 31, 41, 51, 61 };
        int[] nuevoArreglo = new int[arreglo.Length - 1];

        Console.WriteLine("---Eliminacion al inicio---");
        Console.Write("El arreglo es: ");
        for (int i = 0; i < arreglo.Length; i++)
        {
            Console.Write(arreglo[i] + " ");
        }

        for (int i = 1; i < arreglo.Length; i++)
        {
            nuevoArreglo[i - 1] = arreglo[i];
        }

        Console.Write("\nEl nuevo arreglo es: ");
        for (int i = 0; i < nuevoArreglo.Length; i++)
        {
            Console.Write(nuevoArreglo[i] + " ");
        }
    }
}