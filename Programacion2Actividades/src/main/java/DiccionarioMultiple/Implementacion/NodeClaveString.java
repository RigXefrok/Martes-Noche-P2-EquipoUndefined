package DiccionarioMultiple.Implementacion;

public class NodeClaveString {

    private String clave;
    private NodeValorString primero; // cabeza de la lista de valores para esta clave
    private NodeClaveString next;

    public NodeClaveString(String clave, NodeValorString primero, NodeClaveString next) {
        this.clave = clave;
        this.primero = primero;
        this.next = next;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public NodeValorString getPrimero() {
        return primero;
    }

    public void setPrimero(NodeValorString primero) {
        this.primero = primero;
    }

    public NodeClaveString getNext() {
        return next;
    }

    public void setNext(NodeClaveString next) {
        this.next = next;
    }
}
