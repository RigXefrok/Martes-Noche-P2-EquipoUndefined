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
        ColaDinamica filaDelCajero = new ColaDinamica();
        filaDelCajero.inicializarCola();
        filaDelCajero.acolar(45001002);
        filaDelCajero.acolar(45001003);
        filaDelCajero.acolar(45001004);
        filaDelCajero.acolar(45001005);
        filaDelCajero.acolar(45001006);
        System.out.println(filaDelCajero.colaVacia()); // false
        System.out.println("El primero en usar el cajero va a ser el: " + filaDelCajero.primero());
        filaDelCajero.desacolar(); //45001002
        filaDelCajero.desacolar(); //45001003
        filaDelCajero.desacolar(); //45001004
        filaDelCajero.desacolar(); //45001005
        filaDelCajero.desacolar(); //45001006
        System.out.println(filaDelCajero.colaVacia()); // true
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
