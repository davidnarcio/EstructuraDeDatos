public class recorridosecuencial {
    public static void main(String[] args) {
        int[] arreglo = {11, 21, 31, 41, 51, 61};

        System.out.println("---Recorrido secuencial---");
        System.out.print("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
