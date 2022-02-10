package ex23;

import java.util.Random;

public class EX23 {

    public static void main(String[] args) {
        Random random = new Random();

        int linha = 3;
        int coluna = 3;

        int[][] matrizA = new int[linha][coluna];
        double[][] matrizB = new double[linha][coluna];

        //INSERE NA MATRIZ A OS VALORES SOTEADOS
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                matrizA[x][y] = random.nextInt(100);
            }
        }
        //INSERE NA MATRIZ B O RESULTADO DE A²
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                matrizB[x][y] = Math.pow(matrizA[x][y], 2);
            }
        }
        System.out.println();
        System.out.println("--- MATRIZ A ---");
        System.out.println();
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                System.out.printf(" %5d ", matrizA[x][y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--- MATRIZ B COM O RESULTADO DE (A²) ---");
        System.out.println();
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                System.out.printf(" %5d ", (int) matrizB[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
