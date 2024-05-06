import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opt;

        double nota1, nota2, peso1, peso2;


        while (true){
            System.out.println("Digite a nota 1: ");
            nota1 = sc.nextDouble();
            Validacao validacao = new Validacao();
            if(!validacao.validarNota1(nota1)){
                System.out.println("Nota 1 Invalida");
                continue;
            }
            System.out.println("Digite a nota 2: ");
            nota2 = sc.nextDouble();
            validacao.validarNota2(nota2);
            if(!validacao.validarNota1(nota2)) {
                System.out.println("Nota 1 Invalida");
                continue;
            }
            System.out.println("Digite a peso 1: ");
            peso1 = sc.nextDouble();
            System.out.println("Digite a peso 2: ");
            peso2 = sc.nextDouble();
            break;
        }

        while (true){
            try {
                System.out.println("1-Calcular média aritmética\n2-Calcular média ponderada");
                opt = sc.nextInt();
                if (opt < 1 ||  opt > 2){
                    continue;
                }
                break;

            }catch (InputMismatchException e){
                System.err.println("Valor Inválido");

            }
        }
        Calculo calc = new Calculo(nota1, nota2,peso1,peso2);
        if (opt == 1){
            calc.calcularMediaAritmetica();
            Resultado resultado = new Resultado();
            System.out.println(resultado.mediaFinal(calc.calcularMediaAritmetica()));

        }
        else {
            calc.calcularMediaPonderada();
            Resultado resultado = new Resultado();
            System.out.println(resultado.mediaFinal(calc.calcularMediaPonderada()));

        }


    }
}