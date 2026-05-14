package Stack;

public class TadPila<T> {

    private NodoPila<T> nodoCima; // puntero principal de la cima
    private int tamanio; // contador de elementos

    public TadPila() {
        this.nodoCima = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return nodoCima == null;
    }

    public void apilar(T dato) {
        NodoPila<T> aux = new NodoPila<>(dato);
        aux.siguiente = nodoCima;
        nodoCima = aux;
        tamanio++;
    }

}
