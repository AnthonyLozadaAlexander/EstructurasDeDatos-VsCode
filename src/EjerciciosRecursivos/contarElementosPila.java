package EjerciciosRecursivos;

import Stack.TadPila;

public class contarElementosPila {
    public static void main(String[] args) {
        int count = 0;
        TadPila<Integer> pila = new TadPila<>("Pila");
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        pila.apilar(40);
        count = contarElementosPilaR(pila, count);
        System.out.println("Cantidad De Elementos En La Pila: " + count);
        
    }

    public static <T> int contarElementosPilaR(TadPila<T> pila, int count){
        TadPila<T> aux;
        aux = pila;
        if(aux.estaVacia()){
            return count;
        }

        T elemen = aux.desapilar();
        count++;

        return contarElementosPilaR(aux, count);


    }

}
