using System;

class InsercionInicio
{
    static void Main()
    {
        int[] arreglo = { 11, 21, 31, 41, 51, 61 };
        int[] nuevoArreglo = new int[arreglo.Length + 1];

        Console.WriteLine("---Insercion al inicio---");
        Console.Write("El arreglo es: ");
        for (int i = 0; i < arreglo.Length; i++)
        {
            Console.Write(arreglo[i] + " ");
        }

        Console.Write("\nQue numero vas a agregar? ");
        int numInsertar = int.Parse(Console.ReadLine());

        nuevoArreglo[0] = numInsertar;
        for (int i = 0; i < arreglo.Length; i++)
        {
            nuevoArreglo[i + 1] = arreglo[i];
        }

        Console.Write("El nuevo arreglo es: ");
        for (int i = 0; i < nuevoArreglo.Length; i++)
        {
            Console.Write(nuevoArreglo[i] + " ");
        }
    }
}
