package ex15;

import java.util.Random;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coluna = 10;
        int linha = 5;
        int soma = 0;

        char[][] resposta = new char[linha][coluna];
        char[] gabarito = {'a', 'b', 'c', 'd', 'b', 'b', 'c', 'c', 'a', 'd'};
        int[] resultado = new int[linha];

        //MATRIZ PARA RECEBER AS NOTAS
        System.out.println("Informe às respostas(a,b,c,d):");
        for (int x = 0; x < resposta.length; x++) {
            System.out.println("------");
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print("Resposta da questão número " + (y + 1) + " do aluno " + (x + 1) + " : ");
                String l = scanner.nextLine();
                resposta[x][y] = l.charAt(0);
            }
        }

        //MATRIZ PARA MOSTRAR AS NOTAS DIGITADAS
        System.out.println();
        System.out.println("--- RESPOSTAS DO ALUNOS ---");
        System.out.println();
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print(resposta[x][y] + " ");
            }
            System.out.println();
        }

        //MATRIZ PARA FAZER A CONPARAÇÃO DAS NOTAS DIGITADAS COM O GABARITO
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[0].length; y++) {
                if (resposta[x][y] == gabarito[y]) {
                    soma++;
                    resultado[x] = soma;
                }
            }
            soma = 0;
        }

        //MOSTRA O VETOR RESULTADO COM A PONTUAÇÃO DE CADA ALUNO.
        System.out.println();
        for (int x = 0; x < resultado.length; x++) {
            System.out.println("Pontuação do aluno " + (x + 1) + " é " + resultado[x] + ".");
        }
    }
}
