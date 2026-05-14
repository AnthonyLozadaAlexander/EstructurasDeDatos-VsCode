package Stack;

public class TadPila<T> implements Pila<T> {

    private NodoPila<T> nodoCima; // puntero principal de la cima
    private int tamanio; // contador de elementos
    private String nombre; // nombre para la pila

    public TadPila(String nombre) {
        this.nodoCima = null;
        this.tamanio = 0;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaVacia() {
        return nodoCima == null;
    }

    public void imprimirPila() {

    }

    public void apilar(T dato) {
        NodoPila<T> aux = new NodoPila<>(dato); // utilizamos un nodo aux para crear un nuevo nodo y poder asignar el
                                                // dato
        aux.siguiente = nodoCima; // toma el puntero de la cima y lo asigna al nuevo nodo aux
        nodoCima = aux;
        tamanio++;
    }

    public T desapilar() {
        T guardar;
        if (estaVacia()) {
            throw new IllegalStateException("La Pila se encuentra vacia");
        }
        guardar = nodoCima.dato;
        nodoCima = nodoCima.siguiente;
        tamanio--;
        return guardar;
    }

    public T cima() {
        if (estaVacia()) {
            throw new IllegalStateException("La Pila se encuentra vacia");
        }

        return nodoCima.dato;
    }

    public int numDatos() {
        return tamanio;
    }

}
