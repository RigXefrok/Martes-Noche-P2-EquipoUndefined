package ColasPrioridad.Interface;

public interface ColaPrioridadTDA {
    void InicializarColaPrioridad();
    void AcolarPrioridad(int dni, String nombre, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    int Primero();
    int Prioridad();
}
