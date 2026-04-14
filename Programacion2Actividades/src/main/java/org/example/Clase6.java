package org.example;

import ColasPrioridad.Implementacion.ColaPrioridadDinamica;
import ColasPrioridad.Interface.ColaPrioridadTDA;
import colas.implementaciones.ColaDinamica;
import conjuntos.Implementacion.ConjuntoDinamico;
import Pilas.Implementacion.PilaDinamica;
import Pilas.Interfaces.PilaDinamicaTDA;

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



    public void pila() {

        PilaDinamicaTDA pila = new PilaDinamica();


        System.out.println("=== " + "Probando Pila Dinamica" + " ===");

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

    public void colasconPrioridad() {

        ColaPrioridadTDA cola = new ColaPrioridadDinamica();

        cola.InicializarColaPrioridad();
        System.out.println("=== " + "Probando Cola con Prioridad Dinamica" + " ===");
        System.out.println("¿Cola vacía?: " + cola.ColaVacia());

        cola.AcolarPrioridad(20345768, "Veronica Andrada", 3);
        cola.AcolarPrioridad(13452756, "Jose Perez",10);
        cola.AcolarPrioridad(38456987, "Ana Gomez",1);
        cola.AcolarPrioridad(40223143, "Marcelo Morales",10);

        System.out.println("Primero: " + cola.Primero());

        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.Desacolar();
        System.out.println("Luego de desacolar:");
        System.out.println("Primero: " + cola.Primero());
        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.Desacolar();
        System.out.println("Luego de desacolar:");
        System.out.println("Primero: " + cola.Primero());
        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.Desacolar();
        System.out.println("Luego de desacolar:");
        System.out.println("Primero: " + cola.Primero());
        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.Desacolar();
        System.out.println("¿Cola vacía?: " + cola.ColaVacia());


    }

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
