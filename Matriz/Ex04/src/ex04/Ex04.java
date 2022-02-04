package ex04;

import java.util.Random;

public class Ex04 {

    public static void main(String[] args) {
        Random random = new Random();

        int tamanho = 4;
        int cont = 0;
        int maior = 0;
        int linha=0;
        int coluna=0;
        int[][] matriz = new int[tamanho][tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                matriz[x][y] = random.nextInt(200);
                if (x == 0 && y == 0) {
                    maior = matriz[x][y];
                }
                if (matriz[x][y] > maior) {
                    maior = matriz[x][y];
                    linha=x;
                    coluna=y;                    
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
        System.out.println("Maior número sortiado é " + maior + " na linha " + (linha+1) + " e coluna "+ (coluna+1)+".");
        System.out.println();
    }

}
