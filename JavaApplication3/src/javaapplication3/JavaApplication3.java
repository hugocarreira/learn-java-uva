/*
 * Faça um programa que leia as 3 notas de um aluno e calcule a media final deste aluno
 * Considerar que a media é ponderada e que os pesos das notas sao: 2,3 e 5, respectivamente
 */
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    
    public static void main(String[] args) {
        Double a1,a2,a3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota da A1: ");
        a1=(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite a nota da A1: ");
        a2=(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite a nota da A1: ");
        a3=(Double.parseDouble(sc.nextLine()));               
        
        System.out.print("Média Final: " + CalcularMedia(a1, a2, a3) + "\n");
    }
    
    public static double CalcularMedia(double a1, double a2, double a3) {
        double peso1 = 2.0, peso2 = 3.0, peso3 = 5.0, media;
        
        a1 = a1 * peso1;
        a2 = a2 * peso2;
        a3 = a3 * peso3;
        
        media = (a1 + a2 + a3) /10.0;
        
        return media;
    }
    
}
