
package exercgetset1;

public class cursoTecnico extends Curso{
    
    private String modalidade;
    private double mensalidade;

    public cursoTecnico(String nome, String edereço, int cargahoraria, String modalidade) {
        super(nome, edereço, cargahoraria);
        this.modalidade = modalidade;
    }
    
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereço());
        System.out.println("Carga horária: " + getCargaHoraria());
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Mensalidade: " + mensalidade);
        System.out.println("==============================================");
    }
    
    @Override
    public void calcularMensalidade() {
    mensalidade = 300 (10 * getCargaHoraria());
        
    }
}
