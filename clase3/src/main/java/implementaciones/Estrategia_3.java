package implementaciones;

import Interfaces.PilaTDA;

public class Estrategia_3 implements PilaTDA<Integer> {

    private static final int MAX = 100;
    private int[] datos;

    @Override
    public void inicializarPila() {
        datos = new int[MAX + 1];
        datos[0] = 0; // en la posición 0 se guarda la cantidad de elementos
    }

    @Override
    public void apilar(Integer x) {
        if (datos[0] < MAX) {
            datos[0]++;
            datos[datos[0]] = x;
        }
    }

    @Override
    public void desapilar() {
        if (!pilaVacia()) {
            datos[0]--;
        }
    }

    @Override
    public Integer tope() {
        return datos[datos[0]];
    }

    @Override
    public boolean pilaVacia() {
        return datos[0] == 0;
    }
}
