
public class Main {
    public static void main(String[] args) {
        Prioridade prioridade = Prioridade.valueOf("URGENTE");

        switch (prioridade){
            case URGENTE -> System.out.println("Prioridade total: resolver agora");
            case ALTA -> System.out.println("Prioridade alta: resolver o mais cedo possível");
            case MEDIA -> System.out.println("Prioridade média: resolver dentro do prazo");
            case BAIXA -> System.out.println("Prioridade baixa: resolver quando houver disponibilidade");
        }
    }
}