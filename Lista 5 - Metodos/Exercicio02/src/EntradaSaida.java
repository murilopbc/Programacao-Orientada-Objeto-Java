import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaSaida {
    public static void Principal() {

        Scanner sc = new Scanner(System.in);

        double salarioBruto;
        while (true) {
            try {
                System.out.println("Informe o salário bruto: ");
                salarioBruto = sc.nextDouble();

                Calculo.salarioBruto = salarioBruto;

                if (!Validacao.validarSalario(salarioBruto)) {
                    System.err.println("Salário Inválido. O salário deve ser entre R$ 500 a R$ 30.000");
                    continue;
                }
                break;

            } catch (InputMismatchException e) {
                System.err.println("Valor Inválido!");
                sc.next();
            }

        }

        Calculo.calcularINSS();
        Calculo.calcularIRPF();
        Calculo.calcularPlanoSaude();

        while (true) {
            try {
                System.out.println("Informe a quantidade de horas extras: ");
                int horasExtras = sc.nextInt();
                if (horasExtras < 0) {
                    System.err.println("A quantidade de hora extra deve ser nula ou positiva!");
                    continue;
                }
                Calculo.calcularHorasExtras(horasExtras);
                Calculo.calcularSalarioLiquido();
                break;


            } catch (InputMismatchException e) {
                System.err.println("Valor Inválido");
                sc.next();
            }
        }
        sc.close();


    }
}
