public class EliminacionInicio {
    public static void main(String[] args) {
        int[] arreglo = {11, 21, 31, 41, 51, 61};
        int[] nuevoArreglo = new int[arreglo.length - 1];

        System.out.println("---Eliminacion al inicio---");
        System.out.print("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        for (int i = 1; i < arreglo.length; i++) {
            nuevoArreglo[i - 1] = arreglo[i];
        }

        System.out.print("\nEl nuevo arreglo es: ");
        for (int i = 0; i < nuevoArreglo.length; i++) {
            System.out.print(nuevoArreglo[i] + " ");
        }
    }
}