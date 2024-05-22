public class Calculo {

    static double descontoINSS = 0, descontoIRPF = 0,descontoPlanoSaude = 0,acrescimoHorasExtras = 0, salarioBruto;
    public static void calcularINSS(double salarioBruto){
        descontoINSS =  salarioBruto * 0.2;
        System.out.println("Desconto INSS: R$" + descontoINSS);

    }

    public static void calcularIRPF(double salarioBruto){
        double descontoIRPF =  salarioBruto * 0.1;
        System.out.println("Desconto IRPF: R$" + descontoIRPF);
    }

    public static void calcularPlanoSaude(double salarioBruto){
        double descontoPlanoSaude =  salarioBruto * 0.05;
        System.out.println("Desconto Plano de Saúde: R$" + descontoPlanoSaude);
    }

    public static void calcularHorasExtras(double salarioBruto, int horasExtras){
        double valorHoraNormal = salarioBruto / 160;
        double valorHoraExtra = salarioBruto * 1.5;
        double acrescimoHorasExtras = horasExtras * valorHoraExtra;
        System.out.println("Acréscimo de Horas Extras: R$" + acrescimoHorasExtras);
    }

    public static void calcularSalarioLiquido(){
        double salarioLiquido = salarioBruto - descontoINSS - descontoIRPF - descontoPlanoSaude + acrescimoHorasExtras;
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}







