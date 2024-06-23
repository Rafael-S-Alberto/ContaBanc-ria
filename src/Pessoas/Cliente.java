package Pessoas;

public class Cliente {
        
    // ATRIBUTOS ---------------------------------------------------------------
    private String  nomeCompleto;
    private String  estado;
    private String  cidade;
    private String  logradouro;
    private String  complemento;
    private int     numero;
    private long     cep;

    // CONSTRUTOR --------------------------------------------------------------
    public Cliente(String nomeCompleto, String estado, String cidade, String logradouro, String complemento, int numero, long cep) {
        this.nomeCompleto = nomeCompleto;
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
    }
    
    public Cliente (){
    }
    
    // GETS ----------------------------------------------------------------
    public String getNomeCompleto() {
        return nomeCompleto;
    }    
    
    public String getEstado() {
        return estado;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public int getNumero() {
        return numero;
    }

    public long getCep() {
        return cep;
    }
    
    // SETS ----------------------------------------------------------------
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }
    
    // MÉTODOS -----------------------------------------------------------------
    public void alterarEstado(String estado) {
        this.estado = estado;
    }

    public void alterarCidade(String cidade) {
        this.cidade = cidade;
    }

    public void alterarLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void alterarComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void alterarNumero(int numero) {
        this.numero = numero;
    }

    public void alterarCep(long cep) {
        this.cep = cep;
    }   

// FECHAMENTO DA CLASSE
}
