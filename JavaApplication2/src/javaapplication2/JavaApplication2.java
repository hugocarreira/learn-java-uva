/*
* Faça um programa que leia dois numeros inteiros positivos A e B
* escreva a mensagem "São Multiplos" caso A e B sejam multiplos
* escreve a mensagem "Não São Multiplos" caso A e B não sejam multiplos
*/

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a,b;
        
        System.out.print("Escreva um número para A: ");        
        a=Integer.parseInt(s.nextLine());
        System.out.print("Escreva um número para B: ");        
        b=Integer.parseInt(s.nextLine());
        
        if(a % b == 0) {
            System.out.println("A e B são multiplos");
        } else {
            System.out.println("A e B não são multiplos");
        }
        
    }
    
}
