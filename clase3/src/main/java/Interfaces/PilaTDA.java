package Interfaces;

public interface PilaTDA<T> {
    void inicializarPila();
    void apilar(T x);
    void desapilar();
    T tope();
    boolean pilaVacia();
}
