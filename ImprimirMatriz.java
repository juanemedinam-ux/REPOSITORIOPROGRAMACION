package co.edu.uniquindio.edu.poo.tareaMatriz;

public class ImprimirMatriz {
    //1.imprimir una matriz
    public static void main(String[] args) {
        int[][] matrizCreada = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        imprimirMatriz(matrizCreada);
    }

    public static void imprimirMatriz(int[][] matrizCreada) {
        for (int i = 0; i < matrizCreada.length; i++) {
            for (int j = 0; j < matrizCreada[i].length; j++) {
                System.out.print(matrizCreada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
