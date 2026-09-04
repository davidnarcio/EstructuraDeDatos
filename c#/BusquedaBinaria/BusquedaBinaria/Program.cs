using System;

class BusquedaBinaria
{
    static void Main()
    {
        int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Console.WriteLine("---Busqueda binaria---");
        Console.Write("El arreglo es: ");
        for (int i = 0; i < arreglo.Length; i++)
        {
            Console.Write(arreglo[i] + " ");
        }

        Console.Write("\nQue numero quiere buscar? ");
        int numeroBuscado = int.Parse(Console.ReadLine());

        int inicio = 0;
        int fin = arreglo.Length - 1;

        while (inicio <= fin)
        {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == numeroBuscado)
            {
                Console.WriteLine("El numero esta en el lugar: " + (medio + 1));
                return;
            }
            else if (numeroBuscado < arreglo[medio])
            {
                fin = medio - 1;
            }
            else
            {
                inicio = medio + 1;
            }
        }

        Console.WriteLine("El numero no esta en el array");
    }
}