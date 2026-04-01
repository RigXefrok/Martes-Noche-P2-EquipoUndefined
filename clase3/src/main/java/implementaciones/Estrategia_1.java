package implementaciones;

import Interfaces.PilaTDA;

public class Estrategia_1 implements PilaTDA<Integer> {

    private static final int MAX = 100;
    private int[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    @Override
    public void inicializarPila() {
        datos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void apilar(Integer x) {
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
    public Integer tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean pilaVacia() {
        return cantidad == 0;
    }
}