package colasPrioridad.Interface;

public interface ColaPrioridadStringTDA {
    void inicializarColaPrioridad();
    void acolarPrioridad(String numero, int prioridad);
    void desacolar();
    boolean colaVacia();
    String primero();
    int prioridad();
}