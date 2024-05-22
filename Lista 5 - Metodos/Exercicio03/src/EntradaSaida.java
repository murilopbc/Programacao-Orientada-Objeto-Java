import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaSaida {
    public static void Principal() {
        Scanner sc = new Scanner(System.in);
        double valorSalarioAtual, valorEmprestimo;

        Validacao validacao = new Validacao();


        while (true) {
            try {
                System.out.println("Digite o valor do seu salário atual: ");
                valorSalarioAtual = sc.nextDouble();

                if (!validacao.validarEntradaSalario(valorSalarioAtual)) {
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.err.println("Valor Inválido");
                sc.next();
            }
        }
        while (true) {
            try {
                System.out.println("Digite o valor do empréstimo:");
                valorEmprestimo = sc.nextDouble();
                if (!Validacao.validarEntradaEmprestimo(valorEmprestimo)) {
                    System.err.println("Valor do empréstimo tem que ser maior que 0 e até R$ 200.000,00");
                    continue;
                }
                if (!Validacao.validarEmprestimo(valorEmprestimo, valorSalarioAtual)) {
                    System.err.println("Valor Inválido. Valor da parcela é maior que 15% do salário");
                    continue;
                }
                break;

            } catch (InputMismatchException e) {
                System.err.println("Valor Inválido");
                sc.next();
            }
        }

        Calculo.valorTotalEmprestimo();
        Calculo.valorParcelado();

        sc.close();

    }
}
