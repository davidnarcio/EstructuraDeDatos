public class OrdenamientoQuicksort {
    static void quicksort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = arreglo[fin];
            int i = inicio - 1;
            for (int j = inicio; j < fin; j++) {
                if (arreglo[j] <= pivote) {
                    i = i + 1;
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
            int temp2 = arreglo[i + 1];
            arreglo[i + 1] = arreglo[fin];
            arreglo[fin] = temp2;

            int posicionPivote = i + 1;
            quicksort(arreglo, inicio, posicionPivote - 1);
            quicksort(arreglo, posicionPivote + 1, fin);
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {61, 21, 51, 11, 41, 31};

        System.out.println("---Ordenamiento Quicksort---");
        System.out.print("El arreglo original es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        quicksort(arreglo, 0, arreglo.length - 1);

        System.out.print("\nEl arreglo ordenado es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}