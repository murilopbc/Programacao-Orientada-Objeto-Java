public class Calculo {


    public static double valorTotalEmprestimo(double valorEmprestimo) {
        double calcularEmprestimo = valorEmprestimo * 1.35;
        System.out.println("Valor total a ser pago pelo empréstimo: " + calcularEmprestimo);
        return calcularEmprestimo;
    }

    public static double valorParcelado(double calcularEmprestimo) {

        double valorParcela = calcularEmprestimo / 24;
        System.out.println("Valor de cada parcela: " + valorParcela);
        return valorParcela;
    }
}
