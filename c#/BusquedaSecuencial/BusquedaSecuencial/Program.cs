using System;

class BusquedaSecuencial
{
    static void Main()
    {
        int[] arreglo = { 11, 21, 31, 41, 51, 61 };

        Console.WriteLine("---Busqueda secuencial---");
        Console.Write("El arreglo es: ");
        for (int i = 0; i < arreglo.Length; i++)
        {
            Console.Write(arreglo[i] + " ");
        }

        Console.Write("\nQue numero quiere buscar? ");
        int numeroBuscado = int.Parse(Console.ReadLine());

        for (int i = 0; i < arreglo.Length; i++)
        {
            if (arreglo[i] == numeroBuscado)
            {
                Console.WriteLine("El numero esta en el lugar: " + (i + 1));
                return;
            }
        }

        Console.WriteLine("El numero no esta en el array");
    }
}