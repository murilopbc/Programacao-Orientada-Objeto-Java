public class Validacao {


    public static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 10;
    }

    public static boolean validarNotas(double nota1, double nota2) {
        return validarNota(nota1) && validarNota(nota2);
    }

    public static boolean validarPeso(double peso) {
        return peso >= 0 && peso <= 10;
    }

    public static boolean validarPesos(double peso1, double peso2) {
        return validarPeso(peso1) && validarPeso(peso2);
    }

}



