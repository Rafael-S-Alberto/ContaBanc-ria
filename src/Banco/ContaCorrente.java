/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author r_alb
 */
public class ContaCorrente extends Conta {

    private String Identificador;
    private double saldo;
    private double limite;

    // CONSTRUTORES -----------------------------------------------------------

// Com super da classe Conta
    public ContaCorrente(String Identificador, double Saldo, double limite, String numero, String agencia) {
        super(numero, agencia);
        this.Identificador = Identificador;
        this.saldo = Saldo;
        this.limite = limite;
    }
    
// Somente da ContaCorrente
    public ContaCorrente(String Identificador, double Saldo, double limite) {
        this.Identificador = Identificador;
        this.saldo = Saldo;
        this.limite = limite;
    }

    // SETTERS E GETTERS -------------------------------------------------------
    
// getters
    public String getIdentificador() {
        return Identificador;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public double getLimite() {
        return limite;
    }

// setters
    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public void setSaldo(double Saldo) {
        this.saldo = Saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // MÉTODOS -----------------------------------------------------------------

// depositar dinheiro
    public boolean depositarDinheiro(double valor){
        boolean resultado;
        if (valor > 0.0){
            this.saldo += valor;
            resultado=true;
        }
        else {
            resultado = false;
        }
        return resultado;
    }

// sacar dinheiro        
    public boolean sacarDinheiro (double valor){
        boolean resultado;
        if (this.saldo > valor){
            this.saldo -= valor;
            resultado = true;
        }
        else if (this.saldo < valor){
            resultado = false;
        }
        else {
            resultado = false;
        }
        return resultado;
    }

// exibir saldo
    public void exibirSaldo(){
        System.out.println("");
        System.out.println("Saldo atual: R$"+this.getSaldo());
        System.out.println("");
    }

// transferir dinheiro ** FINALIZAR
    public boolean transferirDinheiro(double valor, String destino){
        boolean resultado = false;
        if (this.saldo > valor){
            this.saldo -= valor;
        }
        return resultado;
    }   

// guardar na poupança
    public boolean guardarPoupanca (double valor, ContaPoupanca destino){
        boolean resultado;
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.saldo += valor;
            resultado = true;
        }
        else {
            resultado = false;
        }
        return resultado;
    }
    
// FECHAMENTO DA CLASSE     
}

