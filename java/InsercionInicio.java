import java.util.Scanner;

public class InsercionInicio {
    public static void main(String[] args) {
        int[] arreglo = {11, 21, 31, 41, 51, 61};
        int[] nuevoArreglo = new int[arreglo.length + 1];
        Scanner sc = new Scanner(System.in);

        System.out.println("---Insercion al inicio---");
        System.out.print("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.print("\nQue numero vas a agregar? ");
        int numInsertar = sc.nextInt();

        nuevoArreglo[0] = numInsertar;
        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i + 1] = arreglo[i];
        }

        System.out.print("El nuevo arreglo es: ");
        for (int i = 0; i < nuevoArreglo.length; i++) {
            System.out.print(nuevoArreglo[i] + " ");
        }
    }
}