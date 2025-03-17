
package exercgetset1;

public class Curso extends Escola{
    
    private int cargaHoraria;
    private double mensalidade;
    
    public Curso(String nome, String edereço, int cargahoraria) {
        super(nome, edereço);
        cargaHoraria = cargahoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria > 0){
            this.cargaHoraria = cargaHoraria;
        }
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereço());
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Mensalidade: " + mensalidade);
        System.out.println("==============================================");
    }

    @Override
    public void calcularMensalidade() {
        mensalidade = 300;
    }
    
}
