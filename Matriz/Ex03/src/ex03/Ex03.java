package ex03;

import java.util.Random;

public class Ex03 {

    public static void main(String[] args) {

        Random random = new Random();

        int tamanho = 4;

        int[][] matriz = new int[tamanho][tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                matriz[x][y] = x*y;
            }
        }
        
        System.out.println("--- Números Sortiados ---");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();

        }
    }
}
