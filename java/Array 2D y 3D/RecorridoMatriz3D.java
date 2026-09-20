public class RecorridoMatriz3D {
    public static void main(String[] args) {
        int[][][] matriz3d = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        System.out.println("---Recorrido de matriz 3D---");
        for (int i = 0; i < matriz3d.length; i++) {
            System.out.println("Capa " + i + ":");
            for (int j = 0; j < matriz3d[i].length; j++) {
                for (int k = 0; k < matriz3d[i][j].length; k++) {
                    System.out.print(matriz3d[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}