package estruturadedados.stack;



/*

 L I F O =>   Last In  First Out  = PILHA
 Semelhante aos nós de uma lista simples, o que muda é a forma de manipular os dados.
 o nó de cima aponta para o de baixo, e o primeiro elemento aponta para null


 */
public class Node {

    private int dado;
    private Node refNode = null;

    // construtor
    public Node(int dado) {
        this.dado = dado;
    }

    public Node() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Node getRefNo() {
        return refNode;
    }

    public void setRefNo(Node reNo) {
        this.refNode = reNo;
    }


    @Override
    public String toString() {
        return "Stack{" +
                "dado=" + dado +
                '}';
    }
}
