package casa2;

import casa1.Maria;

public class Joao extends Maria {
    void teste(){
        //System.out.println(super.segredo); // private
        //System.out.println(super.facoDentroDeCasa); // package
        System.out.println(super.familiaSabe); // protected
        System.out.println(super.todoMundoSabe); // public
    }
}
