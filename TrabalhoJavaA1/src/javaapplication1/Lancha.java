package javaapplication1;
import java.util.Scanner;

public class Lancha extends VeiculoMaritimo {
    protected String tipoCasco;
    protected boolean banheiro;
    
    // TODOS CONSTRUCTS
    public Lancha (String marca, String modelo, String identificacao, int numeroPassageiros, int velocidadeMaxima, float preco, String tipoCasco, boolean banheiro){
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.tipoCasco = tipoCasco;
        this.banheiro = banheiro;
    }
    public Lancha (String marca, String modelo, String identificacao, int numeroPassageiros, int velocidadeMaxima, float preco){
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }
    public Lancha(String marca, String modelo, String identificacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
    }
    public Lancha(String modelo, boolean banheiro, float preco){
        this.modelo = modelo;
        this.banheiro = banheiro;
        this.preco = preco;
    }
    public Lancha(int numeroPassageiros, int velocidadeMaxima){
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public Lancha(String tipoCasco, boolean banheiro){
        this.tipoCasco = tipoCasco;
        this.banheiro = banheiro;
    }
    public Lancha(String marca, float preco){
        this.marca = marca;
        this.preco = preco;
    }
    public Lancha(String tipoCasco){
        this.tipoCasco = tipoCasco;
    }
    public Lancha(boolean banheiro) {
        this.banheiro = banheiro;
    }
    public Lancha(float preco) {
        this.preco = preco;
    }
    public Lancha() {
        
    }
        
    // GETTERS E SETTERS
    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }
    
    // METODOS
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("VALOR COM DESCONTO: " + valorDesconto());
        System.out.println("TIPO DO CASCO: " + getTipoCasco());
        System.out.println("BANHEIRO: " + isBanheiro());
        
        System.out.println("* ---- DADOS DO MOTOR DA LANCHA ---- *");
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
        setBanheiro(this.banheiro);
        
        motor1.cadastrar();
    }
    
    public float valorDesconto() {
        float desconto  = (float) (getPreco() * 0.9);
        return desconto;
    }
    
    public void entradaDados(){
        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O PREÇO DA LANCHA: ");
        preco = (Float.parseFloat(scan.nextLine()));
        System.out.println("DIGITE O NUMERO DE PASSAGEIROS: ");
        numeroPassageiros = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE VELOCIDADE MAXIMA: ");
        velocidadeMaxima = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE A MARCA DA LANCHA: ");
        marca = (scan.nextLine());
        System.out.println("DIGITE O MODELO DA LANCHA: ");
        modelo = (scan.nextLine());
        System.out.println("DIGITE A IDENTIFICACAO: ");
        identificacao = (scan.nextLine());
        System.out.println("DIGITE O TIPO DO CASCO");
        tipoCasco = (scan.nextLine());
        System.out.println("POSSUI BANHEIRO? [1 = SIM / 0 = NÃO]");
        int verificacao = (Integer.parseInt(scan.nextLine()));
        
        if(verificacao == 1) {
            this.banheiro = true;
        }else if (verificacao == 0) {
            this.banheiro = false;
        }
        
        System.out.println("* ---- DADOS DO MOTOR ---- *");
        motor1.entradaDados();
    }
}
