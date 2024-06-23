package Banco;

public class Conta {
    // ATRIBUTOS ---------------------------------------------------------------
    private String numero;
    private String agencia;
    
    // CONSTRUTORES ------------------------------------------------------------
    public Conta(String numero, String agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }
    
    public Conta (){
    }
    
    // GETS --------------------------------------------------------------------
    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    // SETS --------------------------------------------------------------------

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
// FECHAMENTO DA CLASSE
}
