/*
 * Foi feita uma pesquisa com um grupo de alunos de um universidade
 * na qual se perguntou para cara aluno o nuemro de vezes que utilizou o restaurante da universidade no ultimo mes
 * Faça um programa que determine:
 * A) o percentual de alunos que utilizaram menos que 10 vezes o restaurante
 * B) o percentual de alunos que utilizaram entre 10 e 15 vezes
 * C) o percentual de alunos que utilizaram o restaurante acima de 15 vezes
 */

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nvezes = 0, tPessoas = 0, t1 = 0, t2 = 0, t3 = 0;
        double perc1 = 0, perc2 = 0, perc3 = 0;
        
        System.out.print("Quantas vezes você almoçou no restaurante mês passado? ");
        nvezes = Integer.parseInt(sc.nextLine());
        
        while(nvezes != 1) {
            if(nvezes >= 0){
                tPessoas++;
                if(nvezes < 10) {
                    t1++;
                } else if(nvezes <= 15) {
                    t2++;
                } else {
                    t3++;
                }
            }
            System.out.print("Quantas vezes você almoçou no restaurante mês passado? ");
            nvezes = Integer.parseInt(sc.nextLine());            
        }
        perc1 = (double) t1/tPessoas*100;
        perc2 = (double) t2/tPessoas*100;
        perc3 = (double) t3/tPessoas*100;
        
        System.out.println("< 10: " + Math.floor(perc1));
        System.out.println("10 à 15: " + Math.floor(perc2));
        System.out.println("> 15: " + Math.floor(perc3));
    }
    
}
