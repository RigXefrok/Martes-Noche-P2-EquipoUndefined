package colasPrioridad.Implementacion;

import colasPrioridad.Interface.ColaPrioridadStringTDA;

public class ColaPrioridadEstaticaString implements ColaPrioridadStringTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int[] prioridades;
    private int cantidad;

    @Override
    public void inicializarColaPrioridad() {
        datos = new String[MAX];
        prioridades = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void acolarPrioridad(String numero, int prioridad) {
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
    public String primero() {
        return datos[0];
    }

    @Override
    public int prioridad() {
        return prioridades[0];
    }
}
