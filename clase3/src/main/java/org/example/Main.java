package org.example;

import implementaciones.BalanceadorParentesis.BalanceadorParentesis;
import implementaciones.EditorCodigo.EditorCodigo;
import implementaciones.EditorCodigo.Linea;
import implementaciones.PilaString.PilaString;
import implementaciones.ReversionStrings.PilaChar;

public class Main {
    static void main() {
        // Historial de navegacion
        PilaString historialNavegacion = new PilaString();
        historialNavegacion.inicializarPila();
        historialNavegacion.apilar("fi.uba.ar");
        historialNavegacion.apilar("campus.utn.edu.ar");
        historialNavegacion.apilar("stackoverflow.com");
        System.out.println(historialNavegacion);
        System.out.println(historialNavegacion.tope());
        historialNavegacion.desapilar();
        System.out.println(historialNavegacion);
        System.out.println(historialNavegacion.tope());
        historialNavegacion.apilar("sebacapo.com");
        System.out.println(historialNavegacion);
        System.out.println(historialNavegacion.tope());

        // Editor de codigo
        EditorCodigo editorCodigo = new EditorCodigo();
        editorCodigo.inicializarPila();
        editorCodigo.apilar(new Linea(1, "console.log(\"hola mundo\");"));
        editorCodigo.apilar(new Linea(2, "const a = 20;"));
        editorCodigo.apilar(new Linea(1, "// aguante goku"));

        // Balanceador parentesis

        BalanceadorParentesis balanceadorParentesis = new BalanceadorParentesis();
        balanceadorParentesis.inicializarPila();

        String algortimo = "( ( a + b ) * c )";
        for (char letra : algortimo.toCharArray()) {
            if (letra == '(')
                balanceadorParentesis.apilar(letra);
            if (letra == ')')
                balanceadorParentesis.desapilar();
        }
        balanceadorParentesis.pilaVacia(); // si la pila esta vacia no hay parentesis por cerrar

        // Reversion de strings
        PilaChar reversionStrings = new PilaChar();
        reversionStrings.inicializarPila();
        PilaChar reversedQueue = new PilaChar();
        reversedQueue.inicializarPila();
        String palabra = "Hola mundo";
        for (char letra : palabra.toCharArray()) {
            reversionStrings.apilar(letra);
        }
        while (!reversionStrings.pilaVacia()) {
            char letra = reversionStrings.tope();
            reversedQueue.apilar(letra);
            reversionStrings.desapilar();
        }
        System.out.println(reversedQueue);

        // Pila de llamadas
        PilaString pilaLlamadas = new PilaString();
        pilaLlamadas.inicializarPila();
        pilaLlamadas.apilar("Main");
        pilaLlamadas.apilar("CalcularPromedio");
        pilaLlamadas.apilar("Sumar");
        System.out.println("La funcion llamada es: " + pilaLlamadas.tope() + "()");
        pilaLlamadas.desapilar();
        System.out.println("La funcion llamada es: " + pilaLlamadas.tope() + "()");
        pilaLlamadas.desapilar();
        System.out.println("La funcion llamada es: " + pilaLlamadas.tope() + "()");
        pilaLlamadas.desapilar();

        // navegacion de directorios
        PilaString navegacionDirectorios = new PilaString();
        navegacionDirectorios.inicializarPila();
        navegacionDirectorios.apilar("C:/");
        navegacionDirectorios.apilar("Usuarios");
        navegacionDirectorios.apilar("Documentos");
        System.out.println("Estoy en el directorio: " + navegacionDirectorios.tope());
        navegacionDirectorios.desapilar();
        System.out.println("Navego hacia atras");
        System.out.println("El directorio actual es: " + navegacionDirectorios.tope());
        navegacionDirectorios.desapilar();
        System.out.println("Navego hacia atras");
        System.out.println("El directorio actual es: " + navegacionDirectorios.tope());
        navegacionDirectorios.desapilar();
    }
}
