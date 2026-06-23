package ABB;

import ABB.implementaciones.ABBEnterosImpl;
import ABB.interfaces.ABBEnteros;

public class TestRecursividadABB {
    public static void main(String[] args) {

        ABBEnteros abb = new ABBEnterosImpl();

        int profundidad = 0;

        try {
            for (int i = 1; i <= 50000; i++) {
                abb.agregar(i);
                profundidad++;
            }

        } catch (StackOverflowError e) {
            System.out.println(
                "StackOverflow en profundidad: " + profundidad
            );
        }

        System.out.println("Fin del programa");
    }
    // a. El metodo main esta agregando recorriendo los numeros del 1 al 50000 y agregandolos en orden a un arbol y contando cual es la profundidad del arbol.
    // b. El problema de realizar esto es que como los numeros que ingresan siempre son mayores que el anterior, se genera un arbol degenerado para la derecha.
    // No se esta aprovechando realmente el tda de abb sino que es una lista ordenada pero mas pesada que una lista normal, al estar desbalanceado el arbol.
    // c. ocurre un stackoverflow porque se llega al maximo de memoria disponible para la ejecucion del programa.
    // StackOverflow en profundidad: 61787
    // Fin del programa
}