package ex16;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coluna = 10;
        int linha = 2;
        int soma = 0;
        int qtdDeAprovados = 0;
        int media = 0;

        char[][] resposta = new char[linha][coluna];

        int[] matricula = new int[linha];
        int[] resultado = new int[linha];
        //float[] media = new float[linha];
        char[] gabarito = new char[coluna];   //{'a', 'b', 'c', 'e', 'b', 'e', 'c', 'e', 'a', 'd'};

        System.out.println("Informe o gabarito da prova(a,b,c,d,e):");
        for (int x = 0; x < gabarito.length; x++) {
            String g = scanner.nextLine();
            gabarito[x] = g.charAt(0);
        }
        System.out.println("----------");
        //MATRIZ PARA RECEBER AS NOTAS
        System.out.println("Informe às respostas:");
        for (int x = 0; x < resposta.length; x++) {
            System.out.print("Informe a matricula do " + (x + 1) + " aluno:");
            matricula[x] = scanner.nextInt();
            scanner.nextLine();
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
                if (resposta[x][y] == gabarito[y]) {
                    soma++;
                    resultado[x] = soma;
                }
            }
            if (resultado[x] >= 7) {
                qtdDeAprovados++;
            }
            media = (100*qtdDeAprovados)/coluna;
            soma = 0;
        }

        System.out.println();
        System.out.println("--- RESPOSTAS DO ALUNOS ---");
        System.out.println();
        for (int x = 0; x < resposta.length; x++) {

            System.out.print("Maticula " + matricula[x] + ": ");
            for (int y = 0; y < resposta[x].length; y++) {
                System.out.print(resposta[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
        //MOSTRA O VETOR RESULTADO COM A PONTUAÇÃO DE CADA ALUNO.
        System.out.println();
        for (int x = 0; x < resultado.length; x++) {
            System.out.println("Pontuação do aluno matricula " + matricula[x] + " é " + resultado[x]);
        }
        System.out.println("----------");
        System.out.println("Media de aprovados: " + media+"%");
        System.out.println();
    }
}
