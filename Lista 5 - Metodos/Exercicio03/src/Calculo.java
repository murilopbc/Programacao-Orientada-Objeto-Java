public class Calculo {

    static double valorEmprestimo, calcularEmprestimo;
    public static void valorTotalEmprestimo() {
        calcularEmprestimo = valorEmprestimo * 1.35;
        System.out.println("Valor total a ser pago pelo empréstimo: " + calcularEmprestimo);

    }

    public static void valorParcelado() {

        double valorParcela =  calcularEmprestimo / 24;
        System.out.println("Valor de cada parcela: " + valorParcela);
    }
}
