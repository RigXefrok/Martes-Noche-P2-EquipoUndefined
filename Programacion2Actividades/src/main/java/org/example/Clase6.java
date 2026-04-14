package org.example;
import DiccionarioMultiple.Implementacion.DiccionarioMultipleDinamicoString;
import DiccionarioMultiple.Interface.DiccionarioMultipleTDAString;

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

    public void colas() {}

    public void colasconPrioridad() {}

    public void conjuntos() {}

    public void diccionarios() {}

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
