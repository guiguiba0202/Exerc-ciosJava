/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Ex3 {

    /**
     */
     public static void tres(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = leitor.nextInt();
        int i = 0;
        int result = 0;
        while(i <= n){
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
    
