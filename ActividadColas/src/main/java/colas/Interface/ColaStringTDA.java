package colas.Interface;

public interface ColaStringTDA {
    void inicializarCola();
    void acolar(String x);
    void desacolar();
    String primero();
    boolean colaVacia();
}