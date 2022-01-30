package estruturadedados.listasduplamenteencadeadas;


/* O metodo add() na lista simples adiciona um nó apenas no final da lista
 *  Na lista dupla encadeada ele adiciona em qualquer lugar da lista
 * */


public class DoublyLinkedList<T> {

    private NoDuplo<T> firstNode;
    private NoDuplo<T> lastNode;

    // essa variavel armazena o tamanho da lista.
    private int sizeList;

    // por padrão os valores já são null e zero. mas essa viadagem de colocar no construtor fica melhor.
    public DoublyLinkedList() {
        firstNode = null;
        lastNode = null;
        this.sizeList = 0;
    }


    // mostra o elemento do tipo generico da lista no indice que a função recebe.
    public T get(int index){
        return this.getNode(index).getContent();
    }


    // metodo que recebe o elemento contido no indice e adiciona esse conteudo no final da lista
    // inicia null.
    public void add(T element){
        NoDuplo<T> newNode = new NoDuplo<>(element);
        newNode.setNextNode(null); // adiciona ao final da lista, aponta para nulo.
        newNode.setPreviousNode(lastNode); // aponta no previo para o antigo ultimo nó.

        if(firstNode == null){
            firstNode = newNode;
        }
        if(lastNode != null){
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode; // adiciona o novo nó como ultimo. final da lista
        sizeList++; // para cada elemento adicionado, aumenta 1 valor ao tamanho da lista.

    }


    private NoDuplo<T> getNode(int index){
        NoDuplo<T> assistantNode = firstNode; // o primeiro valor que o nó auxiliar assume é o valor do primeiro nó.
        for (int i =0; (i < index) && (assistantNode != null); i++ ) { // se i < indice ou no auxiliar != null para o laço.
            assistantNode = assistantNode.getNextNode();
        }
        return assistantNode;
    }


    // retorna o tamanho da lista
    public int size(){
        return this.sizeList;
    }


}
