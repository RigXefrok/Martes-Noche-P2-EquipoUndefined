package conjuntos.Interface;

public interface ConjuntoTDA {
    void inicializarConjunto();
    void agregar(int x);
    void sacar(int x);
    boolean conjuntoVacio();
    boolean pertenece(int x);
    int elegir();
}
