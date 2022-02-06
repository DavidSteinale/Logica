package ex13;

import java.util.Random;

public class Ex13 {

    public static void main(String[] args) {
        Random random = new Random();

        int tamanho = 4;

        int[][] matrizA = new int[tamanho][tamanho];
        int[][] matrizB = new int[tamanho][tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                matrizA[x][y] = random.nextInt(20)+1;
            }
        }
        //MATRIZ TRIANGULO INFERIOR
        
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (x < y) {
                    matrizB[x][y] = 0;
                } else {
                    matrizB[x][y] = matrizA[x][y];
                }
            }
        }
        System.out.println("--- MATRIZ PRINCIPAL ---");
        System.out.println();
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                System.out.print(matrizA[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();        
        System.out.println("--- MATRIZ TRIANGULO INFERIOR ---");
        System.out.println();
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                System.out.print(matrizB[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
