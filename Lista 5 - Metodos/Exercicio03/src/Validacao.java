public class Validacao {
    public double validarEmprestimo(double valorEmprestimo, double salarioAtual){
        double valorParcelaEmprestimo = salarioAtual / 24;
        if (valorEmprestimo > 200000 || valorEmprestimo < 0 || valorEmprestimo > valorParcelaEmprestimo*0.15 ){
            return valorEmprestimo;
        }
        else {
            return valorEmprestimo;
        }

    }
}
