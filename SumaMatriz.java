package co.edu.uniquindio.edu.poo.tareaMatriz;

public class SumaMatriz {

    public static void main(String[] args) {

        //crear una matriz e inicializarla
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("La suma es: " + sumarMatriz(matriz));
    }

    public static int sumarMatriz(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];
            }
        }

        return suma;
    }
}