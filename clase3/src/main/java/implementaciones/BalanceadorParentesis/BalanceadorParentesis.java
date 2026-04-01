package implementaciones.BalanceadorParentesis;

import Interfaces.PilaTDA;

import java.util.Arrays;

public class BalanceadorParentesis implements PilaTDA<Character> {
    private static final int MAX = 100;
    private char[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    @Override
    public void inicializarPila() {
        datos = new char[MAX];
        cantidad = 0;
    }

    @Override
    public void apilar(Character x) {
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
    public Character tope() {
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
