package org.example;

import conjuntos.Implementacion.ConjuntoABB;

public class PracticaArboles {
    public PracticaArboles() {
        ejercicio5();
        ejercicio7();
        ejercicio8();
        ejercicio9();
    }

    private void ejercicio5() {

    }

    private void ejercicio7() {

    }

    private void ejercicio8() {
        ConjuntoABB conjunto = new ConjuntoABB();
        conjunto.agregar(3);
        conjunto.agregar(4);
        conjunto.agregar(5);
        conjunto.agregar(3);

        System.out.println("La cantidad de elementos del conjunto es: " + conjunto.cantidad()); // 3
        System.out.println("El 3 pertenece al conjunto: " + conjunto.pertenece(3)); // true
        conjunto.sacar(3);
        System.out.println("El 3 pertenece al conjunto luego de eliminar el 3: " + conjunto.pertenece(3)); // false
        System.out.println("Elijo un elemento del conjunto: " + conjunto.elegir()); // 5

        ConjuntoABB conjuntoB = new ConjuntoABB();
        conjuntoB.agregar(5);
        conjuntoB.agregar(4);
        conjuntoB.agregar(1);

        ConjuntoABB interseccion = conjunto.interseccion(conjuntoB);
        System.out.println("\nLa interseccion del conjunto(4, 5) con el conjuntoB (5,4,1) es: ");
        while (!interseccion.conjuntoVacio()) { // se testea unicamente para mostrar cuales son los valores de la interseccion. El esperado es el 5 y 4.
            int valor = interseccion.elegir();
            System.out.println(valor);
            interseccion.sacar(valor);
        }
    }

    private void ejercicio9() {

    }


}
