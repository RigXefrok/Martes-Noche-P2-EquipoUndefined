package org.example;

import Pilas.Implementacion.PilaDinamica;
import Pilas.Interfaces.PilaDinamicaTDA;
import Diccionarios.Dinamicos.Implementacion.DiccionarioSimpleDinamico;
import Diccionarios.Dinamicos.Interface.DiccionarioSimpleTDA;

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

    public void colasconPrioridad() {}

    public void conjuntos() {}

    public void diccionarios() {
        DiccionarioSimpleTDA d = new DiccionarioSimpleDinamico();

        System.out.println("=== " + "Diccionario Dinamico" + " ===");

        d.InicializarDiccionario();

        d.Agregar("Sebastian", 1111111111);
        d.Agregar("Jorge", 1111111112);
        d.Agregar("Agustin", 1111111113);
        d.Agregar("Manuel", 1111111114); // actualiza el valor de la clave 2

        System.out.println("Agenda de Contactos:");
        String[] claves1 = d.Claves();
        int[] valores1 = d.Valores();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i] + ": " + valores1[i]);
        }
        System.out.println("\n");

        d.Agregar("Facundo", 1111111115);

        System.out.println("Agenda de Contactos Actualizada (luego de agregar un contacto:");
        String[] claves2 = d.Claves();
        int[] valores2 = d.Valores();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i] + ": " + valores2[i]);
        }
    }

    public void diccionariosDinamicos() {}

}
