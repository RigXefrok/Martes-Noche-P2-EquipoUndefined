package implementaciones.PilaString;

import Interfaces.PilaTDA;

import java.util.Arrays;

public class PilaString implements PilaTDA<String> {
    private static final int MAX = 100;
    private String[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    @Override
    public void inicializarPila() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void apilar(String x) {
        if (cantidad < MAX) {
            datos[cantidad] = x; // guarda al final
            cantidad++;
        }
    }

    @Override
    public void desapilar() {
        if (!pilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public String tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean pilaVacia() {
        return cantidad == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(datos);
    }
}
