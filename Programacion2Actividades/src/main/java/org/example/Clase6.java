package org.example;

import colas.implementaciones.ColaDinamica;
import conjuntos.Implementacion.ConjuntoDinamico;

public class Clase6 {
    public Clase6() {
        System.out.println("hola mundo");
        pila();
        colas();
        colasconPrioridad();
        conjuntos();
        diccionarios();
        diccionariosDinamicos();
    }

    public void pila() {}

    public void colas() {
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

    public void colasconPrioridad() {}

    public void conjuntos() {
        ConjuntoDinamico padronElectoral = new ConjuntoDinamico();
        padronElectoral.inicializarConjunto();

        int juan = 43095421;
        int pedro = 39450213;
        int maria = 33401540;

        padronElectoral.agregar(juan);
        padronElectoral.agregar(pedro);
        padronElectoral.agregar(maria);
        padronElectoral.agregar(juan); // no puede ser agregado ya que esta dentro del conjunto
        System.out.println("juan esta dentro del padron? " + padronElectoral.pertenece(juan)); // true
        padronElectoral.sacar(juan); // remuevo a juan del conjunto.
        System.out.println("juan esta dentro del padron? " + padronElectoral.pertenece(juan)); // false
        System.out.println("Quien fue el ultimo que entro? " + padronElectoral.elegir());
    }

    public void diccionarios() {}

    public void diccionariosDinamicos() {}

}
