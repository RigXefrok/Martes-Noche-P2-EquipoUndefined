package org.example;

import ColasPrioridad.Implementacion.ColaPrioridadDinamica;
import ColasPrioridad.Interface.ColaPrioridadTDA;
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

    public void colas() {}

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

    public void conjuntos() {}

    public void diccionarios() {}

    public void diccionariosDinamicos() {}

}
