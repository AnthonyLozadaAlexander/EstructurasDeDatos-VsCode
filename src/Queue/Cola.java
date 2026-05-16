package Queue;

public interface Cola<T> {
    boolean colaVacia();

    void eliminarCola();

    T primero() throws ColaVacia;

    void encolar(T dato);

    T desencolar() throws ColaVacia;

    void mostrarEstadoCola();

}
