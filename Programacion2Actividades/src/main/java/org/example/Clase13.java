package org.example;

import ColasPrioridad.Implementacion.ColaPrioridadDinamica;
import ColasPrioridad.Interface.ColaPrioridadTDA;
import DiccionarioMultiple.Implementacion.DiccionarioMultipleDinamicoString;
import DiccionarioMultiple.Interface.DiccionarioMultipleTDAString;
import Diccionarios.Dinamicos.Implementacion.DiccionarioSimpleDinamico;
import Diccionarios.Dinamicos.Interface.DiccionarioSimpleTDA;
import Pilas.Implementacion.PilaDinamica;
import Pilas.Interfaces.PilaDinamicaTDA;
import colas.implementaciones.ColaDinamica;
import conjuntos.Implementacion.ConjuntoDinamico;

public class Clase13 {
    public Clase13() {
        System.out.println("hola mundo");
        bloque1();
        bloque2();
        bloque3();
    }



    public void bloque1() {
    bloque1Ejercicio1();
    bloque1Ejercicio2();
    bloque1Ejercicio3();
    bloque1Ejercicio4();
    bloque1Ejercicio5();
    bloque1Ejercicio6();
    bloque1Ejercicio7();
    bloque1Ejercicio8();
    }

    public void bloque2() {

    }

    public void bloque3() {

    }

    public void bloque1Ejercicio1() {
//        Insertá en un ABB inicialmente vacío los siguientes valores en este orden: 50, 30, 70, 20, 40, 60, 80.
//        1.Describí el árbol resultante nodo por nodo.
//        2.Indicá el recorrido In-orden y la altura del árbol medida en aristas (hoja = altura 0).
//                  50
//                /    \
//              30      70
//             /  \     /  \
//            20  40   60  80
//        Recorrido in-orden: 20, 30, 40 50, 60, 70, 80
//        Altura = 3
    }

    public void bloque1Ejercicio2() {
//        Sobre el árbol anterior, trazá la búsqueda del valor 55.
//        1.Indicá la secuencia de nodos visitados (→).
//        50 -> 70 -> 60 -> not found
//        2.Indicá la cantidad de comparaciones de clave (el chequeo contra null no cuenta).
//        se realizaron 3 comparaciones de claves.
    }

    public void bloque1Ejercicio3() {
//        Sobre el árbol del Ejercicio 1, eliminá el nodo 30 usando el criterio del sucesor in-orden.
//        1.Indicá el caso de eliminación (hoja / un hijo / dos hijos).
//        caso de eliminacion de hoja simplemente la hoja ahora apunta a null.
//        caso de un hijo el hijo reemplaza al padre
//        caso de dos hijos o mas, creas un subarbol desde el nodo 30, luego la recorres succesor in-orden y los agregas al arbol inicial.
//        El caso de 30 es el de dos hijos.
//        2.Id entificá el valor del sucesor in-orden y describí el árbol resultante.
//                 50
//               /    \
//              20      70
//                \     /  \
//                40   60  80
//        subarbol succesor in-orden (I-R-D): 20 -> 30 -> 40
    }

    public void bloque1Ejercicio4() {
//        Dado un AVL con los valores 30, 20, 40, 10, 25 insertados en ese orden.
//        1.Describí la estructura nodo por nodo.
    }

    public void bloque1Ejercicio5() {
//        En un AVL que contiene 30 y 20, insertá el valor 10.
//        1.Identificá el nodo desbalanceado y su bf.
//        2.Indicá el tipo de rotación y describí el árbol final rebalanceado.
    }

    public void bloque1Ejercicio6() {
//        En un AVL que contiene 30 y 20, insertá el valor 25.
//        1.Identificá el nodo desbalanceado y su bf.
//        2.Detallá los movimientos de la rotación doble y describí el árbol final.
    }

    public void bloque1Ejercicio7() {
//        Definí las reglas de un Árbol B de orden 3 (orden = cantidad máxima de hijos).
//        1.Cantidad máxima de claves por nodo.
//        2.Cantidad mínima de claves por nodo no raíz.
    }

    public void bloque1Ejercicio8() {
//        En un Árbol B de orden 3 vacío, insertá 10, 20, 30.
//        1.Explicá la condición de overflow al insertar el 30.
//        2.Indicá la clave promocionada y describí la estructura final (Raíz y Hojas).
    }
}
