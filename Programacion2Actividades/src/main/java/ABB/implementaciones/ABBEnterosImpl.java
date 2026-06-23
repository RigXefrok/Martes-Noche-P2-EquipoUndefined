package ABB.implementaciones;

import ABB.interfaces.ABBEnteros;

public class ABBEnterosImpl implements ABBEnteros {
    private Nodo raiz;

    @Override
    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }

    private Nodo agregarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (actual.valor == valor) {
            return actual;
        }
        if (valor < actual.valor) {
            if (actual.izquierdo == null) {
                actual.izquierdo = new Nodo(valor);
                return actual;
            } else {
                agregarRecursivo(actual.izquierdo, valor);
                return actual;
            }
        } else {
            if (actual.derecho == null) {
                actual.derecho = new Nodo(valor);
            } else {
                agregarRecursivo(actual.derecho, valor);
            }
            return actual;
        }
    }

    @Override
    public boolean contiene(int valor) {
        return contieneRecursivo(raiz, valor);
    }

    private boolean contieneRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }
        if (actual.valor == valor) {
            return true;
        }
        return valor < actual.valor ? contieneRecursivo(actual.izquierdo, valor) : contieneRecursivo(actual.derecho, valor);
    }

    @Override
    public boolean eliminar(int valor) {
        if (!contiene(valor)) {
            return false;
        }

        raiz = eliminarRecursivo(raiz, valor);
        return true;
    }

    private Nodo eliminarRecursivo(Nodo actual, int valor) {
        if (actual.valor == valor) {
            if (actual.esHoja()) {
                return null;
            }
            if (actual.izquierdo != null && actual.derecho == null) {
                return actual.izquierdo;
            }
            if (actual.derecho != null && actual.izquierdo == null) {
                return actual.derecho;
            }
            assert actual.derecho != null;
            Nodo minimoDerecho = minimoRecursivo(actual.derecho);
            actual.valor = minimoDerecho.valor;
            actual.derecho = eliminarRecursivo(actual.derecho, minimoDerecho.valor);
            return actual;
        }

        if (actual.valor > valor) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, valor);
        } else {
            actual.derecho = eliminarRecursivo(actual.derecho, valor);
        }

        return actual;
    }

    @Override
    public int cantidad() {
        return cantidadRecursivo(raiz);
    }

    private int cantidadRecursivo(Nodo actual) {
        if (actual == null) {
            return 0;
        }
        int raiz = 1;

        int izq = actual.izquierdo != null ? cantidadRecursivo(actual.izquierdo) : 0;
        int der = actual.derecho != null ? cantidadRecursivo(actual.derecho) : 0;
        return raiz + izq + der;
    }

    @Override
    public int altura() {
        return alturaRecursivo(raiz);
    }

    private int alturaRecursivo(Nodo actual) {
        if (actual == null) {
            return 0;
        }
        int a = alturaRecursivo(actual.izquierdo) + 1;
        int b = alturaRecursivo(actual.derecho) + 1;
        return Math.max(a, b);
    }

    @Override
    public int minimo() {
        if (raiz == null) {
            throw new IllegalStateException("El árbol está vacío");
        }

        return minimoRecursivo(raiz).valor;
    }

    private Nodo minimoRecursivo(Nodo actual) {
        return actual.izquierdo == null ? actual : minimoRecursivo(actual.izquierdo);
    }

    @Override
    public int maximo() {
        if (raiz == null) {
            throw new IllegalStateException("El árbol está vacío");
        }

        return maximoRecursivo(raiz).valor;
    }

    private Nodo maximoRecursivo(Nodo actual) {
        return actual.derecho == null ? actual : maximoRecursivo(actual.derecho);
    }

    @Override
    public void mostrarInOrden() {
        mostrarInOrdenRecursivo(raiz);
    }

    private void mostrarInOrdenRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public void mostrarPreOrden() {
        mostrarPreOrdenRecursivo(raiz);
    }

    private void mostrarPreOrdenRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public void mostrarPostOrden() {
        mostrarPostOrdenRecursivo(raiz);
    }

    private void mostrarPostOrdenRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }
}
