import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);

        System.out.println("---Busqueda binaria---");
        System.out.print("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.print("\nQue numero quiere buscar? ");
        int numeroBuscado = sc.nextInt();

        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == numeroBuscado) {
                System.out.println("El numero esta en el lugar: " + (medio + 1));
                return;
            } else if (numeroBuscado < arreglo[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        System.out.println("El numero no esta en el array");
    }
}