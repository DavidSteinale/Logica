package ex20;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Random random = new Random();

        int linha = 3;
        int coluna = 6;
        int tamanho = 18;

        int impar = 0;
        int somaSl = 0;
        int somaQl = 0;
        int soma = 0;
        int somaC1 = 0;
        int somaC2 = 0;

        int[][] matriz = new int[linha][coluna];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = random.nextInt(100);
            }
        }

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if ((matriz[x][y] % 2) == 1) {
                    impar += matriz[x][y];
                }
            }
            somaSl += matriz[x][1];
            somaQl += matriz[x][3];
        }
        int media = ((somaSl + somaQl) / (linha * 2));

        System.out.println("--- MATRIZ ORIGINAL ---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.printf(" %5d ", matriz[x][y]);
            }
            System.out.println();
        }

        for (int x = 0; x < matriz.length; x++) {
            somaC1 += matriz[x][1];
            somaC2 += matriz[x][2];
        }

        for (int x = 0; x < matriz.length; x++) {
            matriz[x][5] = somaC1 + somaC2;

        }

        System.out.println();
        System.out.println("----------");
        System.out.println();
        System.out.println("(A)Soma dos Números Ímpares: " + impar);
        System.out.println("(B)Média Aritmética dos elementos da SEGUNDA E QUARTA coluna: " + media);
        System.out.println();
        System.out.println("--- MATRIZ MODIFICADA ---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.printf(" %5d ", matriz[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
