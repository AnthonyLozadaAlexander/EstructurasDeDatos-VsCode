package Ejercicios;

import Stack.TadPila;

public class ExerciseInvertirPalabraPila {
    public static void main(String[] args) {
        String palabra = "Estructuras";
        String palabraInvertida = "";
        palabraInvertida = invertirPalabra(palabra);
        System.out.println("Palabra Original: " + palabra);
        System.out.println("Palabra Invertida: " + palabraInvertida);
    }

    public static String invertirPalabra(String palabra) {
        StringBuilder palabraInvertida = new StringBuilder();
        TadPila<Character> pila = new TadPila<>("Pila de Caracteres");
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i); // recorre y almacena cada letra de la palabra
            pila.apilar(letra);
        }
        char guardar; // char para guardar cada letra desapilada de la pila
        while (!pila.estaVacia()) {
            guardar = pila.desapilar();
            palabraInvertida.append(guardar);
        }

        return palabraInvertida.toString(); // toString() convertira el StringBuilder a un String Normal
    }

}
