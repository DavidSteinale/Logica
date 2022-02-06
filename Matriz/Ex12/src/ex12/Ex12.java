package ex12;

import java.util.Random;

public class Ex12 {

    public static void main(String[] args) {
        Random random = new Random();

        int tamanhoA = 5;

        int[][] matrizA = new int[tamanhoA][tamanhoA];

        //MATRIZ PRINCIPAL
        for (int x = 0; x < tamanhoA; x++) {
            for (int y = 0; y < tamanhoA; y++) {
                matrizA[x][y] = random.nextInt(100);
            }
        }
        //CRIAÇÃO DA MATRIZ TRANSPOSTA

        int linhas = matrizA.length; // linhas da matriz original
        int colunas = matrizA[0].length; // colunas da matriz original

        int[][] matrizB = new int[colunas][linhas];

        //MATRIZ TRANSPOSTA
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                matrizB[y][x] = matrizA[x][y];
            }
        }
        //MOSTRA MATRIZ PRINCIPAL
        System.out.println("--- MATRIZ PRINCIPAL---");
        System.out.println();
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                System.out.print(matrizA[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //MOSTRA MATRZ TRANSPOSTA
        System.out.println("--- MATRIZ TRANSPOSTA---");
        System.out.println();
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                System.out.print(matrizB[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

}
