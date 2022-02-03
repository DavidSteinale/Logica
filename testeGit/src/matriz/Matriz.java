package matriz;

import java.util.Random;
import javax.swing.JOptionPane;

public class Matriz {
    //teste

    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] matriz = new int[10][10];
                
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {             
            }
        }
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " | ");
            }
            System.out.println();
   
            
        }
    }
    
}
