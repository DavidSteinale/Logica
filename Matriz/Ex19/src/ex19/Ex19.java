package ex19;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coluna = 4;
        int linha = 2;
        int indice = 0;
        int soma = 0;

        int maiorNota = 0;

        int[][] matriz = new int[linha][coluna];

        //INSERE O VALORES NA MATRIZ
        for (int x = 0; x < linha; x++) {
            System.out.println("Digite os seguintes valores na sequinte sequencia do " + (x + 1) + " aluno : Nº da matricula | Média das Provas | Média Trabalhos ");
            for (int y = 0; y < (coluna - 1); y++) {
                matriz[x][y] = scanner.nextInt();
            }
        }
        
        System.out.println("--- MATRIZ ---");
        System.out.println();
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        //CALCULA A NOTA FINAL
        for (int x = 0; x < linha; x++) {
            matriz[x][3] = (matriz[x][1] + matriz[x][2]);
        }       
        
        //CALCULA A MAIOR NOTA
        for (int x = 0; x < matriz.length; x++) {
            if (x == 0) {
                maiorNota = matriz[x][3];
                indice = x;
            }
            if (matriz[x][3] > maiorNota) {
                maiorNota = matriz[x][3];
                indice = x;
            }
        }
        //CALCULA A MÉDIA ARTMETICA        
         for (int x = 0; x < linha; x++) {
            soma += matriz[x][3];
        }
        int media=soma/linha;
        
        System.out.println("----------");
        System.out.print("Matricula de maior nota " + maiorNota + " Matricula " + matriz[indice][0]+" .");
        System.out.println();
        System.out.print("Média Artimética das notas finais é: " + media + ". ");
        System.out.println();
        System.out.println("----------");
    }
}

