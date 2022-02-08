package ex14;

import java.util.Arrays;
import java.util.Random;

public class Ex14 {

    public static void main(String[] args) {
        Random random = new Random();

        int i = 0;
        int novoValor = 0;
        int tamanho = 5;
        boolean ok = false;
        int[][] matriz = new int[tamanho][tamanho];
        int[] numeros = new int[25];

        for (i = 0; i < numeros.length; i++) {
            novoValor = (random.nextInt(99));
            ok = false;
            for (int x = 0; x < i; x++) {
                if (numeros[x] == novoValor) {
                    ok = true;
                }
            }
            if (!ok) {
                numeros[i] = novoValor;
            } else {
                i++;
            }

            for (int x = 0; x < 5; x++) {
                for (int y = 0; y < 5; y++) {
                    matriz[x][y] = numeros[i];
                }

            }
        }

        for (int valor : numeros) {
            System.out.println("numeros" + valor);
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
        System.out.println();
    }
}
