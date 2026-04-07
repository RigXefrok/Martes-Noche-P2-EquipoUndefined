package colasPrioridad.Interface;

public interface ColaPrioridadTDA {
    void inicializarColaPrioridad();
    void acolarPrioridad(int numero, int prioridad);
    void desacolar();
    boolean colaVacia();
    int primero();
    int prioridad();
}