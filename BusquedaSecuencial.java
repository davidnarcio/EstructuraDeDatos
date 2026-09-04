import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int[] arreglo = {11, 21, 31, 41, 51, 61};
        Scanner sc = new Scanner(System.in);

        System.out.println("---Busqueda secuencial---");
        System.out.print("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.print("\nQue numero quiere buscar? ");
        int numeroBuscado = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                System.out.println("El numero esta en el lugar: " + (i + 1));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El numero no esta en el array");
        }
    }
}