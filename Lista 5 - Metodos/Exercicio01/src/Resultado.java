public class Resultado {

    public StringBuilder mediaFinal(double media){
        StringBuilder sb = new StringBuilder();
        if (media >= 7){
            sb.append("Aprovado, ");
        }else {
            sb.append("Reprovado, ");
        }
        sb.append("Media Final: ");
        sb.append(media);
        return sb;

    }
}
