package estruturadedados.queue;

/*
 QUEUE ou Fila,
 F  I  F  O => Fist In First Out.  quem entra, vai para o final da fila,
 quem chega primeiro aparece primeiro
 O ultimo elemento da finla aponta para o penultimo, que aponta para o da frente, e assim por diate.
 O primeiro elemento aponta para nulo.
  */


public class Node {

    private Object object;  // Pode incluir todos os objetos do Java.   objectc minusculo ( conteudo do no)
    private Node refNode;


    // cont padrão
    public Node() {}

    // contrutor
    public Node(Object object){
        this.refNode = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getRefNode() {
        return refNode;
    }

    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
