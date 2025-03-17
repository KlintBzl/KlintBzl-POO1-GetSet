
package exercgetset1;

public abstract class Escola {
    private String nome, endereço;
    
    public Escola(String nome, String edereço){
        this.endereço = edereço;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    public abstract void calcularMensalidade();
}
