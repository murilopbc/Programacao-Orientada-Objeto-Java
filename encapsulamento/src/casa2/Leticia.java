package casa2;

import casa1.Maria;

public class Leticia {
    Maria sogra = new Maria();
    void teste(){
       // System.out.println(sogra.segredo); // private
       // System.out.println(sogra.facoDentroDeCasa); // package
        //System.out.println(sogra.familiaSabe); // protected
        System.out.println(sogra.todoMundoSabe); // public

    }
}
