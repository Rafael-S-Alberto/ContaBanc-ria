package Pessoas;

public class ClienteFisico extends Cliente {
    private String  identificador;
    private long    cpf;
    private long    rg;
    
    // CONSTRUTORES ------------------------------------------------------------

// Com super da classe Cliente
    public ClienteFisico(String nomeCompleto, long cpf, long rg, String estado, String cidade, String logradouro, String complemento, int numero, int cep, String identificador) {
        super(nomeCompleto, estado, cidade, logradouro, complemento, numero, cep);
        this.identificador = identificador;
        this.cpf = cpf;
        this.rg = rg;
    }
    
// Somente do ClienteFisico   
    public ClienteFisico(String identificador, long cpf, long rg) {
        this.identificador = identificador;
        this.cpf = cpf;
        this.rg = rg;
    }

    // SETTERS E GETTERS -------------------------------------------------------
    
// getters
    public String getIdentificador() {
        return identificador;
    }

    public long getRg() {
        return rg;
    }

    public long getCpf() {
        return cpf;
    }
    
//setters
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }
    
// MÉTODOS -----------------------------------------------------------------

// depositar dinheiro



// FECHAMENTO DA CLASSE
}
