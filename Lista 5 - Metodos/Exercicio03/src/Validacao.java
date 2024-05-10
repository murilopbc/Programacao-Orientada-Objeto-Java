public class Validacao {
    public static boolean validarEntradaSalario(double salario) {
        return salario > 0;
    }

    public static boolean validarEntradaEmprestimo(double valor) {
        return valor > 0 && valor <= 200000;
    }


    public static boolean validarEmprestimo(double valorEmprestimo, double salario) {
        // O valor da parcela não pode ultrapassar 15 % do salario
        double parcelado = Calculo.valorParcelado(valorEmprestimo);
        return parcelado <= salario * 0.15;
    }
}



