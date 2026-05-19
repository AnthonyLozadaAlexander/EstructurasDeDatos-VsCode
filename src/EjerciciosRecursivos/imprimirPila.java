package EjerciciosRecursivos;

import Stack.TadPila;

public class imprimirPila {
    public static void main(String[] args) {

        TadPila<Integer> pila = new TadPila<>("Pila");
        pila.apilar(1);
        pila.apilar(2);
        imprimirPilaR(pila);
        
    }

    public static <T> T imprimirPilaR(TadPila<T> pila){
        TadPila<T> aux;
        aux = pila;
        T elemento;

        if(aux.estaVacia()){
            return null;
        }else{

            elemento = aux.desapilar();
            System.out.print(elemento + " ");
            return imprimirPilaR(aux);
        }








    }

}
