/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class EX1 {
    /**
     * @param args the command line arguments
     */
    
    //O programa deve ser capaz de ler um núumero e mostrar a soma de todos os anteriores a este at´pe chegar ao número em questão.
    public static void main(String[] args) {
        System.out.print("Digite um numero positivo qualquer: ");
        Scanner entrada = new Scanner (System.in);
        int n = entrada.nextInt();
        int soma = 0;
        
        if(n > 0 && n < 999){
            for(int i = 0; i <= n; i++){
                soma += i;
            }
            System.out.print(soma);
        }
        else{
            System.out.print
            ("ERRO! Digite um número positivo entre 0-999!");
        }
    }
}
