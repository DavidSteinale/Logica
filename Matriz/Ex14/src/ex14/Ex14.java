package ex14;

import java.util.Random;

public class Ex14 {

    public static void main(String[] args) {
        Random random = new Random();

        int tamanho = 10;

        int[][] matriz = new int[tamanho][tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                int numero = random.nextInt(50);

                if (matriz[x][y] != numero) {
                    matriz[x][y] = numero;
                }
            }
        }
        System.out.println("--- Números Sortiados ---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
