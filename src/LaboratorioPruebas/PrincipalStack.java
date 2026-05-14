package LaboratorioPruebas;

import Stack.*; // importa todo el package de Stack

public class PrincipalStack {
    public static void main(String[] args) {
        Integer datoSave = 0;
        TadPila<Integer> pilaInteger = new TadPila<>("Pila De Integer");
        pilaInteger.imprimirPila(); // detecta que la pila esta vacia
        pilaInteger.apilar(3);
        pilaInteger.apilar(4);
        pilaInteger.apilar(5);

        pilaInteger.imprimirPila();
    }

}
