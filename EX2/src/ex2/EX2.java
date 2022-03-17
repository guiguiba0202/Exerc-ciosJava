/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Escreva números separados por um espaço: ");
        Scanner entrada;
        
        int[] n = new int[4];
        
        for(int i = 0; i > 0; i++){
            entrada = new Scanner (System.in);
            if(entrada.value = null){
                i = -1;
            }
            else{
                n[i] = entrada.nextInt();
            }
        }
        
        int media = 0;
        
        for(int i = 0; i < n.length; i++){
            media += n[i];
        }
        
        System.out.print(media);
    }
}
