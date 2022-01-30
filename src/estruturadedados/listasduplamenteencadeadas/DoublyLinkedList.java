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


    // metodo para adicionar um elemento em qualquer lugar da lista.
    public void add(int index, T element) {
        NoDuplo<T> assistantNode = getNode(index); // usa metodo getNode() para retornar o nó do indice.
        NoDuplo<T> newNode = new NoDuplo<>(element);
        newNode.setNextNode(assistantNode);

        // remove o duplo engademanto para a inserção do novo nó.
        if(newNode.getNextNode() != null){
            newNode.setPreviousNode(assistantNode.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);

        } else { // caso seja null, a posição em que o indice se encontra sáo as extremidades
            newNode.setPreviousNode(lastNode); // seta a referência para o nó anterior. que até então era o ultimo nó.
            lastNode = newNode; //atribui o valor;
        }

        // se for entre dois elementos.
        if(index == 0){ // se for o primeiro nó.
            firstNode = newNode;

        } else { // se estiver no meio entre dois nós.
            newNode.getPreviousNode().setPreviousNode(newNode);
        }
    }



    public void remove(int index){

        // remoção do primeiro nó.
        if(index == 0){ // se estive no primeiro nó
            firstNode = firstNode.getNextNode(); // primeiro nó recebe a referência do nó seguinte.
            if(firstNode != null){ // ouver mais elemento
                firstNode.setPreviousNode(null); // antigo primeiro nó é removido.
            }

        }else{ // caso não seja o primeiro nó.
            NoDuplo<T> assistantNode = getNode(index);
            assistantNode.getPreviousNode().setNextNode(assistantNode.getNextNode()); // aqui acontece a troca de referências dos nós,  n0 deixa a ref do n1 e  passa para o n2.

            if(assistantNode != lastNode){
                assistantNode.getNextNode().setPreviousNode(assistantNode.getPreviousNode()); // aqui acontece a troca de referências dos nós,  n1 deixa a ref do n2 e  passa para o n0.

            }else {

                lastNode = assistantNode;
            }
        }
        this.sizeList--; // diminui um valor no tamanho da lista
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


    @Override
    public String toString() {
        String strReturn = "";

        //percorre a lista entrrando pelo primeiro nó e indo até o final, pelo seu tamanho.
        NoDuplo<T> assistantNode = firstNode;
        for (int i = 0; i < size(); i++){
            strReturn += "[ No { Conteudo =" + assistantNode.getContent() +" }] ---> ";
            assistantNode = assistantNode.getNextNode();

        }
        strReturn += "null"; // caso a lista esteja vazia ele retorna null.
        return strReturn;
    }



}
