package colasPrioridad.Implementacion;

import colasPrioridad.Interface.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {

    private static final int MAX = 100;
    private int[] datos;
    private int[] prioridades;
    private int cantidad;

    @Override
    public void inicializarColaPrioridad() {
        datos = new int[MAX];
        prioridades = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void acolarPrioridad(int numero, int prioridad) {
        if (cantidad < MAX) {
            int i = cantidad - 1;

            // mueve a la derecha mientras la prioridad nueva sea mayor
            while (i >= 0 && prioridades[i] < prioridad) {
                datos[i + 1] = datos[i];
                prioridades[i + 1] = prioridades[i];
                i--;
            }

            datos[i + 1] = numero;
            prioridades[i + 1] = prioridad;
            cantidad++;
        }
    }

    @Override
    public void desacolar() {
        if (!this.colaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];
                prioridades[i] = prioridades[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public boolean colaVacia() {
        return cantidad == 0;
    }

    @Override
    public int primero() {
        return datos[0];
    }

    @Override
    public int prioridad() {
        return prioridades[0];
    }
}
