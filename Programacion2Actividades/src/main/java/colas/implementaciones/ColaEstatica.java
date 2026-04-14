package colas.implementaciones;


import colas.interfaces.ColaTDA;

public class ColaEstatica implements ColaTDA {

    private static final int MAX = 100;
    private int[] datos;
    private int cantidad;

    @Override
    public void inicializarCola() {
        datos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void acolar(int x) {
        if (cantidad < MAX) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void desacolar() {
        if (!this.colaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public int primero() {
        return datos[0];
    }

    @Override
    public boolean colaVacia() {
        return cantidad == 0;
    }
}
