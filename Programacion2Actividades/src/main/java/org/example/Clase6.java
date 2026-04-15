package org.example;
import DiccionarioMultiple.Implementacion.DiccionarioMultipleDinamicoString;
import DiccionarioMultiple.Interface.DiccionarioMultipleTDAString;

import ColasPrioridad.Implementacion.ColaPrioridadDinamica;
import ColasPrioridad.Interface.ColaPrioridadTDA;
import colas.implementaciones.ColaDinamica;
import conjuntos.Implementacion.ConjuntoDinamico;
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

    public void diccionariosDinamicos() {
        System.out.println("Diccionarios multiples");
        DiccionarioMultipleTDAString d = new DiccionarioMultipleDinamicoString();

        d.InicializarDiccionario();

        d.Agregar("facil", "sencillo");
        d.Agregar("facil", "simple");
        d.Agregar("facil", "claro");
        d.Agregar("hablar", "conversar");
        d.Agregar("hablar", "platicar");

        System.out.println("Palabras almacenadas:");
        String[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        System.out.println("Sinonimos de hablar:");
        String[] valores7 = d.Recuperar("hablar");
        for (int i = 0; i < valores7.length; i++) {
            System.out.println(valores7[i]);
        }

        d.EliminarValor("hablar", "platicar");

        System.out.println("Sinonimos de hablar luego de eliminar platicar");
        String[] valores7b = d.Recuperar("hablar");
        for (int i = 0; i < valores7b.length; i++) {
            System.out.println(valores7b[i]);
        }

        d.Eliminar("hablar");

        System.out.println("Claves luego de eliminar la palabra hablar:");
        String[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
    }
}
