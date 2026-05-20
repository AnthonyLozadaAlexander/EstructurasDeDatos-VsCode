package EjerciciosRecursivos;

import Stack.TadPila;

public class buscarElementoPila {
    public static void main(String[] args) {
        boolean encontrado = false;
        TadPila<Integer> pila = new TadPila<>("Pila");
        pila.apilar(1);
        pila.apilar(22);
        pila.apilar(100);
        pila.apilar(27);
        encontrado = buscarElementoPilaR(pila, 2);
        
        if(encontrado){
            System.out.println("El elemento si se encuentra en la Pila");
        }else{
            System.out.println("El elemento no se encuentra en la Pila");
        }

    }

    public static <T> boolean buscarElementoPilaR(TadPila<T> pila, T elemento){
        boolean resul = false;
        TadPila<T> aux;
        aux = pila;

        if(!aux.estaVacia()){
            T dato = aux.desapilar();
            if(dato.equals(elemento)){
                resul = true;
            }else{
                return buscarElementoPilaR(aux, elemento);
            }
        }

        return resul;

    }

}
