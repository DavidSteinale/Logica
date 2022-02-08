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

        //MATRIZ PARA FAZER A CONPARAÇÃO DAS NOTAS DIGITADAS COM O GABARITO E CALCULA O PERCENTUAL DE APROVADOS
        for (int x = 0; x < resposta.length; x++) {
            for (int y = 0; y < resposta[0].length; y++) {
                if (resposta[y][x] == 'a') {
                   // resposta[0][0] != 'a'
                   // resposta[1][0] != 'a'
                   // resposta[2][0] != 'a'
                   
                   // resposta[0][1] != 'a'
                   // resposta[1][1] != 'a'
                   // resposta[2][1] != 'a'
                   
                    piorNotaProvaUm++;
                    piorNota[x] = piorNotaProvaUm;
                }
                
            }
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
        System.out.println("----------");
        //MOSTRA O VETOR RESULTADO COM A PONTUAÇÃO DE CADA ALUNO.
      /*  System.out.println();
        for (int x = 0; x < piorNota.length; x++) {
            System.out.println("qtd de piores notas prova numero"+(x+1)+" é " + piorNota[x]);        
        }        
        System.out.println();*/
      
        System.out.println("qtd de pior nota da 1 prova " + piorNotaProvaUm); 
    }

}
