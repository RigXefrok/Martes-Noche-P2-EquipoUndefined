package conjuntos.Implementacion;

import ABB.implementaciones.ABBEnterosImpl;
import conjuntos.Interface.ConjuntoTDA;

public class ConjuntoABB implements ConjuntoTDA {
    ABBEnterosImpl arbol;

    public ConjuntoABB() {
        inicializarConjunto();
    }

    @Override
    public void inicializarConjunto() {
        arbol = new ABBEnterosImpl();
    }

    @Override
    public void agregar(int x) {
        if (pertenece(x)) return;
        arbol.agregar(x);
    }

    @Override
    public void sacar(int x) {
        if (!pertenece(x)) return;
        arbol.eliminar(x);
    }

    @Override
    public boolean conjuntoVacio() {
        return arbol.altura() == 0;
    }

    @Override
    public boolean pertenece(int x) {
        return arbol.contiene(x);
    }

    @Override
    public int elegir() {
        return arbol.maximo();
    }

    public int cantidad() {
        return arbol.cantidad();
    }

    public ConjuntoABB interseccion(ConjuntoABB conjunto) {
        ConjuntoABB conjuntoA = new ConjuntoABB();
        ConjuntoABB aux = new ConjuntoABB();
        while (!conjunto.conjuntoVacio()) {
            int valor = conjunto.elegir();
            if (pertenece(valor)) {
                conjuntoA.agregar(valor);
            }
            conjunto.sacar(valor);
            aux.agregar(valor);
        }
        while (!aux.conjuntoVacio()) {
            int valor = aux.elegir();
            conjunto.agregar(valor);
            aux.sacar(valor);
        }
        return conjuntoA;
    }
}
