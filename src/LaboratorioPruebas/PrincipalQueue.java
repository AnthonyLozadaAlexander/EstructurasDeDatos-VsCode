package LaboratorioPruebas;

import Queue.TadCola;

public class PrincipalQueue {
    public static void main(String[] args) {
        TadCola<Integer> colaInteger = new TadCola<>("Cola De Integer");
        colaInteger.encolar(2);
        colaInteger.encolar(3);
        colaInteger.imprimirCola();

    }

}
