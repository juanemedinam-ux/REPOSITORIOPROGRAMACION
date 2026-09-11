package co.edu.uniquindio.edu.poo.tareaMatriz;

public class NumerosDiagonal {
           public static void main(String[] args) {

            //crear una matriz e inicializarla
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            System.out.println("La suma de la diagonal es: " + sumarDiagonal(matriz));
        }

        public static int sumarDiagonal(int[][] matriz) {

            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {
                suma = suma + matriz[i][i];
            }

            return suma;
        }
    }

