package ex06;

import java.util.Random;

public class Ex06 {

    public static void main(String[] args) {
        Random random = new Random();

        int tamanho = 3;
        int maiorA = 0;
        int maiorB = 0;

        int[][] matrizA = new int[tamanho][tamanho];
        int[][] matrizB = new int[tamanho][tamanho];
        int[][] matriz = new int[tamanho][tamanho];

        int[] vetor = new int[tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                matrizA[x][y] = random.nextInt(1000);
                matrizB[x][y] = random.nextInt(1000);
            }
        }

        System.out.println("--- Números Sortiados MATRIZ A ---");
        System.out.println();
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                System.out.print(matrizA[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--- Números Sortiados MATRIZ B ---");
        System.out.println();
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                System.out.print(matrizB[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

//*****************************************************************************
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matrizA[x][y] > matrizB[x][y]) {
                    matriz[x][y] = matrizA[x][y];
                } else {
                    matriz[x][y] = matrizB[x][y];
                }
            }
        }

        System.out.println("--- Números da Terceira MATRIZ 3---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
