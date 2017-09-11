package javaapplication1;
public abstract class VeiculoMaritimo {
    protected float preco;
    protected int numeroPassageiros, velocidadeMaxima;
    protected String marca, modelo, identificacao;
    public Motor motor1 = new Motor();
    
    // TODOS OS CONSTRUCTS
    public VeiculoMaritimo(String marca, String modelo, String identificacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificacao = identificacao;
    }
    public VeiculoMaritimo(int numeroPassageiros, int velocidadeMaxima) {
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeMaxima  = velocidadeMaxima;
    }
    public VeiculoMaritimo(String marca, String modelo, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public VeiculoMaritimo(String marca, String modelo, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }
    public VeiculoMaritimo(String modelo) {
        this.modelo = modelo;
    }
    public VeiculoMaritimo(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public VeiculoMaritimo(float preco) {
        this.preco = preco;
    }
    public VeiculoMaritimo() {
        
    }

    // GETTERS E SETTERS
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    
    // METODOS
    public void imprimir() {
        System.out.println("PREÇO: " + getPreco());
        System.out.println("NUMERO DE PASSAGEIROS: " + getNumeroPassageiros());
        System.out.println("VELOCIDADE MAXIMA: " + getVelocidadeMaxima());
        System.out.println("MARCA: " + getMarca());
        System.out.println("MODELO: " + getModelo());
        System.out.println("IDENTIFICAÇÃO: " + getIdentificacao());
    }
    
    // VALOR ABSTRATO
    public abstract float valorDesconto();
}