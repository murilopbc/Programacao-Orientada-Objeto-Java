import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, peso1, peso2;

        // Loop para entrada da primeira nota
        while (true){
            try {
                System.out.println("Digite a nota 1: ");
                nota1 = sc.nextDouble();
                Validacao validacao = new Validacao();
                if(!validacao.validarNota1(nota1)){
                    System.out.println("Nota 1 Inválida");
                    continue;
                }
                break;

            }catch (InputMismatchException e){
                System.err.println("Valor Inválido");
                sc.next();

            }

        }

        // Loop para entrada da segunda nota
        while (true){
            try {
                System.out.println("Digite a nota 2: ");
                nota2 = sc.nextDouble();
                Validacao validacao = new Validacao();
                if(!validacao.validarNota2(nota2)){
                    System.out.println("Nota 2 Inválida");
                    continue;
                }
                break;

            }catch (InputMismatchException e){
                System.err.println("Valor Inválido");
                sc.next();
            }

        }

        int opt;

        // Loop para entrada da opção de cálculo
        while (true){
            try {
                System.out.println("1-Calcular média aritmética\n2-Calcular média ponderada");
                opt = sc.nextInt();
                if (opt < 1 ||  opt > 2){
                    System.out.println("Opção Inválida");
                    continue;
                }
                break;
            } catch (InputMismatchException e){
                System.err.println("Valor Inválido");
                sc.next(); // Limpa o buffer
            }
        }


        // Se a opção for média ponderada, solicita os pesos
        if (opt == 2){
            System.out.println("Digite o peso 1: ");
            peso1 = sc.nextDouble();
            System.out.println("Digite o peso 2: ");
            peso2 = sc.nextDouble();
            // Calcula e exibe a média com base na opção escolhida
            Calculo calc = new Calculo();
            Resultado resultado = new Resultado();
            double mediaPonderada = calc.calcularMediaPonderada(nota1, nota2, peso1, peso2);
            System.out.println("Média Ponderada: " + resultado.mediaFinal(mediaPonderada));
        }
        else {
            Calculo calc = new Calculo();
            calc.calcularMediaAritmetica(nota1, nota2);
            Resultado resultado = new Resultado();
            System.out.println(resultado.mediaFinal(calc.calcularMediaAritmetica(nota1, nota2)));
        }


    }
}
