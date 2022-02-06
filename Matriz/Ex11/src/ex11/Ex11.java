package ex11;

import java.util.Random;

public class Ex11 {

    public static void main(String[] args) {
        Random random = new Random();

        int tamanho = 3;
        int soma = 0;

        int[][] matriz = new int[tamanho][tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                matriz[x][y] = random.nextInt(100);
            }
        }
        System.out.println("--- MATRIZ ---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if ((x + y) == tamanho - 1) { // diagonal secundaria
                    soma += matriz[x][y];
                }
            }
        }
        System.out.println();
        System.out.println("Soma dos elementos que estão na Ds: " + soma);
        System.out.println();
    }

}
