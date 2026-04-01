package implementaciones.EditorCodigo;

import Interfaces.PilaTDA;

public class EditorCodigo implements PilaTDA<Linea> {
    private static final int MAX = 100;
    private Linea[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    @Override
    public void inicializarPila() {
        datos = new Linea[MAX];
        cantidad = 0;
    }

    @Override
    public void apilar(Linea x) {
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
    public Linea tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean pilaVacia() {
        return cantidad == 0;
    }
}
