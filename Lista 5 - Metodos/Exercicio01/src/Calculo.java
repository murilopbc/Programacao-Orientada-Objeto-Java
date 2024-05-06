public class Calculo extends EntradaSaida {
    public Calculo(double nota1, double nota2, double peso1, double peso2) {
        super(nota1, nota2, peso1, peso2);
    }

    public double calcularMediaAritmetica(){

        return (nota1 + nota2) / 2;


    }
    public double calcularMediaPonderada(){
        return (nota1 * peso1) + (nota2 * peso2) / (peso1 + peso2);

    }
}
