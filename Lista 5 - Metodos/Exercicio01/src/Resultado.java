public class Resultado {



    public void mostrarResultado(double media){
        System.out.println("Sua média final é: "+ media);
        if (media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

    }
}
