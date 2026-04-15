package Diccionarios.Dinamicos.Implementacion;

import Diccionarios.Dinamicos.Interface.DiccionarioSimpleTDA;

public class DiccionarioSimpleDinamico implements DiccionarioSimpleTDA {

    private Node cabeza; // lista enlazada de pares clave-valor

    @Override
    public void InicializarDiccionario() {
        cabeza = null;
    }

    @Override
    public void Agregar(String clave, int valor) {
        Node curr = cabeza;

        // Si la clave ya existe, actualiza su valor.
        while (curr != null && curr.getClave() != clave) {
            curr = curr.getNext();
        }

        if (curr != null) {
            curr.setValor(valor);
        } else {
            cabeza = new Node(clave, valor, cabeza);
        }
    }

    @Override
    public void Eliminar(String clave) {
        Node curr = cabeza;
        Node prev = null;

        while (curr != null && curr.getClave() != clave) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                cabeza = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        }
    }

    @Override
    public String[] Claves() {
        int count = 0;
        Node curr = cabeza;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        String[] result = new String[count];
        curr = cabeza;
        for (int i = 0; i < count; i++) {
            result[i] = curr.getClave();
            curr = curr.getNext();
        }
        return result;
    }

    @Override
    public int[] Valores() {
        int count = 0;
        Node curr = cabeza;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        int[] result = new int[count];
        curr = cabeza;
        for (int i = 0; i < count; i++) {
            result[i] = curr.getValor();
            curr = curr.getNext();
        }
        return result;
    }
}
