package test;

import entidades.*;
import servicios.*;

public class CafeteraTest {

    public static void main(String[] args) {

        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cafetera1 = cs.llenarCafetera();

        cs.servirTaza(cafetera1);
        cs.agregarCafe(cafetera1);
        cs.servirTaza(cafetera1);
        cs.vaciarCafetera(cafetera1);

    }

}
