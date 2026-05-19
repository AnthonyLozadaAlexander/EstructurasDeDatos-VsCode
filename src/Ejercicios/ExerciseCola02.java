package Ejercicios;

import Queue.TadCola;

public class ExerciseCola02 {
    public static void main(String[] args) {
        TadCola<Integer> cola = new TadCola<>("Cola Edades");
        Integer mayorEdad = 0, menorEdad = 0;
        Integer guardar = 0;
        Integer[] edades = { 15, 22, 17, 30, 14, 45 };
        Integer[] edadMayor;
        Integer[] edadMenor;

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                guardar = edades[i];
                cola.encolar(guardar);
                mayorEdad = mayorEdad + 1;
            } else {
                guardar = edades[i];
                cola.encolar(guardar);
                menorEdad = menorEdad + 1;
            }
        }

        guardar = 0;
        System.out.println("Edades En La Cola");
        cola.imprimirCola();
        cola.mostrarEstadoCola();

        edadMayor = new Integer[mayorEdad];
        edadMenor = new Integer[menorEdad];

        Integer countMy = 0;
        Integer countMn = 0;
        while (!cola.colaVacia()) {
            guardar = 0;
            try {
                guardar = cola.desencolar();

                if (guardar >= 18) {
                    edadMayor[countMy] = guardar;
                    countMy = countMy + 1;
                } else {
                    edadMenor[countMn] = guardar;
                    countMn = countMn + 1;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nEdades Mayores De Edad: " + countMy);
        System.out.println("Edades Menores De Edad: " + countMn);
    }

}
