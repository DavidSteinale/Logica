package ex17;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coluna = 3; //NOTAS
        int linha = 3; // ALUNOS
        int piorNotaProvaUm = 0;
        int piorNotaProvaDois = 0;
        int piorNotaProvaTres = 0;

        char[][] resposta = new char[linha][coluna];
        int[] piorNota = new int[coluna];
        char[] gabarito = {'a', 'b', 'c'};

        System.out.println("Informe o gabarito da prova(a,b,c,d,e):");
        for (int x = 0; x < gabarito.length; x++) {
            String g = scanner.nextLine();
            gabarito[x] = g.charAt(0);
        }
        System.out.println("----------");
        //MATRIZ PARA RECEBER AS NOTAS
        System.out.println("Informe às respostas:");
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print("Resposta da questão número " + (y + 1) + " do aluno " + (x + 1) + " : ");
                String l = scanner.nextLine();
                resposta[x][y] = l.charAt(0);
            }
            System.out.println("----------");
        }
        System.out.println();

        // SOMA OS VALORES CONTIDO NAS COLUNAS E VINCULA NO ARRAY
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
                if (resposta[y][x] == 'a') {
                } else {
                    piorNotaProvaUm++;
                }
                if (resposta[y][x] == 'b') {
                } else {
                    piorNotaProvaDois++;
                }
                if (resposta[y][x] == 'c') {
                } else {
                    piorNotaProvaTres++;
                }
            }
            piorNota[x] = piorNotaProvaUm;
            piorNotaProvaUm=0;
        }

        // MOSTRA O ARRAY
        System.out.println();
        System.out.println("---Array com a soma dos valores por coluna---");
        System.out.println();
        for (int valor : piorNota) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("--- RESPOSTAS DO ALUNOS ---");
        System.out.println();
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print(resposta[x][y] + " ");
            }
            System.out.println();
        }
    }

}
