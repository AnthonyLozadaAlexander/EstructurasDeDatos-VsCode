package Queue;

public class NodoCola<T> {
    T dato;
    NodoCola<T> siguiente;

    NodoCola(T dato, NodoCola<T> siguiente) {
        dato = dato;
        siguiente = null;
    }

}
