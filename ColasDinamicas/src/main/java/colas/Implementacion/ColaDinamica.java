package colas.Implementacion;

import colas.Interface.ColaTDA;

public class ColaDinamica implements ColaTDA {

    private Node frente;
    private Node fondo;

    @Override
    public void inicializarCola() {
        frente = null;
        fondo = null;
    }

    @Override
    public void acolar(int x) {
      Node node = new Node(x, null);
        if (colaVacia()) {
            frente = node;
        } else {
            fondo.setNext(node);
        }
        fondo = node;
    }

    @Override
    public void desacolar() {
        if (!colaVacia()) {
            frente = frente.getNext();
            if (frente == null) {
                fondo = null;
            }
        }
    }

    @Override
    public int primero() {
        return frente.getData();
    }

    @Override
    public boolean colaVacia() {
        return frente == null;
    }
}