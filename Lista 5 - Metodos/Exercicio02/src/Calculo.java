public class Calculo {
    public static double calcularINSS(double salarioBruto){
        return salarioBruto * 0.2;
    }

    public static double calcularIRPF(double salarioBruto){
        return salarioBruto * 0.1;
    }
    public static double calcularPlanoSaude(double salarioBruto){
        return salarioBruto * 0.05;
    }

    public static double calcularHorasExtras(double salarioBruto, int horasExtras){
        double valorHoraNormal = salarioBruto / 160;
        double valorHoraExtra = salarioBruto * 1.5;
        return horasExtras * valorHoraExtra;
    }

    public static double calcularSalarioLiquido(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras){
        return salarioBruto - descontoINSS - descontoIRPF - descontoPlanoSaude + acrescimoHorasExtras;
    }
}
