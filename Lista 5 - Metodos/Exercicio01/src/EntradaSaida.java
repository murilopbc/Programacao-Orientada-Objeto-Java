import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaSaida {

   public static void Principal(){
       Scanner sc = new Scanner(System.in);

       double nota1, nota2, peso1, peso2;


       while (true) {
           try {
               System.out.println("Digite a nota 1: ");
               nota1 = sc.nextDouble();

               if (!Validacao.validarNota(nota1)) {
                   System.err.println("Nota 1 Inválida");
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
               System.out.println("Digite a nota 2: ");
               nota2 = sc.nextDouble();
               if (!Validacao.validarNota(nota2)) {
                   System.err.println("Nota 2 Inválida");
                   continue;
               }
               break;

           } catch (InputMismatchException e) {
               System.err.println("Valor Inválido");
               sc.next();
           }

       }

       int opt;

       while (true) {
           try {
               System.out.println("1-Calcular média aritmética\n2-Calcular média ponderada");
               opt = sc.nextInt();
               if (opt < 1 || opt > 2) {
                   System.err.println("Opção Inválida. Digite 1 ou 2!");
                   continue;
               }
               break;
           } catch (InputMismatchException e) {
               System.err.println("Valor Inválido");
               sc.next();
           }
       }

       if (opt == 1) {

           double media = Calculo.calcularMediaAritmetica(nota1,nota2);
           Resultado.mostrarResultado(media);


       } else {
           while (true) {
               try {
                   System.out.println("Digite o peso 1: ");
                   peso1 = sc.nextDouble();
                   if (!Validacao.validarPeso(peso1)) {
                       System.err.println("Digite um valor maior que 0");
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
                   System.out.println("Digite o peso 2: ");
                   peso2 = sc.nextDouble();
                   if (!Validacao.validarPeso(peso2)) {
                       System.err.println("Digite um valor");
                   }
                   break;


               } catch (InputMismatchException e) {
                   System.err.println("Valor Inválido");
                   sc.next();
               }
           }

           double mediaPonderada = Calculo.calcularMediaPonderada(nota1, nota2, peso1, peso2);
           Resultado.mostrarResultado(mediaPonderada);


       }
       sc.close();




   }

}
