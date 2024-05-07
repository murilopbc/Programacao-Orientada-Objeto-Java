public class EntradaSaida {
    public static void mostrarFolhaPagamento(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras, double salarioLiquido) {
        System.out.println("Folha de Pagamento:");
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Desconto INSS: R$" + descontoINSS);
        System.out.println("Desconto IRPF: R$" + descontoIRPF);
        System.out.println("Desconto Plano de Saúde: R$" + descontoPlanoSaude);
        System.out.println("Acréscimo de Horas Extras: R$" + acrescimoHorasExtras);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
