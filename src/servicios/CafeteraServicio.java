package servicios;

import java.util.Scanner;

import entidades.*;

public class CafeteraServicio {

    Scanner tecladoScanner = new Scanner(System.in);

    public Cafetera llenarCafetera() {

        Cafetera ca = new Cafetera();
        System.out.println("Ingrese la cantidad de litros de la cafetera: ");
        double litros = tecladoScanner.nextDouble();
        ca.setCantidadActual(litros);
        ca.setCapacidadMaxima(litros);
        return ca;

    }

    public  void servirTaza(Cafetera cafetera) {

        System.out.println("Ingrese el tamaño de la taza en mililitros: ");
        double tamanioTaza = tecladoScanner.nextDouble() / 1000;
        System.out.println("Sirviendo...");
        if (tamanioTaza > cafetera.getCantidadActual()) {
            if (cafetera.getCantidadActual() == 0) {
                System.out.println("No queda café en la máquina");
            } else {
                System.out.println("No hay suficiente café para llenar la taza, se le sirvió "
                        + cafetera.getCantidadActual() * 1000 + " mililitros");
                cafetera.setCantidadActual(0);
            }
        } else {
            System.out.println("Su café está listo, ¡que disfrutes!");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanioTaza);
            System.out.println("Quedan " + cafetera.getCantidadActual() * 1000 + " mililitros de café en la máquina.");

        }

    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera se vació con éxito");
    }

    public void agregarCafe(Cafetera cafetera) {

        System.out.println("Actualmente la cafetera tiene " + cafetera.getCantidadActual() * 1000 + " mililitros. Su capacidad máxima es de  " + cafetera.getCapacidadMaxima() * 1000 + " mililitros.");
        System.out.println("Ingrese la cantidad de mililitros de café que quiere agregarle ");
        double cantAgregar = tecladoScanner.nextDouble() / 1000;

        if (cantAgregar + cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
            System.out.println("La cantidad que quiere ingresar excede la capacidad de la máquina");
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual()+cantAgregar);
            System.out.println("Café agregado con éxito, ahora dispone de " + cafetera.getCantidadActual() * 1000 + " mililitros");
        }

    }

}
