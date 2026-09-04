using System;

class RecorridoInverso
{
    static void Main()
    {
        int[] arreglo = { 11, 21, 31, 41, 51, 61 };

        Console.WriteLine("---Recorrido inverso---");
        Console.Write("El arreglo al reves es: ");
        for (int i = arreglo.Length - 1; i >= 0; i--)
        {
            Console.Write(arreglo[i] + " ");
        }
    }
}