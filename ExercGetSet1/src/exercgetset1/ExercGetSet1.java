
package exercgetset1;

public class ExercGetSet1 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Inglês", "R. Vinte e Cinco de Julho, 564 - Vargas, Sapucaia do Sul - RS, 93222-000", 4);
        cursoTecnico curso2 = new cursoTecnico("T.I.", "R. Vinte e Cinco de Julho, 564 - Vargas, Sapucaia do Sul - RS, 93222-000", 4, "Presencial");
        curso1.calcularMensalidade();
        curso2.calcularMensalidade();
        curso1.exibirInformacoes();
        curso2.exibirInformacoes();
        curso1.setCargaHoraria(6);
        curso1.exibirInformacoes();
    }
    
}
