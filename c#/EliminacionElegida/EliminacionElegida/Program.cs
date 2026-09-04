using System;

class EliminacionElegida
{
    static void Main()
    {
        int[] arreglo = { 11, 21, 31, 41, 51, 61 };
        int[] nuevoArreglo = new int[arreglo.Length - 1];

        Console.WriteLine("---Eliminacion a eleccion---");
        Console.Write("El arreglo es: ");
        for (int i = 0; i < arreglo.Length; i++)
        {
            Console.Write(arreglo[i] + " ");
        }

        Console.Write("\nEscribe la posicion del elemento a eliminar (0 a " + (arreglo.Length - 1) + "): ");
        int posicion = int.Parse(Console.ReadLine());

        for (int i = 0; i < posicion; i++)
        {
            nuevoArreglo[i] = arreglo[i];
        }
        for (int i = posicion; i < arreglo.Length - 1; i++)
        {
            nuevoArreglo[i] = arreglo[i + 1];
        }

        Console.Write("El nuevo arreglo es: ");
        for (int i = 0; i < nuevoArreglo.Length; i++)
        {
            Console.Write(nuevoArreglo[i] + " ");
        }
    }
}