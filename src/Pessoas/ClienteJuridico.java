package Pessoas;

/**
 *
 * @author r_alb
 */
public class ClienteJuridico extends Cliente {
    private String  identificador;
    private long    cnpj;

    // CONSTRUTORES ------------------------------------------------------------

// Com super da classe Cliente
    public ClienteJuridico(String nomeCompleto, String estado, String cidade, String logradouro, String complemento, int numero, int cep, String identificador, long cnpj) {
        super(nomeCompleto, estado, cidade, logradouro, complemento, numero, cep);
        this.identificador = identificador;
        this.cnpj = cnpj;
    }
    
// Somente do ClienteFisico   
    public ClienteJuridico(String identificador, long cnpj) {
        this.identificador = identificador;
        this.cnpj = cnpj;
    }

    // SETTERS E GETTERS -------------------------------------------------------
    
// getters
    public String getIdentificador() {
        return identificador;
    }
    
    public long getCnpj() {
        return cnpj;
    }
    
//setters
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }    
// MÉTODOS -----------------------------------------------------------------
    
    
// FECHAMENTO DA CLASSE
}