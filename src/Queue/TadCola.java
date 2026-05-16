package Queue;

public class TadCola<T> implements Cola<T> {
    private NodoCola<T> primero;
    private NodoCola<T> ultimo;
    private String nombreCola;

    public TadCola(String nombreCola) {
        this.nombreCola = nombreCola;
        primero = null;
        ultimo = null;
    }

    @Override
    public boolean colaVacia() {
        return primero == null;
    }

    @Override
    public void eliminarCola() {
        // throw new UnsupportedOperationException("Unimplemented method
        // 'eliminarCola'");
    }

    @Override
    public void encolar(T dato) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'encolar'");
    }

}
