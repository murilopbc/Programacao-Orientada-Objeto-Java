import java.util.Scanner;

public class EntradaSaida {
    double nota1;
    double nota2;
    int peso1;
    int peso2;


    public void retornaValoresEntrada(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite o peso da nota 1: ");
        peso1 = sc.nextInt();
        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite o peso da nota 2: ");
        peso2 = sc.nextInt();
        System.out.println("ok");

    }






}
