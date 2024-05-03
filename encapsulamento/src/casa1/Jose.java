package casa1;

public class Jose {
    Maria esposa = new Maria();

    void teste(){
        //System.out.println(esposa.segredo); // private
        System.out.println(esposa.facoDentroDeCasa); // package
        System.out.println(esposa.familiaSabe); // protected
        System.out.println(esposa.todoMundoSabe); // public

    }
}
