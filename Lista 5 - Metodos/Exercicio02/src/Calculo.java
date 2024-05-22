public class Calculo {

    static double descontoINSS = 0, descontoIRPF = 0, descontoPlanoSaude = 0, acrescimoHorasExtras = 0, salarioBruto;

    public static void calcularINSS() {
        descontoINSS = salarioBruto * 0.2;
        System.out.println("Desconto INSS: R$" + descontoINSS);

    }

    public static void calcularIRPF() {
        descontoIRPF = salarioBruto * 0.1;
        System.out.println("Desconto IRPF: R$" + descontoIRPF);
    }

    public static void calcularPlanoSaude() {
        descontoPlanoSaude = salarioBruto * 0.05;
        System.out.println("Desconto Plano de Saúde: R$" + descontoPlanoSaude);
    }

    public static void calcularHorasExtras(int horasExtras) {
        double valorHoraNormal = salarioBruto / 160;
        double valorHoraExtra = valorHoraNormal * 1.5;
        acrescimoHorasExtras = horasExtras * valorHoraExtra;
        System.out.println("Acréscimo de Horas Extras: R$" + acrescimoHorasExtras);
    }

    public static void calcularSalarioLiquido() {
        double salarioLiquido = (salarioBruto - descontoINSS - descontoIRPF - descontoPlanoSaude) + acrescimoHorasExtras;
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}







