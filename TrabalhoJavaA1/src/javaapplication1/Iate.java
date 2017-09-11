package javaapplication1;
import java.util.Scanner;
public class Iate extends VeiculoMaritimo {
    
    protected int numeroTripulantes, numeroCabines;
    protected boolean piscina;
    public Motor motor2 = new Motor();
    
    // Todos Construtores
    public Iate() {    
    }
    
    public Iate(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;  
    } 
    
    public Iate(int numeroTripulantes, int numeroCabines) {
        this.numeroTripulantes = numeroTripulantes; 
        this.numeroCabines = numeroCabines;  
    } 
    
    public Iate(boolean piscina) {
        this.piscina = piscina;
    } 
    
    public Iate(boolean piscina, int numeroCabines) {
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;    
    } 
    
    public Iate(boolean piscina, int numeroCabines, int numeroTripulantes) {
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
    } 
    
    public Iate(String marca, boolean piscina, int numeroCabines, int numeroTripulantes) {
        this.marca = marca;
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
    } 
    
    public Iate(String marca, boolean piscina, int numeroCabines, int numeroTripulantes, float preco) {
        this.marca = marca;
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
        this.preco = preco;
    } 
    
    public Iate(String marca, boolean piscina, int numeroCabines, int numeroTripulantes, float preco, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
        this.preco = preco;
    } 
    
    public Iate(String marca, boolean piscina, int numeroCabines, int numeroTripulantes, float preco, String modelo, String identificacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao; 
        this.piscina = piscina;
        this.numeroCabines = numeroCabines;
        this.numeroTripulantes = numeroTripulantes; 
        this.preco = preco;
    } 
    
    // Getters e Setters
    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }
    
    public int getNumeroCabines() {
        return numeroCabines;
    }
    
    public void setNumeroCabines(int numeroCabines) {
        this.numeroCabines = numeroCabines;
    }
    
    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    
    // Metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("VALOR COM DESCONTO: " + valorDesconto());
        System.out.println("NUMERO DE TRIPULANTES: " + getNumeroTripulantes());
        System.out.println("NUMERO DE CABINES: " + getNumeroCabines());
        System.out.println("PISCINA: " + isPiscina());
        PessoasPorCabine();
    }
        
    
    public void cadastrar() {
        setPreco(this.preco);
        setNumeroPassageiros(this.numeroPassageiros);
        setVelocidadeMaxima(this.velocidadeMaxima);
        setMarca(this.marca);
        setModelo(this.modelo);
        setIdentificacao(this.identificacao);
        setNumeroTripulantes(this.numeroTripulantes);
        setNumeroCabines(this.numeroCabines);
        setPiscina(this.piscina);
        
        motor1.cadastrar();
        motor2.cadastrar();
    }
    
    @Override
    public float valorDesconto() {
        float desconto  = (float) (getPreco() * 0.92);
        return desconto;
       
    }
    
    public void PessoasPorCabine(){
        float ppc = getNumeroPassageiros() / getNumeroCabines();
    }
    
    public void entradaDados(){
        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O PREÇO DO IATE: ");
        preco = (Float.parseFloat(scan.nextLine()));
        System.out.println("DIGITE O NUMERO DE PASSAGEIROS: ");
        numeroPassageiros = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE VELOCIDADE MAXIMA DO MOTOR: ");
        velocidadeMaxima = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE A MARCA DO IATE: ");
        marca = (scan.nextLine());
        System.out.println("DIGITE O MODELO DO IATE: ");
        modelo = (scan.nextLine());
        System.out.println("DIGITE A IDENTIFICACAO: ");
        identificacao = (scan.nextLine());
        System.out.println("DIGITE O NUMERO DE TRIPULANTES");
        numeroTripulantes = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE O NUMERO DE CABINES NO IATE");
        numeroCabines = (Integer.parseInt(scan.nextLine()));
        System.out.println("TEM PISCINA? [1 = SIM / 0 = NÃO]" );
        int verificacao = (Integer.parseInt(scan.nextLine()));
        
        if(verificacao == 1) {
            this.piscina = true;
        }else if (verificacao == 0) {
            this.piscina = false;
        }
        
        System.out.println("* ---- DADOS DO MOTOR 1 ---- *");
        motor1.entradaDados();
        System.out.println("* ---- DADOS DO MOTOR 2 ---- *");
        motor2.entradaDados();
    }
}