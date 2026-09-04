public class RecorridoInverso {
    public static void main(String[] args) {
        int[] arreglo = {11, 21, 31, 41, 51, 61};

        System.out.println("---Recorrido inverso---");
        System.out.print("El arreglo al reves es: ");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}