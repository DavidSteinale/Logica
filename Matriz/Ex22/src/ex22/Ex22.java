package ex22;

import java.util.Random;

public class Ex22 {

    public static void main(String[] args) {
        Random random = new Random();

        int linha = 3;
        int coluna = 3;

        int[][] matrizA = new int[linha][coluna];
        int[][] matrizB = new int[linha][coluna];
        int[][] matrizC = new int[linha][coluna];

        //INSERE NA MATRIZ A OS VALORES SOTEADOS
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                matrizA[x][y] = random.nextInt(100);
            }
        }

        //INSERE NA MATRIZ B OS VALORES SOTEADOS
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                matrizB[x][y] = random.nextInt(100);
            }
        }

        // INSERE NA MATRIZ C a MULTIPLICAÇÂO DA MATRIZ A E B
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                matrizC[x][y] = matrizA[x][y] * matrizB[x][y];
            }
        }

        System.out.println("--- MATRIZ A ---");
        System.out.println();
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                System.out.printf(" %5d ", matrizA[x][y]);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("--- MATRIZ B ---");
        System.out.println();
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                System.out.printf(" %5d ", matrizB[x][y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("");
        System.out.println("--- MATRIZ C COM O RESULTADO A MULTIPLICAÇÃO(A*B) ---");
        System.out.println();
        for (int x = 0; x < matrizC.length; x++) {
            for (int y = 0; y < matrizC[x].length; y++) {
                System.out.printf(" %5d ", matrizC[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
