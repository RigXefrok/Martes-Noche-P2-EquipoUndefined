package org.example;

import colas.Implementacion.ColaEstatica;
import colas.Implementacion.ColaEstaticaString;
import colasPrioridad.Implementacion.ColaPrioridadEstatica;
import colasPrioridad.Implementacion.ColaPrioridadEstaticaString;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        filaDelCajero();
        impresoraLaboratorio();
        guardiaHospitalClinica();
        examenFinal();
        buffetFacultad();
        osScheduler();
        embarqueAerolineas();
        distribucionTickets();
    }

    static void filaDelCajero() {
        // Se trata de una cola estatica sin prioridad ya que a medida que los clientes van llegando van usando el cajero en orden de llegada. No hay un criterio donde uno que llega tenga prioridad sobre otros.
        // La cola va a ir almacenando los dni de los clientes.
        ColaEstatica filaDelCajero = new ColaEstatica();
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

    static void impresoraLaboratorio() {
        //
        ColaEstaticaString impresoraLaboratorio = new ColaEstaticaString();
        impresoraLaboratorio.inicializarCola();

        impresoraLaboratorio.acolar("c:/Documents/materias.pdf");
        impresoraLaboratorio.acolar("c:/Documents/cronograma.pdf");
        impresoraLaboratorio.acolar("c:/Documents/foto.jpg");
        impresoraLaboratorio.acolar("c:/Documents/archivo.txt");
        impresoraLaboratorio.acolar("c:/Documents/expensasMarzo2025.pdf");
        System.out.println(impresoraLaboratorio.colaVacia()); // false
        System.out.println("El primero en usar el cajero va a ser el: " + impresoraLaboratorio.primero());
        impresoraLaboratorio.desacolar(); //c:/Documents/materias.pdf
        impresoraLaboratorio.desacolar(); //c:/Documents/cronograma.pdf
        impresoraLaboratorio.desacolar(); //c:/Documents/foto.jpg
        impresoraLaboratorio.desacolar(); //c:/Documents/archivo.txt
        impresoraLaboratorio.desacolar(); //c:/Documents/expensasMarzo2025.pdf
        System.out.println(impresoraLaboratorio.colaVacia()); // true
    }

    static void guardiaHospitalClinica() {
        //
        ColaPrioridadEstatica guardiaHospital = new ColaPrioridadEstatica();
        guardiaHospital.inicializarColaPrioridad();
        guardiaHospital.acolarPrioridad(5987349, 100); // jubilado con bobazo
        guardiaHospital.acolarPrioridad(5984350, 1); // esposa del jubilado con bobazo
        guardiaHospital.acolarPrioridad(39209540, 1); // hombre con dolor de panza
        guardiaHospital.acolarPrioridad(47871349, 15); // mujer con fiebre
        System.out.println("El paciente que esta primero es: " + guardiaHospital.primero()); // jubilado con bobazo
        guardiaHospital.desacolar();
        System.out.println("El paciente que esta segundo es: " + guardiaHospital.primero()); // mujer con fiebre
        guardiaHospital.desacolar();
        System.out.println("El paciente que esta tercero es: " + guardiaHospital.primero()); // esposa del jubilado con bobazo
        guardiaHospital.desacolar();
        System.out.println("El paciente que esta cuarto es: " + guardiaHospital.primero()); // hombre con dolor de panza
        guardiaHospital.desacolar();
    }

    static void examenFinal() {
        ColaPrioridadEstaticaString examenFinal = new ColaPrioridadEstaticaString();
        examenFinal.inicializarColaPrioridad();

        examenFinal.acolarPrioridad("juan", 5);
        examenFinal.acolarPrioridad("pablo", 5);
        examenFinal.acolarPrioridad("matias", 10);
        examenFinal.acolarPrioridad("agustin", 5);
        examenFinal.acolarPrioridad("sebastian", 10);

        System.out.println("El sale primero es: " + examenFinal.primero()); // matias
        examenFinal.desacolar();
        System.out.println("El sale segundo es: " + examenFinal.primero()); // sebastian
        examenFinal.desacolar();
        System.out.println("El sale tercero es: " + examenFinal.primero()); // juan
        examenFinal.desacolar();
        System.out.println("El sale cuarto es: " + examenFinal.primero()); // pablo
        examenFinal.desacolar();
        System.out.println("El sale quinto es: " + examenFinal.primero()); // agustin
        examenFinal.desacolar();

        // si un regular llega a las 8.00h pm pero un promocionado llega a las 8.30h pm el promocionado va a salir antes que el regular.
    }

    static void buffetFacultad() {
        ColaEstaticaString buffetFacultad = new ColaEstaticaString();
        buffetFacultad.inicializarCola();
        buffetFacultad.acolar("Pepito");
        buffetFacultad.acolar("Juan");
        buffetFacultad.acolar("Jose");
        buffetFacultad.acolar("Jorge");
        System.out.println(buffetFacultad.colaVacia()); // false
        System.out.println("El primero en usar el cajero va a ser el: " + buffetFacultad.primero());
        buffetFacultad.desacolar(); //Pepito
        buffetFacultad.desacolar(); //Juan
        buffetFacultad.desacolar(); //Jose
        buffetFacultad.desacolar(); //Jorge
        System.out.println(buffetFacultad.colaVacia()); // true
    }

    static void osScheduler() {
        ColaPrioridadEstaticaString osScheduler = new ColaPrioridadEstaticaString();
        osScheduler.inicializarColaPrioridad();

        osScheduler.acolarPrioridad("proceso1", 50);
        osScheduler.acolarPrioridad("proceso2", 50);
        osScheduler.acolarPrioridad("proceso3", 10);
        osScheduler.acolarPrioridad("proceso4", 50);
        osScheduler.acolarPrioridad("proceso5", 10);

        System.out.println("Procesando: " + osScheduler.primero()); // proceso1
        osScheduler.desacolar();
        System.out.println("Procesando: " + osScheduler.primero()); // proceso2
        osScheduler.desacolar();
        System.out.println("Procesando: " + osScheduler.primero()); // proceso4
        osScheduler.desacolar();
        System.out.println("Procesando: " + osScheduler.primero()); // proceso3
        osScheduler.desacolar();
        System.out.println("Procesando: " + osScheduler.primero()); // proceso5
        osScheduler.desacolar();

        // si el sistema se sobrecarga al utilizar una cola con prioridad los primeros procesos en procesarse
        // son los de prioridad 50 (procesos del sistema) y despues de que se hayan procesado los procesos del
        // sistema se procesarán los procesos de aplicaciones como spotify con prioridad 10
    }

    static void embarqueAerolineas() {
        System.out.println("embarqueAerolineas");

        ColaPrioridadEstaticaString embarqueAerolineas = new ColaPrioridadEstaticaString();
        embarqueAerolineas.inicializarColaPrioridad();

        embarqueAerolineas.acolarPrioridad("pasajero1", 1);
        embarqueAerolineas.acolarPrioridad("pasajero2", 1);
        embarqueAerolineas.acolarPrioridad("pasajero3", 2);
        embarqueAerolineas.acolarPrioridad("pasajero4", 2);
        embarqueAerolineas.acolarPrioridad("pasajero5", 3);

        System.out.println("Abordando pasajero: " + embarqueAerolineas.primero()); // pasajero5
        embarqueAerolineas.desacolar();
        System.out.println("Abordando pasajero: " + embarqueAerolineas.primero()); // pasajero3
        embarqueAerolineas.desacolar();
        System.out.println("Abordando pasajero: " + embarqueAerolineas.primero()); // pasajero4
        embarqueAerolineas.desacolar();
        System.out.println("Abordando pasajero: " + embarqueAerolineas.primero()); // pasajero1
        embarqueAerolineas.desacolar();
        System.out.println("Abordando pasajero: " + embarqueAerolineas.primero()); // pasajero2
        embarqueAerolineas.desacolar();

    }

    static void distribucionTickets() {
        System.out.println("embarqueAerolineas");

        ColaPrioridadEstaticaString distribucionTickets = new ColaPrioridadEstaticaString();
        distribucionTickets.inicializarColaPrioridad();

        distribucionTickets.acolarPrioridad("No me anda el mouse", 1);
        distribucionTickets.acolarPrioridad("No me anda el teclado", 1);
        distribucionTickets.acolarPrioridad("No le anda el mouse al gerente", 900);
        distribucionTickets.acolarPrioridad("Sale humo del datancenter", 999);
        distribucionTickets.acolarPrioridad("Se prendio una luz roja en un servidor", 998);

        System.out.println("Procesando ticket: " + distribucionTickets.primero()); // proceso1
        distribucionTickets.desacolar();
        System.out.println("Procesando ticket: " + distribucionTickets.primero()); // proceso2
        distribucionTickets.desacolar();
        System.out.println("Procesando ticket: " + distribucionTickets.primero()); // proceso4
        distribucionTickets.desacolar();
        System.out.println("Procesando ticket: " + distribucionTickets.primero()); // proceso3
        distribucionTickets.desacolar();
        System.out.println("Procesando ticket: " + distribucionTickets.primero()); // proceso5
        distribucionTickets.desacolar();

    }
}
