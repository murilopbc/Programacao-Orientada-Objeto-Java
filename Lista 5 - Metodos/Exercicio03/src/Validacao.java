public class Validacao {

    // Função 'validarEntradaSalario' não é static, então na classe 'EntradaSaida' eu tenho que instanciar a classe 'Validação'


    public boolean validarEntradaSalario(double salario) {
        return salario > 0;
    }

    public static boolean validarEntradaEmprestimo(double valorEmprestimo) {
        return valorEmprestimo > 0 && valorEmprestimo <= 200000;
    }


    public static boolean validarEmprestimo(double salario, double parcelado) {
        // O valor da parcela não pode ultrapassar 15 % do salario


        return parcelado <= salario * 0.15;
    }


}



