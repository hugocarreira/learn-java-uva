/*
 * Faça um programa que solicite um conjunto de numeros inteiros positivos
 * e apresente: a média, o maior e o menor
 * o programa deve parar quando for digitado -1
 */
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {        
        int maior = 0, menor = 0, def = 0, cont = 0, count = 0; 
        double media = 0;
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Digite um numero correspondente à definição: ");
        def = (Integer.parseInt(sc.nextLine()));                

        maior = def;
        menor = def;
        while(def != -1) {
            count = count + def;
            cont = cont + 1;
            
            if(def > maior) {
                maior = def;
            }
            if(def < menor) {
                menor = def;
            }
            
            System.out.print("Digite um valor: ");
            def = Integer.parseInt(sc.nextLine());
        }    
        
        media = (double) count / cont;
        System.out.println("Media = " + media);
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);
    }
    
    public static void OldLogic() {
        int maior = 0, menor = 0, def = 0, count = 0; 
        double media = 0;
        Scanner sc = new Scanner(System.in); 

        if(def != -1) {
            int cj[] = new int[def];
        
            for(int i = 0; i < cj.length; i++){
                System.out.print("Digite o " + (i+1) + "º valor: ");
                cj[i] = sc.nextInt();
                if(cj[i] > maior){ 
                    maior = cj[i];
                } else if(cj[i] <= menor) {
                    menor = cj[i];
                }                
                count = count + cj[i];
            }           
            media = count / def;
        }
    }
}