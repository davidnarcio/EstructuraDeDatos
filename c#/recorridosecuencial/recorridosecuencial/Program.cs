using System;

class RecorridoSecuencial
{
    static void Main()
    {
        int[] arreglo = { 11, 21, 31, 41, 51, 61 };

        Console.WriteLine("---Recorrido secuencial---");
        Console.Write("El arreglo es: ");
        for (int i = 0; i < arreglo.Length; i++)
        {
            Console.Write(arreglo[i] + " ");
        }
    }
}