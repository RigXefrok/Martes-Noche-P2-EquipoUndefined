package implementaciones.EditorCodigo;

import java.util.Arrays;

public class Linea {
    int numero;
    String contenido;

    public Linea(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    };

    @Override
    public String toString() {
        return numero + '/' + contenido;
    }
}
