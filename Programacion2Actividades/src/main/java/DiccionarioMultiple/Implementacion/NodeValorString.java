package DiccionarioMultiple.Implementacion;

public class NodeValorString {

    private String valor;
    private NodeValorString next;

    public NodeValorString(String valor, NodeValorString next) {
        this.valor = valor;
        this.next = next;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodeValorString getNext() {
        return next;
    }

    public void setNext(NodeValorString next) {
        this.next = next;
    }
}
