public class Calculo {
    public static double valorTotalEmprestimo(double valorEmprestimo) {
        return valorEmprestimo * 1.35;
    }

    public static double valorParcelado(double valorEmprestimo) {

        double valorTotalEmprestimo = valorTotalEmprestimo(valorEmprestimo);

        return valorTotalEmprestimo / 24;
    }
}
