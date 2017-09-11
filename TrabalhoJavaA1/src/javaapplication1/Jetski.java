package javaapplication1;

import java.util.Scanner;

public class Jetski extends VeiculoMaritimo {
    protected boolean reboque;
    protected String tipoCasco;
    
    // TODOS CONSTRUCTS
    public Jetski (String marca, String modelo, String identificacao, int numeroPassageiros, int velocidadeMaxima, float preco, boolean reboque, String tipoCasco){
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.reboque = reboque;
        this.tipoCasco = tipoCasco;
    }
    public Jetski (String marca, String modelo, String identificacao, int numeroPassageiros, int velocidadeMaxima, float preco){
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }
    public Jetski(String marca, String modelo, String identificacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
    }
    public Jetski(String modelo, boolean reboque, float preco){
        this.modelo = modelo;
        this.reboque = reboque;
        this.preco = preco;
    }
    public Jetski(int numeroPassageiros, int velocidadeMaxima){
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public Jetski(String tipoCasco, boolean reboque){
        this.tipoCasco = tipoCasco;
        this.reboque = reboque;
    }
    public Jetski(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }
    public Jetski(String tipoCasco){
        this.tipoCasco = tipoCasco;
    }
    public Jetski(boolean reboque) {
        this.reboque = reboque;
    }
    public Jetski(float preco) {
        this.preco = preco;
    }
    public Jetski(){
        
    }
    
    // GETTERS E SETTERS
    public boolean isReboque() {
        return reboque;
    }

    public void setReboque(boolean reboque) {
        this.reboque = reboque;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }
    
    // METODOS
    public void imprimir() {
        super.imprimir();
        System.out.println("VALOR COM DESCONTO: " + valorDesconto());
        System.out.println("TIPO DO CASCO: " + getTipoCasco());
        System.out.println("REBOQUE: " + isReboque());
        
        System.out.println("* ---- DADOS DO MOTOR DO JETSKI ---- *");
        this.motor1.imprimir();
    }
    public void cadastrar() {
        setPreco(this.preco);
        setNumeroPassageiros(this.numeroPassageiros);
        setVelocidadeMaxima(this.velocidadeMaxima);
        setMarca(this.marca);
        setModelo(this.modelo);
        setIdentificacao(this.identificacao);
        setTipoCasco(this.tipoCasco);
        setReboque(this.reboque);
        motor1.cadastrar();
    }
    
    public float valorDesconto() {
        float desconto = (float) (getPreco() * 0.85);
        return desconto;
    }
        
    public void entradaDados(){
        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O PREÇO DO JETSKI: ");
        preco = (Float.parseFloat(scan.nextLine()));
        System.out.println("DIGITE O NUMERO DE PASSAGEIROS: ");
        numeroPassageiros = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE VELOCIDADE MAXIMA DO MOTOR: ");
        velocidadeMaxima = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE A MARCA DO JETSKI: ");
        marca = (scan.nextLine());
        System.out.println("DIGITE O MODELO DO JETSKI: ");
        modelo = (scan.nextLine());
        System.out.println("DIGITE A IDENTIFICACAO: ");
        identificacao = (scan.nextLine());
        System.out.println("DIGITE O TIPO DO CASCO");
        tipoCasco = (scan.nextLine());
        System.out.println("POSSUI REBOQUE? [1 = SIM / 0 = NÃO]");
        int verificacao = (Integer.parseInt(scan.nextLine()));
        
        if(verificacao == 1) {
            this.reboque = true;
        }else if (verificacao == 0) {
            this.reboque = false;
        }        
        
        System.out.println("* ---- DADOS DO MOTOR ---- *");
        motor1.entradaDados();
    }
}