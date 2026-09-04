import java.util.Scanner;

public class EliminacionElegida {
    public static void main(String[] args) {
        int[] arreglo = {11, 21, 31, 41, 51, 61};
        int[] nuevoArreglo = new int[arreglo.length - 1];
        Scanner sc = new Scanner(System.in);

        System.out.println("---Eliminacion a eleccion---");
        System.out.print("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.print("\nEscribe la posicion del elemento a eliminar (0 a " + (arreglo.length - 1) + "): ");
        int posicion = sc.nextInt();

        for (int i = 0; i < posicion; i++) {
            nuevoArreglo[i] = arreglo[i];
        }
        for (int i = posicion; i < arreglo.length - 1; i++) {
            nuevoArreglo[i] = arreglo[i + 1];
        }

        System.out.print("El nuevo arreglo es: ");
        for (int i = 0; i < nuevoArreglo.length; i++) {
            System.out.print(nuevoArreglo[i] + " ");
        }
    }
}