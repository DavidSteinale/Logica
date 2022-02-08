package ex18;

import java.util.Random;
import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 3;
        int soma = 0;
        int[][] matriz = new int[tamanho][tamanho];
        int[] numero = new int[tamanho];

        //INSERE O VALORES NA MATRIZ
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                System.out.print("Digite um valor inteiro para linha " + (x + 1) + " e coluna " + (y + 1) + " :");
                matriz[x][y] = scanner.nextInt();
            }
        }

        // MOSTRA OS VALORES DA MATRIZ
        System.out.println();
        System.out.println("--- MATRIZ ---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }

        // SOMA OS VALORES CONTIDO NAS COLUNAS E VINCULA NO ARRAY
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                soma += matriz[y][x];
            }
            numero[x] = soma;
            soma = 0;
        }

        // MOSTRA O ARRAY
        System.out.println();
        System.out.println("---Array com a soma dos valores por coluna---");
        System.out.println();
        for (int valor : numero) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println();
    }
}
