public class Main {
    public static void main(String[] args) {

        Mensalista mensalista = new Mensalista(92903560, "Murilo", "Aprendiz", 4000);
        Horista horista = new Horista(93245673, "Caio","Operador de Manufatura 1", 240, 8.25);

        System.out.printf("Salário do Mensalista: %s é de %.2f\n", mensalista.nome, mensalista.receberSalario());
        System.out.printf("Salário do Horista: %s é de %.2f\n", horista.nome, horista.receberSalario());
        System.out.println(mensalista);
        System.out.println(horista);

        }
    }
