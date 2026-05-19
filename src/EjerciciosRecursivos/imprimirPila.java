package EjerciciosRecursivos;

import Stack.TadPila;

public class imprimirPila {
    public static void main(String[] args) {

        TadPila<Integer> pila = new TadPila<>("Pila");
        pila.apilar(1);
        pila.apilar(2);
        imprimirPila(pila);
        
    }

    public static <T> T imprimirPila(TadPila<T> pila){
        TadPila<T> aux;
        aux = pila;
        T elemento;

        if(aux.estaVacia()){
            return null;
        }else{

            elemento = aux.desapilar();
            System.out.print(elemento + " ");
            return imprimirPila(aux);
        }








    }

}
