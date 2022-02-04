package ex01;

import java.util.Random;

public class Ex01 {

    public static void main(String[] args) {
        Random random = new Random();

        int tamanho = 4;
        int cont = 0;
        int[][] matriz = new int[tamanho][tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                matriz[x][y] = random.nextInt(100);
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
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (matriz[x][y] > 10) {
                    cont++;
                };
            }
        }
        System.out.println();
        System.out.println("Quantidade números maior que 10: " + cont);
        System.out.println();
    }
}
