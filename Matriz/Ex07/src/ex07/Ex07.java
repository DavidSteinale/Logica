package ex07;

import static java.lang.Math.pow;

public class Ex07 {

    public static void main(String[] args) {

        int tamanho = 10;

        double[][] matriz = new double[tamanho][tamanho];

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (x < y) {
                    matriz[x][y] = (2 * x) + (7 * y) - 2;
                }
                if (x == y) {
                    matriz[x][y] = ((3 * Math.pow(x, 2)) - 1);
                }
                if (x > y) {
                    matriz[x][y] = ((4 * Math.pow(x, 3)) - (5 * Math.pow(y, 2)));
                }
            }
        }
        System.out.println("--- MATRIZ ---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print( matriz[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
