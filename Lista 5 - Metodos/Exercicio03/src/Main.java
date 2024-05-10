import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorSalarioAtual, valorEmprestimo;

        while (true){
            try {
                System.out.println("Digite o valor do seu salário atual: ");
                valorSalarioAtual = sc.nextDouble();

                if (!Validacao.validarEntradaSalario(valorSalarioAtual)){
                    continue;
                }

                break;

            }catch (InputMismatchException e){
                System.err.println("Valor Inválido");
                sc.next();
            }
        }
        while (true){
            try {
                System.out.println("Digite o valor do empréstimo:");
                valorEmprestimo = sc.nextDouble();
                if(!Validacao.validarEntradaEmprestimo(valorEmprestimo)){
                    System.err.println("Valor do empréstimo tem que ser maior que 0 e até R$ 200.000,00");
                    continue;
                }
                if(!Validacao.validarEmprestimo(valorEmprestimo)){
                    System.err.println("Valor Inválido. Valor da parcela é maior que 15% do salário");
                    continue;
                }
                break;

            }catch (InputMismatchException e){
                System.err.println("Valor Inválido");
                sc.next();
            }
        }

        double calcularEmprestimo = Calculo.valorTotalEmprestimo(valorEmprestimo);
        double valorParcela = Calculo.valorParcelado(valorEmprestimo);
        Resultado.mostrarResultadoEmprestimo(valorParcela, valorEmprestimo);

        System.out.println("Valor de cada parcela: "+ valorParcela);
        System.out.println("Valor total a ser pago pelo empréstimo: "+ calcularEmprestimo);



    }
}