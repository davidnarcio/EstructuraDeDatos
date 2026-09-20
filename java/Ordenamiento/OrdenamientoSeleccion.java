public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        int[] arreglo = {61, 21, 51, 11, 41, 31};

        System.out.println("---Ordenamiento por Seleccion---");
        System.out.print("El arreglo original es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[menor]) {
                    menor = j;
                }
            }
            int temp = arreglo[i];
            arreglo[i] = arreglo[menor];
            arreglo[menor] = temp;
        }

        System.out.print("\nEl arreglo ordenado es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}