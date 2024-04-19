public class Horista extends Colaborador{

    double horasTrabalhadas;
    double salarioPorHora;

    public Horista(int edv, String nome, String cargo, double horasTrabalhadas, double salarioPorHora) {
        super(edv, nome, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

    double receberSalario(){
        return this.horasTrabalhadas * this.salarioPorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                ", salarioPorHora=" + salarioPorHora +
                ", edv=" + edv +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
