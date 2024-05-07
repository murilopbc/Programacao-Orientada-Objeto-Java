public class Resultado {

    public double mostrarResultado(double media){

        if (media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
        return media;
    }
}
