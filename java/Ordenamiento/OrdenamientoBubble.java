public class OrdenamientoBubble {
    public static void main(String[] args) {
        int[] arreglo = {61, 21, 51, 11, 41, 31};

        System.out.println("---Ordenamiento Bubble---");
        System.out.print("El arreglo original es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        System.out.print("\nEl arreglo ordenado es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}