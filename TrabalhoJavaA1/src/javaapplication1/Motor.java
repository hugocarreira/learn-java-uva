package javaapplication1;
import java.util.Scanner;

public class Motor {
    private int potencia, RPMMaxima, RPM;
    private String marca, modelo, tipoCombustivel;
    
    // TODOS OS CONSTRUCTS
    public Motor(String marca, String modelo, String tipoCombustivel, int potencia, int RPMMaxima, int RPM) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.RPMMaxima = RPMMaxima;
        this.RPM = RPM;
    }
    public Motor(int potencia, int RPMMaxima, int RPM) {
        this.potencia = potencia;
        this.RPMMaxima = RPMMaxima;
        this.RPM = RPM;
    }    
    public Motor(String marca, String modelo, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
    }  
    public Motor(String modelo) {
        this.modelo = modelo;
    }
    public Motor(int potencia) {
        this.potencia = potencia;
    }
    public Motor(int potencia, String modelo) {
        this.potencia = potencia;
        this.modelo = modelo;
    }
    public Motor(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Motor(int potencia, int RPMMaxima) {
        this.potencia = potencia;
        this.RPMMaxima = RPMMaxima;
    }
    public Motor() {
        
    }
    
    // GETTERS E SETTERS
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getRPMMaxima() {
        return RPMMaxima;
    }

    public void setRPMMaxima(int RPMMaxima) {
        this.RPMMaxima = RPMMaxima;
    }

    public int getRPM() {
        return RPM;
    }

    public void setRPM(int RPM) {
        this.RPM = RPM;
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

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    // METODOS
    public void imprimir() {
        System.out.println("RPM: " + getRPM());
        System.out.println("RPM MÁXIMA: " + getRPMMaxima());
        System.out.println("POTÊNCIA: " + getPotencia());
        System.out.println("MARCA: " + getMarca());
        System.out.println("MODELO: " + getModelo());
        System.out.println("TIPO DO COMBUSTIVEL: " + getTipoCombustivel());
    }
    public void cadastrar() {
        setPotencia(this.potencia);
        setRPMMaxima(this.RPMMaxima);
        setRPM(this.RPM);
        setMarca(this.marca);
        setModelo(this.modelo);
        setTipoCombustivel(this.tipoCombustivel);
    }
    public void entradaDados(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("DIGITE A RPM");
        RPM = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE A RPM MAXIMA");
        RPMMaxima = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE A POTENCIA");
        potencia = (Integer.parseInt(scan.nextLine()));
        System.out.println("DIGITE A MARCA");
        marca = (scan.nextLine());
        System.out.println("DIGITE O MODELO");
        modelo = (scan.nextLine());
        System.out.println("DIGITE O TIPO DO COMBUSTIVEL");
        tipoCombustivel = (scan.nextLine());
    }
    public void warning() {
        System.out.println("O MOTOR JÁ ESTÁ EM POTÊNCIA MÁXIMA!");
    }
    
    public void acelerar() {
        if(RPM < RPMMaxima) {
            setRPM(getRPM() + 100);
            System.out.println("O MOTOR FOI ACELERADO!");
        } else {
            warning();
        }
    }
    public void desacelerar() {
        if (RPM > 0) {
            setRPM(getRPM() - 100);
            System.out.println("O MOTOR FOI DESACELERADO!");
        } else if (getRPM() < 0) {
            setRPM(0);
            System.out.println("O MOTOR ESTÁ PARADO!");
        }
    }
}