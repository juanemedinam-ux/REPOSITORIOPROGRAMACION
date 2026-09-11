package co.edu.uniquindio.edu.poo.tareaMatriz;

public class Espiral {
    public static void main(String[] args) {


        int n = 5;
        int[][] matriz = new int[n][n];

        espiral(matriz);

        imprimirMatriz(matriz);
    }

    public static void espiral(int[][] matriz) {

        int n = matriz.length;

        int a = 0;
        int b = n - 1;
        int valor = 1;

        for (int j = 0; j < matriz.length / 2; j++) {

            for (int i = a; i <= b; i++) {
                matriz[a][i] = valor;
                valor++;
            }


            for (int i = a + 1; i <= b; i++) {
                matriz[i][b] = valor;
                valor++;
            }


            for (int i = b - 1; i >= a; i--) {
                matriz[b][i] = valor;
                valor++;
            }

            for (int i = b - 1; i > a; i--) {
                matriz[i][a] = valor;
                valor++;
            }


            a++;
            b--;
        }


        if (n % 2 != 0) {
            matriz[n / 2][n / 2] = valor;
        }
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }
}

