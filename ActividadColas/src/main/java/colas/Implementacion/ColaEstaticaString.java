package colas.Implementacion;


import colas.Interface.ColaStringTDA;
import colas.Interface.ColaTDA;

public class ColaEstaticaString implements ColaStringTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad;

    @Override
    public void inicializarCola() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void acolar(String x) {
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
    public String primero() {
        return datos[0];
    }

    @Override
    public boolean colaVacia() {
        return cantidad == 0;
    }
}
