import java.util.Scanner;

public class InsercionFinal {
    public static void main(String[] args) {
        int[] arreglo = {11, 21, 31, 41, 51, 61};
        int[] nuevoArreglo = new int[arreglo.length + 1];
        Scanner sc = new Scanner(System.in);

        System.out.println("---Insercion al final---");
        System.out.print("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.print("\nQue numero vas a agregar? ");
        int numInsertar = sc.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i];
        }
        nuevoArreglo[arreglo.length] = numInsertar;

        System.out.print("El nuevo arreglo es: ");
        for (int i = 0; i < nuevoArreglo.length; i++) {
            System.out.print(nuevoArreglo[i] + " ");
        }
    }
}