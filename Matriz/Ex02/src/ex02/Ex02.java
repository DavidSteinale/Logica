package ex02;

import java.util.Random;

public class Ex02 {

    public static void main(String[] args) {

        int tamanho = 5;

        int[][] matriz = new int[tamanho][tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (x == y) {
                    matriz[x][y] = 1;
                } else {
                    matriz[x][y] = 0;
                }
            }
        }
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
    }
}
