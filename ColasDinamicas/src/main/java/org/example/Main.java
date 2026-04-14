package org.example;

import colas.Implementacion.ColaDinamica;
import pilasDinamicas.Interface.PilaDinamicaTDA;
import pilasDinamicas.Implementacion.PilaDinamica;

public class Main {
    static void main() {
        filaDelCajero();

        PilaDinamicaTDA pila = new PilaDinamica();

        probarPilaDinamica("Pila Dinámica con Nodo", pila);

    }

    static void filaDelCajero() {

    }

    public static void probarPilaDinamica(String nombre, PilaDinamicaTDA pila) {
        System.out.println("=== " + nombre + " ===");

        pila.InicializarPila();

        pila.Apilar("fi.uba.com");
        pila.Apilar("campus.utn.edu.ar");
        pila.Apilar("stackoverflow.com");

        System.out.println("Tope luego de apilar fi.uba.com, campus.utn.edu.ar, stackoverflow.com:    " + pila.Tope()); // 30

        pila.Desapilar();
        System.out.println("Tope luego de desapilar una vez: " + pila.Tope()); // 20

        pila.Desapilar();
        System.out.println("Tope luego de desapilar otra vez: " + pila.Tope()); // 10

        pila.Desapilar();
        System.out.println("¿Pila vacía?: " + pila.PilaVacia()); // true

        System.out.println();
    }
}
