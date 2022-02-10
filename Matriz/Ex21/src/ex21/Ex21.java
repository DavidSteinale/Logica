package ex21;

import java.util.Random;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int op = 1;
        int coluna = 2;
        int linha = 2;

        boolean statusA = false;
        boolean statusB = false;
        boolean statusC = false;

        float[][] matrizA = new float[linha][coluna];
        float[][] matrizB = new float[linha][coluna];
        float[][] matrizC = new float[linha][coluna];
        float[][] matrizD = new float[linha][coluna];

        //INSERE VALOR NA MATRIZ A
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                matrizA[x][y] = random.nextFloat(50);
            }
        }

        //INSERE VALOR NA MATRIZ B
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                matrizB[x][y] = random.nextFloat(50);
            }
        }
        System.out.println("---MATRIZ A---");
        System.out.println();
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                System.out.printf(" %.2f ", matrizA[x][y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---MATRIZ B---");
        System.out.println();
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                System.out.printf(" %.2f ", matrizB[x][y]);
            }
            System.out.println();
        }
        System.out.println();
        do {
            System.out.println("----MENU----");
            System.out.println("1 - Somar as duas matrizes.");
            System.out.println("2 - Subtrair a primeira matriz da segunda.");
            System.out.println("3 - Adicionar uma constante Às DUAS matrizes.");
            System.out.println("4 - Imprimir as matrizes.");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:

                    for (int x = 0; x < matrizB.length; x++) {
                        for (int y = 0; y < matrizB[x].length; y++) {
                            matrizC[x][y] = (matrizA[x][y] + matrizB[x][y]);
                        }
                    }
                    statusA = true;
                    break;
                case 2:

                    for (int x = 0; x < matrizB.length; x++) {
                        for (int y = 0; y < matrizB[x].length; y++) {
                            matrizD[x][y] = (matrizA[x][y] - matrizB[x][y]);
                        }
                    }
                    statusB = true;
                    break;
                case 3:
                    System.out.println("Informe uma linha e coluna que deseja adcionar um valor na MATRIZ A:");
                    System.out.print("Linha: ");
                    int l = scanner.nextInt();
                    System.out.print("Coluna: ");
                    int c = scanner.nextInt();
                    System.out.print("Valor: ");
                    float valor = scanner.nextFloat();
                    System.out.println("----------");
                    System.out.println("Informe uma linha e coluna que deseja adcionar um valor na MATRIZ B:");
                    System.out.print("Linha: ");
                    int lB = scanner.nextInt();
                    System.out.print("Coluna: ");
                    int cB = scanner.nextInt();
                    System.out.print("Valor: ");
                    float valorB = scanner.nextFloat();

                    matrizA[l][c] = valor;
                    matrizB[lB][cB] = valorB;

                    statusC = true;

                    break;
                case 4:

                    if (statusA) {
                        System.out.println();
                        System.out.println("---SOMA DAS MATRIZES---");
                        System.out.println();
                        for (int x = 0; x < matrizC.length; x++) {
                            for (int y = 0; y < matrizC[x].length; y++) {
                                System.out.printf(" %.2f ", matrizC[x][y]);
                            }
                            System.out.println("");
                        }
                    }
                    if (statusB) {
                        System.out.println();
                        System.out.println("---SUBTRAÇÃO DA MATRIZ A COM A MATRIZ B---");
                        System.out.println();
                        for (int x = 0; x < matrizD.length; x++) {
                            for (int y = 0; y < matrizD[x].length; y++) {
                                System.out.printf(" %.2f ", matrizD[x][y]);
                            }
                            System.out.println("");
                        }
                        System.out.println();
                    }
                    if (statusC) {
                        System.out.println("---MATRIZ A COM ELEMENTO ADICIONADO---");
                        System.out.println();
                        for (int x = 0; x < matrizA.length; x++) {
                            for (int y = 0; y < matrizA[x].length; y++) {
                                System.out.printf(" %.2f ", matrizA[x][y]);
                            }
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("---MATRIZ B COM ELEMENTO ADICIONADO---");
                        System.out.println();
                        for (int x = 0; x < matrizB.length; x++) {
                            for (int y = 0; y < matrizB[x].length; y++) {
                                System.out.printf(" %.2f ", matrizB[x][y]);
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    break;
            }
            System.out.print("Deseja repetir o processo: 1 - SIM | 0 - NÃO?");
            op = scanner.nextInt();
        } while (op == 1);
    }
}
