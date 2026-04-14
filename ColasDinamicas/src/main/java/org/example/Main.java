package org.example;

import colas.Implementacion.ColaDinamica;

public class Main {
    static void main() {
        filaDelCajero();
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

    static void padronElectoral() {

    }
}
