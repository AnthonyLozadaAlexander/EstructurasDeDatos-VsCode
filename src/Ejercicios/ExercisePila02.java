package Ejercicios;

import Stack.TadPila;

public class ExercisePila02 {
    public static void main(String[] args) {
        TadPila<String> cajaDeHerramientas = new TadPila<>("Caja de Herramientas");
        String guardar;
        cajaDeHerramientas.apilar("Martillo");
        cajaDeHerramientas.apilar("Destornillador");
        cajaDeHerramientas.apilar("Llave Inglesa");
        cajaDeHerramientas.apilar("Clavos");

        System.out.println("\nHerramientas En La Caja");
        cajaDeHerramientas.imprimirPila();

        while (!cajaDeHerramientas.estaVacia()) {
            guardar = cajaDeHerramientas.desapilar();
            System.out.println("Se Extrajo De La Caja: [" + guardar + "]");
        }

        System.out.println("\nLa Caja De Herramientas Se Encuentra Vacia: " + cajaDeHerramientas.estaVacia());
        System.out.println("Tamanio Total De La Caja: " + cajaDeHerramientas.getTamanio());
    }

}
