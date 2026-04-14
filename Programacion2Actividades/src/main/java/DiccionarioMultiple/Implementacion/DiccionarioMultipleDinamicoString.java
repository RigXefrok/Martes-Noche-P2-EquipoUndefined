package DiccionarioMultiple.Implementacion;

import DiccionarioMultiple.Interface.DiccionarioMultipleTDAString;
import java.util.Objects;

public class DiccionarioMultipleDinamicoString implements DiccionarioMultipleTDAString {

    // Lista enlazada de claves; cada clave apunta a su propia lista de valores.
    private NodeClaveString cabeza;

    @Override
    public void InicializarDiccionario() {
        cabeza = null;
    }

    @Override
    public void Agregar(String clave, String valor) {
        NodeClaveString nodoClave = buscarClave(clave);

        if (nodoClave == null) {
            // Clave nueva: crear nodo de clave con un primer valor.
            NodeValorString nodoValor = new NodeValorString(valor, null);
            cabeza = new NodeClaveString(clave, nodoValor, cabeza);
        } else {
            // Clave existente: agregar valor solo si no está repetido.
            if (!existeValor(nodoClave, valor)) {
                nodoClave.setPrimero(new NodeValorString(valor, nodoClave.getPrimero()));
            }
        }
    }

    @Override
    public void EliminarValor(String clave, String valor) {
        NodeClaveString nodoClave = buscarClave(clave);
        if (nodoClave == null) return;

        NodeValorString curr = nodoClave.getPrimero();
        NodeValorString prev = null;

        while (curr != null && !Objects.equals(curr.getValor(), valor)) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                nodoClave.setPrimero(curr.getNext());
            } else {
                prev.setNext(curr.getNext());
            }

            // Si la clave quedó sin valores, se elimina también.
            if (nodoClave.getPrimero() == null) {
                Eliminar(clave);
            }
        }
    }

    @Override
    public void Eliminar(String clave) {
        NodeClaveString curr = cabeza;
        NodeClaveString prev = null;

        while (curr != null && !Objects.equals(curr.getClave(), clave)) {
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
    public String[] Recuperar(String clave) {
        NodeClaveString nodoClave = buscarClave(clave);
        if (nodoClave == null) return new String[0];

        int count = 0;
        NodeValorString curr = nodoClave.getPrimero();
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        String[] result = new String[count];
        curr = nodoClave.getPrimero();
        for (int i = 0; i < count; i++) {
            result[i] = curr.getValor();
            curr = curr.getNext();
        }
        return result;
    }

    @Override
    public String[] Claves() {
        int count = 0;
        NodeClaveString curr = cabeza;
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

    private NodeClaveString buscarClave(String clave) {
        NodeClaveString curr = cabeza;
        while (curr != null && !Objects.equals(curr.getClave(), clave)) {
            curr = curr.getNext();
        }
        return curr;
    }

    private boolean existeValor(NodeClaveString nodoClave, String valor) {
        NodeValorString curr = nodoClave.getPrimero();
        while (curr != null) {
            if (Objects.equals(curr.getValor(), valor)) return true;
            curr = curr.getNext();
        }
        return false;
    }
}
