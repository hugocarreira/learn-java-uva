package Aplicaçao;
import javaapplication1.Iate;
import javaapplication1.Jetski;
import javaapplication1.Lancha;

public class App {
    public static void main(String[] args) {      

        Iate i1 = new Iate();
        Iate i2 = new Iate(true);
        Iate i3 = new Iate(false, 100);
        Iate i4 = new Iate(true, 150, 10);
        Iate i5 = new Iate("GM", true, 100, 10, (float) 4.500);
        
        Jetski j1 = new Jetski();
        Jetski j2 = new Jetski(100, 450);
        Jetski j3 = new Jetski("KK1534", true, (float) 5.000);
        Jetski j4 = new Jetski("GM", "JK435", "asdas1654");
        Jetski j5 = new Jetski("GM", "LL1231", "ahdf132123", 143, 500, (float) 5.500);
        
        Lancha l1 = new Lancha(); 
        Lancha l2 = new Lancha((float) 5.000);
        Lancha l3 = new Lancha("GM", (float) 11.000);
        Lancha l4 = new Lancha("asd111", true, (float) 123.000);
        Lancha l5 = new Lancha("GM", "AAd12", "ffghdf23423", 140, 450, (float) 33.000);
        
       
        
        
        
        System.out.println("* ---- PRIMEIRO IATE ---- *");
        i1.entradaDados();
        System.out.println("* ---- DADOS DA IATE 1 ---- *");
        i1.imprimir();
        
        System.out.println("* ---- SEGUNDO IATE ---- *");
        i2.entradaDados();
        System.out.println("* ---- DADOS DA IATE 2 ---- *");
        i2.imprimir();
        
        System.out.println("* ---- TERCEIRO IATE ---- *");
        i3.entradaDados();
        System.out.println("* ---- DADOS DA IATE 3 ---- *");
        i3.imprimir();
        
        System.out.println("* ---- QUARTO IATE ---- *");
        i4.entradaDados();
        System.out.println("* ---- DADOS DA IATE 4 ---- *");
        i4.imprimir();
        
        System.out.println("* ---- QUINTO IATE ---- *");
        i5.entradaDados();
        System.out.println("* ---- DADOS DA IATE 5 ---- *");
        i5.imprimir();
        
        
        System.out.println("* ---- PRIMEIRA LANCHA ---- *");
        l1.entradaDados();
        System.out.println("* ---- DADOS DA LANCHA 1 ---- *");
        l1.imprimir();
        
        System.out.println("* ---- SEGUNDA LANCHA ---- *");
        l2.entradaDados();
        System.out.println("* ---- DADOS DA LANCHA 2 ---- *");
        l2.imprimir();
        
        System.out.println("* ---- TERCEIRA LANCHA ---- *");
        l3.entradaDados();
        System.out.println("* ---- DADOS DA LANCHA 3 ---- *");
        l3.imprimir();
        
        System.out.println("* ---- QUARTA LANCHA ---- *");
        l4.entradaDados();
        System.out.println("* ---- DADOS DA LANCHA 4 ---- *");
        l4.imprimir();
        
        System.out.println("* ---- QUINTA LANCHA ---- *");
        l5.entradaDados();
        System.out.println("* ---- DADOS DA LANCHA 5 ---- *");
        l5.imprimir();
        
        
        System.out.println("* ---- PRIMEIRO JETSKI ---- *");
        j1.entradaDados();
        System.out.println("* ---- DADOS DO JETSKI 1 ---- *");
        j1.imprimir();
        
        System.out.println("* ---- SEGUNDO JETSKI ---- *");
        j2.entradaDados();
        System.out.println("* ---- DADOS DO JETSKI 2 ---- *");
        j2.imprimir();
        
        System.out.println("* ---- TERCEIRO JETSKI ---- *");
        j3.entradaDados();
        System.out.println("* ---- DADOS DO JETSKI 3 ---- *");
        j3.imprimir();
        
        System.out.println("* ---- QUARTO JETSKI ---- *");
        j4.entradaDados();
        System.out.println("* ---- DADOS DO JETSKI 4 ---- *");
        j4.imprimir();
        
        System.out.println("* ---- QUINTO JETSKI ---- *");
        j5.entradaDados();
        System.out.println("* ---- DADOS DO JETSKI 5 ---- *");
        j5.imprimir();
    }
}