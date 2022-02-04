package ex05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 2;
        int linha = 0;
        int coluna = 0;
        float pesq = 0f;
        boolean encontrado = false;

        float[][] matriz = new float[tamanho][tamanho];

        //VINCULA OS VALORES DENTRO DA MATRIZ
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                System.out.print("Infome um valor para posição na linha " + (x + 1) + " e coluna " + (y + 1) + " :");
                matriz[x][y] = scanner.nextFloat();
                scanner.nextLine();
            }
        }

        //MOSTRA OS DADOS DA MATRIZ
        System.out.println();
        System.out.println("--- Números Informados ---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------");
        System.out.print("Digite um valor contido na matriz para saber a posição: "); // PERGUNDA PARA O OPERADOR DIGITAR UM VALOR PARA PESQUISA AN MATRIZ
        pesq = scanner.nextFloat();
        scanner.nextLine();

        // PESQUISA DENTRO DA MATRIZ O VALOR DIGITADO
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (matriz[x][y] == pesq) {
                    linha = x;
                    coluna = y;
                    encontrado = true;
                }
            }
        }
        if (encontrado){
            System.out.println();
            System.out.println("Número encontado na posição linha " + (linha + 1) + " e coluna " + (coluna + 1) + ".");
            System.out.println();
        } else{
            System.out.println();
            System.out.println("****Número digitado não encontrado****");
            System.out.println();
        }
    }
}
