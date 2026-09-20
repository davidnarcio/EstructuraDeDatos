public class OrdenamientoInsercion {
    public static void main(String[] args) {
        int[] arreglo = {61, 21, 51, 11, 41, 31};

        System.out.println("---Ordenamiento por Insercion---");
        System.out.print("El arreglo original es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > actual) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = actual;
        }

        System.out.print("\nEl arreglo ordenado es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}